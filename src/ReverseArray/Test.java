import java.util.Arrays;

public class Test {

    private static void reverse(int[] array){
        int temp;
        int endIndex;

        System.out.println("array = " + Arrays.toString(array));
        for (int i = 0; i < (array.length)/2 ; i++){
            endIndex = array.length - 1 - i;
            temp = array[i];
            array[i] = array[endIndex];
            array[endIndex] = temp;
        }
        System.out.println("reverse array = " + Arrays.toString(array));
    }

}













