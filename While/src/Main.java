public class Main {

    public static void main(String[] args) {


        //     for(int i = 1; i<= 5; i++){
        //     System.out.prinln(i);
        //     }

        //     int j = 1;
        //     while (j<= 5){
        //     System.out.println(j);
        //     j++;
        //     }
        //     }

        //     int j = 1;
        //     while (true) {
        //     if (j>5){
        //     break;
        //     }
        //     System.out.println(j);
        //     j++;
        //     }


        //     int j = 1;
        //     boolean isReady = false;
        //     do {
        //     if (j>5) {
        //     break;
        //     }
        //     System.out.println(j);
        //     j++;
        //     isReady = (j > 0);
        //     } while (isReady);

        // cztery powyższe sposoby dadzą ten sam efekt



        int number = 0;
        while (number < 50) {
            number += 5;
            if(number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
        }

        // w powyższym sposobie pojawia się "continue"
    }

