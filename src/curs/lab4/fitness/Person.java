package curs.lab4.fitness;

/**
 * @author flo
 * @since 29/11/2016.
 */
public class Person {

    private static int index = 0;

    private int id;
    private String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
        this.id = index;
        index++;
    }

    public String print() {
        return id + firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }
}
