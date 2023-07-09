import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Elaine", 6));
        cats.add(new Cat("Elaine", 6));
        cats.add(new Cat("George", 4));
        cats.add(new Cat("Kramer", 9));

        List<Cat> olderCats = new ArrayList<>();

        List<Integer> catAges = cats.stream()
         //     .count()// number of elements
         //     .skip(2)//skips first two elements
         //     .peek(System.out::println) prints out each element of the list in a separate line
        //      .anyMatch(age -> age ==3);//checks if any element meets the condition
                .limit(2)//stops at the second object
                .filter(cat -> cat.getAge()>3)//filters by age
                .map(cat -> cat.getAge())//returns ages of the cats
                .sorted()
                .toList();
        //      .toArray()

            System.out.println(catAges);
            System.out.println(cats);
        }
    }

