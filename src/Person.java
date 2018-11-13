public class Person {

    public static void main(String[] args) {
//        Person person1 = new Person("joe");
//        System.out.println(person1.name);


    }

    private String name ;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello %n",this.name);
    }


}
