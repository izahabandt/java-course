public class Main {

    public static void main(String[] args) {


        Dog myDog = new Dog();
        myDog.setName("John");
        myDog.setAge(5);


        Dog yourDog = myDog;
        yourDog.setName("John");
        yourDog.setAge(7);


        if(myDog.equals(45)){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }


    }
}
