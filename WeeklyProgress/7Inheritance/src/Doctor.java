public class Doctor extends Employee{
    
    String specialism;

    
    public Doctor(int employeeNumber, String name, double salary, String specialism){
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
        this.specialism = specialism;
    }

    public String getSpecialism(String specialism){
        return this.specialism;
    }

    @Override
    public String toString() {
       return("Doctor employee#: " + this.employeeNumber + " Specialises in " + this.specialism);
    }
}
