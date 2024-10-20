public class Bulb {
    
    boolean status;

    public Bulb(){
        this.status = false;
    }

    public Bulb(boolean status){
        this.status = status;
    }

    public void turnOn(){
        this.status = true;
    }

    public void turnOff(){
        this.status = false;
    }

    @Override
    public String toString(){

        if (this.status == true){
            return "on";
        }
        else{
            return "off";
        }
    }
}
