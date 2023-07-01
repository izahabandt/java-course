public class ExceptionHandling {

    public static void main(String[] args) {

        printInt("hjvkb");
        //printInt("8");
        System.out.println("End of the program");
    }

    private static void printInt(String numberString){

        try {
            int myInt = Integer.parseInt(numberString);
            System.out.println(myInt);
        }
        //catch (NumberFormatException | NullPointerException e) - to catch either NumberFormatException or NullPointerException
        catch (Exception e){
        //   e.printStackTrace();
            System.out.println("Caught a number format exception");
        } finally {
            System.out.println("Finally");
        }
    }
}

