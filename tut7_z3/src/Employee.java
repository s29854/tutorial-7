import java.time.LocalDate;

public class Employee extends Person{

    protected int hireDate;
    protected String companyName;
    protected double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName,
                    double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }
    int getJobSeniority(){
        return LocalDate.now().getYear() - hireDate;
    }
    double getSalary(){
        return salary;
    }
}
