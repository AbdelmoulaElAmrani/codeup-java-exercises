import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
    Random random = new Random();
        int nounsRandom = random.nextInt(9);
        int adjRandom = random.nextInt(9);

        System.out.println(adjectives[adjRandom]);
        System.out.println(nouns[nounsRandom]);
    }
    public static String[] adjectives = {"agreeable",
            "brave",
            "calm",
            "delightful",
            "eager",
            "faithful",
            "gentle",
            "happy"
    };
    public static String[] nouns ={
            "area",
            "book",
            "business",
            "child",
            "day",
            "fact",
            "family",
            "government",
            "group",
            "man"
    };


}
