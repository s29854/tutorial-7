public final class Manager extends Employee{

    private double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName,
                   double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager with last name " +lastName+ " and age " +getAge()+ " has salary " +getSalary();
    }
}
