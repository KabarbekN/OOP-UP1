import java.util.Arrays;

public class Shape {
    private int size = 1;
    private int counter = 0;
    private Point[] points = new Point[size];
    public void addPoint(Point s){
        if (counter == size){
            increaseBuffer();
        }
        points[counter] = s;
        counter++;
    }
    public void increaseBuffer(){
        size *= 2;
        System.out.println("Size was expanded double times ");
        Point[] pointers = new Point[size];
        for (int i = 0; i < counter; i++){
            pointers[i] = points[i];
        }
        points = pointers;
    }
    public String getPoints(){
        return Arrays.toString(points);
    }
    public double calculatePerimeter(){
        double perimeter = 0;
        for (int i = 0; i < counter -1; i++){
            perimeter += points[i].distance(points[i+1]) ;
        }
        perimeter += points[counter-1].distance(points[0]) ;
        return perimeter;
    }
    public double longestSide(){
        double max = 0;
        for (int i = 0; i < counter -1 ; i++){
            if (points[i].distance(points[i+1]) > max)
                max = points[i].distance(points[i+1]);
        }
        if (points[counter - 1].distance(points[0]) > max)
            max = points[counter - 1].distance(points[0]);
        return max;
    }
    public double averageLength(){
        return calculatePerimeter()/counter;
    }
    public void print(){
        for (int i = 0; i < counter; i++){
            System.out.println(points[i]);
        }
    }
}
