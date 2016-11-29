/**
 * @author flo
 * @since 29/11/2016.
 */
public class ArrayProblems {
    public static void main(String[] args) {

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
