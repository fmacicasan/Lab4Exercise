/**
 * @author flo
 * @since 29/11/2016.
 */
public class Idea {

    private String topic;

    public Idea() {
        System.out.println("I am the implicit constructor!");
    }

    public Idea(String topic) {
        this();
        this.topic = topic;
        System.out.println("Just created an idea about " + topic);
    }


}
