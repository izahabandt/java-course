import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5};
        System.out.println(returnList(a));


    }


    public static List<Integer> returnList(int[] givenArray) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < givenArray.length; i++) {
            int result = 1;

            for (int j = 0; j < givenArray.length; j++) {
                if (j != i) {
                    result *= givenArray[j];
                }
            }

            resultList.add(result);
        }

        return resultList;
    }
}

