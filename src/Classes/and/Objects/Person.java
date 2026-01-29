package Classes.and.Objects;

public class Person {
    private int age;
    //    private double height;
    private String name;

    //    public Person (int myage) {
//        age = myage;
//    }
    Person() {
    }

    Person(String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public static void main(String[] args) {
        Person j = new Person("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
    }

    static void celebrateBirthday(Person p) {

        p.setAge(p.getAge() + 1);
    }
}

