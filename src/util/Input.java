package util;

import java.util.Scanner;

public class Input {



    private Scanner scanner;


    public Input(){
        scanner = new Scanner(System.in);
    }

    String getString(){
        String input = scanner.nextLine();
        return input;
    }
    boolean yesNo(){
        String answer = scanner.next();
        return (answer.equals("yes") || answer.equals("y"));
    }
    int getInt(int min, int max) {
        int input;
        do {
            input = scanner.nextInt();
        } while (input >= min && input <= max);
        return input;

    }
//    double getDouble(){
//
//    }
public  double getDouble(double min, double max) {
    double input;

    do {
        System.out.println("Enter double");
        input = scanner.nextDouble();
    } while (input >= min && input <= max);
    return input;

}


}
