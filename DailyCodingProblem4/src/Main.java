import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer [] array = {1};
        System.out.println("The first missing positive is " + missingPositive(array));
    }

    public static Integer missingPositive(Integer [] givenArray){

        System.out.println("Given an array" + Arrays.toString(givenArray));

        for(int i=0; i < givenArray.length; i++){
            if(givenArray[i] < 0){
                givenArray[i] = 0;
            }
        }

        Set<Integer> targetSet = new HashSet<Integer>(Arrays.asList(givenArray));

        Integer[] uniqueValuesArray = targetSet.toArray(new Integer[0]);

        Arrays.sort(uniqueValuesArray);

        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(uniqueValuesArray));

        Integer missingPositive = 1;
        ArrayList<Integer> newArrayList = new ArrayList<>();

        if(arrayList.size() > 1 && arrayList.get(0)==0) {
            arrayList.remove(0);
        } else if(arrayList.size() == 1 && arrayList.get(0)==0){
            missingPositive = 1;

        }else if(arrayList.get(0)>1){
            missingPositive = 1;
        }else{
            for(int i=0; i < uniqueValuesArray.length; i++){
                if ((uniqueValuesArray[i] - i) == 1) {
                    newArrayList.add(uniqueValuesArray[i]);
                }
                missingPositive = (newArrayList.get(newArrayList.size()-1)) + 1;

            }
          }
        return missingPositive;
    }
}
