import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {

        String meTalking = sc.nextLine();
//        System.out.println(meTalking);

         if (meTalking.endsWith("?")){
            System.out.println("Sure");
        }
         if (meTalking.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }
        if (meTalking.length() <= -1){
            System.out.println("Fine. Be that way!");
        }
        if (meTalking.length() > 0 ){
            System.out.println("WHATEVER!");
        }
        }while (sc.hasNext());



    }
}
