public class Rectangle {
    private double width, height;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return (width * 2) + (height * 2);
    }
}
