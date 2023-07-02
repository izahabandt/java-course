import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);

        System.out.println(numbers);

        System.out.println(addUpToK(4, numbers));

    }
    public static boolean addUpToK(int k, List<Integer> listName) {
        List<Integer> anotherListName = new ArrayList<>();

        for (int num : listName) {
            int complement = k - num;
            if (anotherListName.contains(complement)) {
                return true;
            }
            anotherListName.add(num);
        }

        return false;
    }
}



