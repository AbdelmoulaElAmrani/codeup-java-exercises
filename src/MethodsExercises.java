import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println("Enter a number between 1 and 10: ");
////
//        int userNum = sc.nextInt();
//        System.out.println(factorialOfNum(9));
//        randomNumGame();

    }


    public static int factorialOfNum(int num){
            if (num == 1) return 1;
        return num * factorialOfNum(num -1);
    }

//    public static long calculateFactorial(int num) {
//        int output = 1;
//        for (int i = 1; i <= num; i += 1) {
//            output *= i;
//        }
//        return output;
//    }
//    public static void userInteractionFactorial(Scanner sc) {
//        boolean willContinue;
//        String userChoice;
//        do {
//            System.out.println("Please enter an integer from 1 to 12");
//            int userInt = getInteger(1, 12);
//            System.out.println(calculateFactorial(userInt));
//            do {
//                System.out.println("Do you wish to continue? [y/n]: ");
//                userChoice = sc.next().trim();
//            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//            willContinue = userChoice.equalsIgnoreCase("y");
//        } while (willContinue);
//    }


//    public static double add ( double num1 , double num2){
//        return num1 + num2;
//    }
//    public static double sub ( double num1 , double num2){
//        return num1 - num2;
//    }
//    public static double multp ( double num1 , double num2){
//        return num1 * num2;
//    }
//    public static int multpLoop(int a, int b){
//        int result = 0 ;
//        for (int i = 0 ;i < a ; i++){
//            result += b;
//        }
//        return result;
//    }
//    public static double div ( double num1 , int num2){
//        return num1 / num2;
//    }
//    public static int mod ( int num1 , int num2){
//        return num1 % num2;
//    }
//
//
//    //Game Development 101
//    public static void randomNumGame(){
//      Scanner sc = new  Scanner(System.in);
//
//    int random =  (int )(Math.random() * 100 + 1);
//    int userGuess;
//        System.out.println("guess Num between 1 and 100!");
//      do {
//
//        userGuess = sc.nextInt();
//        if (random == userGuess) {
//            System.out.println("Daaamn , you GOT IT!");
//        }else if (userGuess < 0 || userGuess > 100){
//            System.out.println("I said between 1 and 100!");
//        }
//        else if (random < userGuess){
//            System.out.println("go LOWER");
//        }else if (random > userGuess){
//            System.out.println("Go higher");
//        }
//      }while (random != userGuess);
    }

//}
