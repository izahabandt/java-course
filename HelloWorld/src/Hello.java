public class Hello {

    public static void main(String[] args) {
        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myTotalDouble = (myDouble + mySecondDouble) * 100.00d;
        System.out.println("My values total = " + myTotalDouble);

        double myModulo = myTotalDouble % 40.00d;
        System.out.println ("TheRemainder = " + myModulo);

        boolean moduloIsZero = (myModulo == 0) ? true : false;
        System.out.println("moduloIsZero = " + moduloIsZero);

        if (moduloIsZero = false) {
            System.out.print("Got some remainder");  
        }


    }
}
