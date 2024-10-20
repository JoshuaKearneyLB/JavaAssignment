
public class Hospital{
    
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor(0, "Isaak", 3000, "Neurology");
        Nurse nurse1 = new Nurse(1, "Wilko", 4000, 5);
        Cleaner cleaner1 = new Cleaner(2, "Noah", 7000, "Childrens ward", false);
        
        //Setting attributes
        doctor1.setSalary(5000);
        nurse1.setNumberOfPatients(4);

        cleaner1.startSweeping();
        System.out.println(cleaner1.toString());
        cleaner1.stopSweeping();

        cleaner1.setSalary(1000);

    }

}