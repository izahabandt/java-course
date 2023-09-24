import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int counter = 1;// liczba cyfr które wpisuje użytkownik, moża też zaczą od 0
        double sum = 0;// suma cyfr, które wpisuje użytkownik

        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");//wyskakuje nam linia w ktorej jest napisane Enter number #1:
            String nextNumber = scanner.nextLine();//przeskakuje do niższej linijki, gdzie wpisujemy cyfrę
            try {
                //int number = Integer.parseInt(nextNumber); zamiast inta robimy double
                double number = Double.parseDouble(nextNumber);
                counter++;//dodaje, żeby pojawiało się Enter number 1, Enter number 2 itd.
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");// jesli input nie spełni wymagań, to nie przejdzie do lnijek 17 i 18
            }
        }

        System.out.println("The sum of the 5 numbers = " + sum);
    }
}
