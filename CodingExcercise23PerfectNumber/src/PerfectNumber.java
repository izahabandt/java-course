public class PerfectNumber {

    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(15);
    }
    public static boolean isPerfectNumber(int number){
        if(number >=1){
            int sum = 0;
            for(int i = 1; i < number; i++){
                if(number%i==0){
                   sum += i;
                }
            }
            if(sum==number){
                System.out.println(number + " is a perfect number");
                return true;
            }
            System.out.println(number + " is not a perfect number");
            return false;
        }
        System.out.println(number + " is not a perfect number");
        return false;
    }
}
