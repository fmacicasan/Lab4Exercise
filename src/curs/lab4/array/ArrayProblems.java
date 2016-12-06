package curs.lab4.array;

import java.util.Arrays;

/**
 * @author flo
 * @since 29/11/2016.
 */
public class ArrayProblems {
    public static void main(String[] args) {

//        getMax();
//        separateParity();
//        checkOrdered();
        sortAsceding();
    }

    private static void sortAsceding() {
        int[] intArray = {4,7,3,5,1,10};
        Arrays.sort(intArray);
        for(int elem : intArray) {
            System.out.println(elem);
        }
    }

    private static void checkOrdered() {
        int[] intArray = {1,2,4,7,61};
        boolean isOrdered = true;
        for(int i = 0; isOrdered && i < intArray.length - 1;i++) {
            if(intArray[i] >= intArray[i+1]) {
                isOrdered = false;
            }
        }
        if(isOrdered) {
            System.out.println("Is Ordered");
        } else {
            System.out.println("Neordonat!");
        }

    }

    private static void separateParity() {
        int[] intArray = {9, 7, 14, 2, 5};
        int[] evenArray = new int[intArray.length];
        int[] oddArray = new int[intArray.length];
        int indexOdd = 0, indexEven = 0;
        for(int elem : intArray) {
            if(elem % 2 == 0) {
                evenArray[indexEven] = elem;
                indexEven++;
            } else {
                oddArray[indexOdd] = elem;
                indexOdd++;
            }
        }
        System.out.println("Even");
        for(int even : evenArray) {
            System.out.println(even);
        }
        System.out.println("Odd");
        for(int odd : oddArray) {
            System.out.println(odd);
        }
    }

    private static void getMax() {
        int[] intArray = {9, 7, 14, 2, 5};
        int max = intArray[0];

        for(int i=1; i< intArray.length; i++) {
            if(max < intArray[i]) {
                max = intArray[i];
            }
        }
        System.out.println(max);
    }
}
