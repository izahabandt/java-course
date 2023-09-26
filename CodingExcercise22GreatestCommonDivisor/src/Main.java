//Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//
//If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//
//The method should return the greatest common divisor of the two numbers (int).
//
//The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).


public class Main {
    public static void main(String[] args) {

        getGreatestCommonDivisor(12,20);
        getGreatestCommonDivisor(3,18);
        getGreatestCommonDivisor(12,13);

    }
    public static int getGreatestCommonDivisor(int first, int second) {

        if (first >= 10 && second >= 10) {

            int min = Math.min(first, second);

            for (int i = min; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    System.out.println("The greatest common divisor is " + i);
                    return i;
                }
            }

            System.out.println("There's no common divisor");
            return -1;

        }
        return -1;
    }
}


