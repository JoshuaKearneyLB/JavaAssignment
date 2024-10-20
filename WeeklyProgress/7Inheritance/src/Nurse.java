public class Nurse extends Employee{

    int numberOfPatients;

    public Nurse(int employeeNumber, String name, double salary, int noOfPatients){
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
        this.numberOfPatients = noOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    @Override
    public String toString() {
        return "Nurse: " + employeeNumber + " is called " 
                + name + " and have "
                + numberOfPatients + " number of patients currently on salary: "
                + salary;
                
    }

}
