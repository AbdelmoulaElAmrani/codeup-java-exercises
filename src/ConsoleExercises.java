import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately $%.2f" ,pi );

        Scanner sc = new Scanner(System.in);

        //store int
//        System.out.print("Please enter a Number: ");
//        int userinput = sc.nextInt();
//        System.out.println(userinput);

        //store three words in separate var
//        System.out.println("please enter 3 words: ");
//        String first = sc.next();
//        String second = sc.next();
//        String third = sc.next();
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
        //capture line
//        System.out.println("please enter a sentence: ");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        System.out.println("Enter w / H");
        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());

        int area = width * length ;
        System.out.printf("the Area is %d", area );

        int perimeter = (width * 2)+(length *2);


        System.out.printf("the perimeter is %d", perimeter );

//        System.out.println("the Area is "+area + "the perimeter is "+ perimeter);



    }
    }
