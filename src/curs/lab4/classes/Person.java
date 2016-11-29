package curs.lab4.classes;

import java.util.Date;
import curs.lab4.classes.ideas.*;

/**
 * @author flo
 * @since 29/11/2016.
 */
public class Person {
    private String firstName;
    private String lastName;
    private char gender;
    private Date dateOfBirth;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private Idea think() {
        return new Idea(this.firstName);
    }

    private String verbalise(Idea idea) {
        // verbalise an idea
        return idea.toString();
    }

    public String talk() {
        Idea idea = think();
        return verbalise(idea);
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
