import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

import uk.ac.leedsbeckett.oop.OOPGraphics;

public class MyTurtleGraphics extends OOPGraphics
{       


        public MyTurtleGraphics()
        {
                JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
                MainFrame.setLayout(new FlowLayout());  //not strictly necessary
                MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
                MainFrame.pack();                                               //set the frame to a size we can see
                MainFrame.setVisible(true);                             //now display it
                
                //call the OOPGraphics about method to display version information.
        }



        public void processCommand(String input)      //this method must be provided because OOPGraphics will call it when it's JTextField is used
        {       

                //String parameter is the text typed into the OOPGraphics JTextfield
                //lands here if return was pressed or "ok" JButton clicked
                
                System.out.println(input);
                String[] command = input.split(" ");

                if(!isValidCommand(command[0])){
                        displayMessage("Invalid Command");
                }
                else{
                        saveCommand("PreviousCommands.txt", input);
                        switch(command[0]) {
                                case "about":
                                        about();
                                case "pendown":
                                        penDown();
                                        break;
                                case "penup":
                                        penUp();
                                        break;
                                case "turnleft":
                                        if (validateTurnCommand(command) == false){
                                                break;
                                        }
                                        else{
                                                turnLeft(command[1]);
                                                break;
                                        }
                                case "turnright":
                                        if (validateTurnCommand(command) == false){
                                                break;
                                        }
                                        else{
                                                turnRight(command[1]);
                                                break;
                                        }
                                case "forward":
                                        if (validateForwardCommand(command) == false){
                                                break;
                                        }
                                        else{
                                                forward(command[1]);
                                                break;
                                        }
                                case "black":
                                        setPenColour(new Color(0,0,0));
                                        break;
                                case "green":
                                        setPenColour(new Color(0,255,0));
                                        break;
                                case "red":
                                        setPenColour(new Color(255,0,0));
                                        break;
                                case "white":
                                        setPenColour(new Color(255,255,255));
                                        break;
                                case "reset":
                                        reset();
                                        break;
                                case "clear":
                                        clear();
                                        break;
                                case "save":
                                        saveImage();
                                        break;
                                case "load":
                                        loadImage();
                                        break;
                                case "ldcommands":
                                        runPreviousCommands("PreviousCommands.txt");
                                        break;
                                case "square":
                                        square(command[1]);
                                        break;
                                case "pen":
                                        if (validateColourInput(command[1]) == false || validateColourInput(command[2]) == false || validateColourInput(command[3]) == false){
                                                displayMessage("RGB colours must be between 0 and 255");
                                                break;
                                        }
                                        else{
                                                int r = 0,g = 0,b = 0;
                                                try{
                                                        r = Integer.parseInt(command[1]);
                                                        g = Integer.parseInt(command[2]);
                                                        b = Integer.parseInt(command[3]);
                                                }
                                                catch(Exception e){
                                                        System.out.println(e);
                                                }
                                                pen(r, g, b);
                                                break;
                                        }
                                case "penwidth":
                                        penwidth(Integer.parseInt(command[1]));
                                        break;

                                case "triangle":
                                        triangle(command[1]);
                                        break;
                                }
                        }
                }



        private void saveCommand(String file, String input){

                try{
                        FileWriter fw = new FileWriter(file, true);
                        fw.append(input + "\n");
                        fw.close();
                }
                catch(IOException e){}
        }


        private void runPreviousCommands(String file){

                try{

                        BufferedReader br = new BufferedReader(new FileReader(file));
                        String line;

                        while((line = br.readLine()) != null){
                                if(!line.equalsIgnoreCase("ldcommands")){
                                        processCommand(line);
                                }
                                else{
                                        break;
                                }
                        }

                        br.close();
                }
                catch(IOException e){}                
        }


        private boolean validateTurnCommand(String[] command){

                if(command.length < 2){
                        displayMessage("Missing parameter!");
                        return false;
                }
                else if(command.length > 2){
                        displayMessage("Too many parameters!");
                        return false;
                }
                else{
                        int turnamount = 0;

                        try{
                              turnamount = Integer.parseInt(command[1]);  
                        }
                        catch(NumberFormatException e){
                                displayMessage("Must be an integer");
                                return false;
                        }
                                
                        if((turnamount) < 0){
                                displayMessage("Must be greater than 0");
                                return false;
                        }   

                        return true;
                }
        }


        private boolean validateForwardCommand(String[] command){

                if(command.length < 2){
                        displayMessage("Missing parameter!");
                        return false;
                }
                else if(command.length > 2){
                        displayMessage("Too many parameters!");
                        return false;
                }
                else{
                        int distance = 0;
                        try{
                              distance = Integer.parseInt(command[1]);  
                        }
                        catch(NumberFormatException e){
                                displayMessage("Distance must be an integer");
                                return false;
                        }
                                
                        if((distance) < 0){
                                displayMessage("Distance must be greater than 0");
                                return false;
                        }   
                        else if(distance > 750){
                                displayMessage("Cannot pass excessivley large numbers");
                                return false;
                        }
                        else{

                            return true;    
                        }
                }
        }


        private boolean isValidCommand(String string) {

                final String[] VALIDCOMMANDS = {"penup", "pendown", "turnleft", "turnright", "forward", "backward", "black",
                "green", "red", "white", "reset", "clear", "save", "load", "ldcommands", "about", "square", "pen", "penwidth",
                "triangle"};

                for (String v : VALIDCOMMANDS){
                        if (v.equalsIgnoreCase(string)){
                                return true;
                        }
                }

                return false;
        }


        public void saveImage(){
                try{
                        BufferedImage bufImg = getBufferedImage();
                        File outputfile = new File("saved.png");
                        ImageIO.write(bufImg, "png", outputfile);
                }
                catch(IOException e){
                        displayMessage("Cannot save image");
                }
        }


        public void loadImage(){

                //Pull image from a save file
                // set the current buffer image to saved image

                try{
                     File imagefile = new File("saved.png");
                     BufferedImage bufimg = ImageIO.read(imagefile);  
                     setBufferedImage(bufimg); 
                }
                catch(IOException e){
                        displayMessage("Could not load image");
                        System.out.println(e);
                }
        }


        @Override
        public void about() {

                Graphics2D graphicscreen = getGraphics2DContext(); 
                int X = getWidth() / 2;
                int Y = getHeight() / 2;

                super.about();
                graphicscreen.drawString("Joshua Kearney", X + 50, Y);
        }


        public void square(String length){
                for(int i = 0; i < 4; i++){
                        processCommand("forward " + length);
                        processCommand("turnright 90");
                }
        }

        
        public void pen(int red, int green, int blue){

                Color rbgColour = new Color(red, green, blue);
                setPenColour(rbgColour);
        }


        public boolean validateColourInput(String col) {

                if(Integer.parseInt(col) > 255 || Integer.parseInt(col) < 0){
                        
                        return false;
                }
                else{
                        return true;
                }
        }


        public void penwidth(int width){
                setStroke(width);
        }


        public void triangle(String length){
                for(int i = 0; i < 3; i++){
                        processCommand("forward " + length);
                        processCommand("turnright 120");       
                }
        }
}