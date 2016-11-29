package curs.lab4.fitness;

import java.util.Scanner;

/**
 * @author flo
 * @since 29/11/2016.
 */
public class FitnessApp {

    private int index = 0;
    private Person[] persons = new Person[10];

    public void addPerson(Person p) {
        persons[index] = p;
        index++;
    }

    public static void main(String[] args) {

        System.out.println("Welcome!");
        FitnessApp fitnessApp = new FitnessApp();
        String option;
        do {
            System.out.println("Menu:");
            System.out.println("For Create press: c");
            System.out.println("For Print press: p");
            System.out.println("For exit press: x");
            System.out.println("For read press: r");

            option = readStringFromKeyboard();

            switch (option) {
                case "c": fitnessApp.addPerson(createPerson()); break;
                case "p": fitnessApp.printPerson();break;
                case "r": fitnessApp.findById(readById()); break;
                case "x":
                    System.out.println("Thanks! Stopping.");break;
                default:
                    System.exit(0);
            }
        } while(!"x".equals(option));


    }

    private void findById(int id) {
        boolean found = false;
        for(int i=0;i<index;i++) {
            if(persons[i].getId() == id) {
                found = true;
                System.out.println(persons[i].print());
            }
        }
        if(!found) {
            System.out.println("Not in fitness app");
        }
    }

    private static int readById() {
        System.out.println("Whats the iD?");
        int readId = readIntFromKeyboard();
        return readId;
    }

    private void printPerson() {
        for(int i=0;i<index;i++) {
            System.out.println(persons[i].print());
        }
    }

    private static Person createPerson() {
        System.out.println("What's the firstname?");
        String firstName = readStringFromKeyboard();
        return new Person(firstName);
    }

    public static String readStringFromKeyboard() {
        return new Scanner(System.in).nextLine();
    }

    public static int readIntFromKeyboard() {
        return Integer.valueOf(readStringFromKeyboard());
    }

}
