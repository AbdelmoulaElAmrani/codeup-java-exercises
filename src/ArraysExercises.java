import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers)); // Arrray.toString is necessary
        // Iterate through the array and print out the name of each people in the array.
        Person p1 = new Person("john");
        Person p2 = new Person("johns");
        Person p3 = new Person("jane");
        Person[] people = new Person[3];
        //Create an array that holds 3 Person objects.
        // Assign a new instance of the people class to each element.
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;

//        for (Person p : people) {
//            System.out.println(p);
//        }
        //add a new person to the same array
        people = addPerson(people , new Person("k"));
        //for loop way of printing all the element inside the array
        for (int i = 0 ; i < people.length ;i++){
            System.out.println(people[i].getName()); //getname is the solution of...
        }
//      second way of printing all the element inside the array
                for (Person p : people) {
            System.out.println(p.getName());
        }


    }





    public static Person[] addPerson(Person[] oldArray, Person newPerson) {

        Person[] newArray = new Person[oldArray.length+1];

        for (int i =0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[oldArray.length] = newPerson;

        return newArray;

    }



}
