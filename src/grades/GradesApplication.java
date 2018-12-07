package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String , Student> students= new HashMap<>();
        Student student1 = new Student("Ronald");
        Student student2 = new Student("Bell");
        Student student3 = new Student("Joseph");

        student1.addGrade(90);
        student1.addGrade(94);
        student1.addGrade(98);

        student2.addGrade(50);
        student2.addGrade(44);
        student2.addGrade(100);

        student3.addGrade(20);
        student3.addGrade(89);
        student3.addGrade(91);

        students.put("RO",student1);
        students.put("be",student2);
        students.put("jo", student3);

//        System.out.println(students.get("jo").getGradeAverage());
    }
}
