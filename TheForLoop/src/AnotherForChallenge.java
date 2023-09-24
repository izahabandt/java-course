public class AnotherForChallenge {

    public static void main(String[] args) {



//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT") + " a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT") + " a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT") + " a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT") + " a prime number");
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT") + " a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT") + " a prime number");

        int count = 0;
            for (int i = 10; i <= 50; i++){

                if(isPrime(i)) {
                    System.out.println("number " + i + " is a prime number");
                    count++;
                    if(count==3){
                        System.out.println("Found 3 - Exiting for loop");
                        break;}
                }
        }

    }

    public static boolean isPrime(int wholeNumber){

        if(wholeNumber <= 2) {
            return (wholeNumber == 2);

            // liczby mniejsze lub równe 2 porównujemy do 2; jeżeli wholeNumber == 2
            // jest to liczba pierwsza, czyli return true,a dla reszty return false

        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
            // sprawdzamy wszystkie liczby większe od 2, czy dzielą się przez jakąkolwiek liczbę mniejszą od nich samych i większą lub równą 2.
            // jeżeli reszta z dzielenia jest równa 0, return false (to oznacza, że liczba dzieli się przez coś oprócz 1 i siebie samej)
            // jeżeli liczba nie spelnia warunku, return true
        }

        return true;
    }
}
