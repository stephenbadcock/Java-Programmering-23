import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        double circleArea, circleCircumference, rectangleArea, rectanglePerimeter;

        Scanner sc = new Scanner(System.in);

        Circle myCircle = new Circle();

        System.out.print("Välj cirkelns radie (cm): ");
        myCircle.setRadius(sc.nextDouble());
        System.out.println();

        circleArea = myCircle.calculateArea();
        System.out.print("En cirkel med radien " + myCircle.getRadius() + " cm har arean " + circleArea + " cm2");
        System.out.println();

        circleCircumference = myCircle.calculateCircumference();
        System.out.println("En cirkel med radien " + myCircle.getRadius() + " cm har omkretsen " + circleCircumference + " cm");
        System.out.println();

        Rectangle myRectangle = new Rectangle();

        System.out.print("Välj rektangelns bredd (cm): ");
        myRectangle.setWidth(sc.nextDouble());
        System.out.print("Välj rektangelns höjd (cm): ");
        myRectangle.setHeight(sc.nextDouble());
        System.out.println();

        sc.close();
        
        rectangleArea = myRectangle.calculateArea();
        System.out.print("En rektangel med sidorna " + myRectangle.getWidth() + " cm och " + myRectangle.getHeight() + " cm");
        System.out.println(" har arean " + rectangleArea + " cm2");

        rectanglePerimeter = myRectangle.calculatePerimeter();
        System.out.print("En rektangel med sidorna " + myRectangle.getWidth() + " cm och " + myRectangle.getHeight() + " cm");
        System.out.println(" har omkretsen " + rectanglePerimeter + " cm");
    }
}
