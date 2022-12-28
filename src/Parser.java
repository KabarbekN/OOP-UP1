public class Parser {
    public static Point parsePoint(String str){
        String[] lines = str.split(", ");
        Point points = new Point(Double.parseDouble(lines[0]), Double.parseDouble(lines[1]));
        return  points;
    }
}
