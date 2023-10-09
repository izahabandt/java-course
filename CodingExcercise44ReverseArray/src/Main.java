import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    public static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int arrayReversed[] = new int[array.length];
        int j =0;
        for(int i = array.length-1; i >= 0; i--){
            arrayReversed[j] = array[i];
            j++;
        }
        System.out.println("Reversed array = " + Arrays.toString(arrayReversed));
    }
}
