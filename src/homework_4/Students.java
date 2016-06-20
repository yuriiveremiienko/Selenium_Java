package homework_4;


public class Students extends Person{

    String subject;
    boolean inGroup;

    Students(String firstname, String lastname, String subject, boolean inGroup) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
        this.inGroup = inGroup;
    }

}
