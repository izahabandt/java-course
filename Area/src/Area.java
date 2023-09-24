public class Area {

    public static void main(String[] args) {

        System.out.println(area(5,5));
        System.out.println(area(5));

    }

    public static double area(double radius){

        if(radius<0){
            return -1;
        }


        double areaOfACircle = Math.PI*radius*radius;

        return areaOfACircle;
    }

    public static double area(double x, double y){

        if(x<0 || y<0){
            return -1;
        }

        double areaOfARectangle = y*x;

        return areaOfARectangle;
    }

}

