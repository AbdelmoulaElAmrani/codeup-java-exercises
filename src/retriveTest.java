import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class retriveTest {


    public static void main(String[] args) {



        Path p = Paths.get("src/grades","/retriveNames");
//        System.out.println(p);

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(lines);
//
        for (String l : lines) {
            System.out.println(l);
        }
        List<String> newNames = Arrays.asList("John", "Fred", "asdf");
        try {
            Files.write(p, newNames);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
