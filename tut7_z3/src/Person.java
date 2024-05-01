import java.time.LocalDate;

abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }
    int getAge(){
        return LocalDate.now().getYear() - birthdayYear;
    }

}
