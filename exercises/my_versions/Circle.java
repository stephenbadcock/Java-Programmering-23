public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double calculateCircumference() {
        return radius * 2 * Math.PI;
    }
}