package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    protected double length;
    protected double width;
//
//    public Rectangle(double length ,double width) {
//        this.length = length;
//        this.width = width;
//    }

    public Rectangle(double length, double width) {
        super(length, width);
//        this.length = length1;
//        this.width = width1;
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public void setLength(double length) {

    }

    //area = length x width
    public double getArea() {
        double area = length * width;
        return area;
    }


//    perimeter = 2 x length + 2 x width
    public double getPerimeter() {
        double circumference = (2 * length) + ( 2 * width);
        return circumference;
    }
}
