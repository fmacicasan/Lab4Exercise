package curs.lab4.classes;

/**
 * @author flo
 * @since 29/11/2016.
 */
public class PersonExample {
    public static void main(String[] args) {
        Person florin = new Person("flo","last");

        for(int i=0 ;i< 10; i++) {
            System.out.println(florin.talk());
            System.out.println("Idea Count:" + Idea.getIdeaCount());
        }
    }
}
