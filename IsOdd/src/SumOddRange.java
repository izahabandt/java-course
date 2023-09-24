public class SumOddRange {
    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));

    }

    public static int sumOdd(int start, int end){

        // najpierw ify walidujące odpowiednie możliwości
        // następnie for tylko dla tych, które są odpowiednie

        int sum = 0;
        if((end >= start) && (end > 0) && (start > 0)) {

            for (int number = start; number <= end; number++) {
                if ((isOdd(number) == true)) {
                    sum += number;
                }
            }
            return sum;
        }else{
            return -1;
        }
    }



    public static boolean isOdd(int value){

        if(value <= 0){
            return false;
        }

        if(value% 2 == 0){
            return false;
        }
        return true;
    }

}
