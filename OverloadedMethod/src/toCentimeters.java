public class toCentimeters {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,8));
    }

    public static double convertToCentimeters(int entireHeightInInches){
        double entireHeightInCm = entireHeightInInches*2.54;
        return entireHeightInCm;
    }
    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches){
        int onlyInches = (heightInFeet*12)+ remainingHeightInInches;
        double heightInCm = convertToCentimeters(onlyInches);
        return heightInCm;
    }
}
