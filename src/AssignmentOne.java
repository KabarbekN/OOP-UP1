import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Which text file ypu want to parse?");
        System.out.println("Write the path to this file, like src/fille1.txt or src/file2.txt");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        Shape shape = new Shape();

        while (scan.hasNextLine()){
            String line = scan.nextLine();
            Point point = Parser.parsePoint(line);
            shape.addPoint(point);
        }
        shape.print();
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.longestSide());
        System.out.println(shape.averageLength());
        //Main barsik = new Main("Барсик", 10); //ошибка!
    }
}
