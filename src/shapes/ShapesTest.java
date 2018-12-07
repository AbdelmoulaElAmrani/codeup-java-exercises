package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5 ,4);
//        Rectangle box2 = new Square(5
//        );
        Shape square = new Square(3);
        Shape newRectangle = new Rectangle(9,9);

        System.out.println(((Square) square).getArea());

//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }
}
