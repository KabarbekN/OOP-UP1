public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        setPoint(x,y);
    }
    public void setPoint(double x, double y){
        setX(x);
        setY(y);
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY() {
        return y;
    }
    public void getPoint(){
        System.out.print(getX() + " ") ;
        System.out.println(getY());
    }
    public double distance(Point point2){
        return Math.sqrt( Math.pow( (point2.getX()-x) , 2 ) + Math.pow( (point2.getY()-y) , 2) );
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
