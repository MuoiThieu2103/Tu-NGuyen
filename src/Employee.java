import javax.naming.CannotProceedException;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id,String firstName,String lastName,int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String firstName(){
        return firstName;
    }

    public String lastName(){
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary='" + salary +
                '}';
    }

    public int raiseSalary(int percent){
        return salary;
    }

    public String getName(){
        return firstName;
    }

    public int getAnnuaSalary(){
        return salary * 12;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
