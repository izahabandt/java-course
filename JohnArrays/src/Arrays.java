
public class Arrays {
    public static void main(String[] args) {

        String[] cars = {"Toyota", "Honda", "Chevrolet", "Chrysler"};
        //[0][1][2][3]
        //cars[3] = "Toyota"; //tak overriduje element arrayu
        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++ ){
            System.out.println(cars[i]);
        }

        //to co wyzej tylko backwards:
        for (int i = cars.length - 1; i >=0; i-- ){
            System.out.println(cars[i]);
        }
        // for each loop - special form of for loop:

        for(String car : cars){
            System.out.println(car);
        }


    }
}
