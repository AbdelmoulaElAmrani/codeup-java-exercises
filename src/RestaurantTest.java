public class RestaurantTest {

    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 90;
        dish.nameOfDish = "Barbacoa";
        dish.wouldRecommend = true;
        System.out.println(dish.costInCents);
        dish.eat();
    }
}


//        Create another class called RestaurantTest
//        Add a main method and inside the method...
//        1) instantiate a RestaurantDish object called "dish"
//        2) assign values creative to each of the properties
//        3) print out each of the property values
//        4) test the eat() method by calling it