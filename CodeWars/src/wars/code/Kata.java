package wars.code;

import java.util.ArrayList;
import java.util.List;

public class Kata{
    public static int[] countBy(int x, int n){

        List<Integer> codewars = new ArrayList<>();
        int i;

        for(i = x; i <= n*x; i+=x){
            codewars.add(i);
        }
        int[] result = new int[codewars.size()];
        for (int j = 0; j < codewars.size(); j++) {
            result[j] = codewars.get(j);
        }
        return result;
    }

    public static void main(String[] args) {

System.out.println(countBy(1,5));
    }

}