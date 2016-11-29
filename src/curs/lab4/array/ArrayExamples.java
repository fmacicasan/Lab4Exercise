package curs.lab4.array;

/**
 * @author flo
 * @since 29/11/2016.
 */
public class ArrayExamples {

    public static void main(String[] args) {

        int[] arrayInt = {0, 1, 2, 3, 7, 9, 11, 13, 15};

        int[] squares = new int[arrayInt.length];
        System.out.println("Len:"+arrayInt.length);
        for( int i = 0; i < arrayInt.length; i++) {
            squares[i] = arrayInt[i] * arrayInt[i];
        }
        for(int square : squares) {
            System.out.println(square);
        }

    }
}
