public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance (){
        return distance(0,0);
    }
    public double distance (int x, int y) {
        return Math.sqrt(Math.pow(x - getX(),2) + Math.pow(y - getY(),2));
    }
    public double distance (Point otherPoint) {
        return distance(otherPoint.getX(), otherPoint.getY());
    }

    public void valueX (Point itdoesntmatter) {
        System.out.println(itdoesntmatter.x);
    }

    public void iloczyn (Point jakis) {
        System.out.println(jakis.x*x);
    }
}
