public class Cleaner extends Employee{
    
    String department;
    boolean sweeping; 

    public Cleaner(int employeeNumber, String name, double salary, String department, boolean sweeping){
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.sweeping = sweeping;
    }

    public void startSweeping(){
        this.sweeping = true;
    }

    public void stopSweeping(){
        this.sweeping = false;
    }


    @Override
    public String toString() {
        if (this.sweeping == true){
            return "Cleaner employee#: " + this.employeeNumber + " is sweeping";
        }
        else{
            return "Cleaner employee#: " + this.employeeNumber + " is not sweeping";
        }
    }

}
