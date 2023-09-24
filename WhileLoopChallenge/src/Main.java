public class Main {

    public static void main(String[] args){

        System.out.println(isEvenNumber(-10));

        // tym sprawdziłam, czy moja metoda działa

        int number = 4;
        int finishNumber = 20;
        int evencount = 0;
        int oddcount = 0;
        int sum = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddcount++;
                continue;
            }
            System.out.println("Even number " + number);
            sum+= number;
            evencount++;

            if(evencount>=5){
                break;
            }
        }
        System.out.println("Even sum " + sum);
        System.out.println("Even count " + evencount);
        System.out.println("Odd count " + oddcount);
 }



    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }

}

