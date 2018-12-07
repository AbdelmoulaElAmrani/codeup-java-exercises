package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>() ;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
            grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int gradesAvrrage = 0;
        for (int i = 0  ; i < grades.size() ; i++){
            gradesAvrrage += grades.get(i);
        }
        return (double) gradesAvrrage / grades.size();
    }

    public static void main(String[] args) {

        Student s1 = new Student("jo");

        s1.addGrade(90);
        s1.addGrade(80);
        s1.addGrade(95);
        System.out.println(s1.grades);
        System.out.println(s1.getGradeAverage());

//        System.out.println(s1.getName());
//        s1.addGrade(33);
//        System.out.println(s1.grade);

    }
}
