public class SwitchChallenge {

    public static void main(String[] args) {

        char switchValue = 'A';
        switch (switchValue) {
            case 'A':
                System.out.println("A = Able");
                break;
            case 'B':
                System.out.println("B = Baker");
                break;
            case 'C':
                System.out.println("C = Charlie");
                break;
            case 'D':
                System.out.println("D = ADog");
                break;
            case 'E':
                System.out.println("E = Easy");
                break;
            default:
                System.out.println(switchValue + " not found");
                break;

        }
    }
}
