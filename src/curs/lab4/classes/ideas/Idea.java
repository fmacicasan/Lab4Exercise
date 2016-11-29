package curs.lab4.classes.ideas;
/**
 * @author flo
 * @since 29/11/2016.
 */
public class Idea {

    private static int count = 0;

    public static int getIdeaCount() {
        return count;
    }

    private String topic;

    public Idea() {
        System.out.println("I am the implicit constructor!");
        count++;
    }

    public Idea(String topic) {
        this();
        this.topic = topic;
        System.out.println("Just created an idea about " + topic);
    }
}
