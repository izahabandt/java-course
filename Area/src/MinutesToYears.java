public class MinutesToYears {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.print("Invalid Value");
        } else {
            long years = minutes / (60L * 24L * 365L);
            long days = (minutes/(60L*24)) % (365L);

            System.out.print(minutes + " min = " + years + " y and " + days + " d ");


        }
    }
}
