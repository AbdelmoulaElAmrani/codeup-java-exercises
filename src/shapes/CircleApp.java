package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("enter reduis");
//not done yet
        Circle circle1 = new Circle(5);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());

    }
}