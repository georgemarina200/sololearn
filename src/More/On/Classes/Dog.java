package More.On.Classes;

public class Dog implements Animal {

//    Dog() {
//        legs = 4;
//    }

    public void makeSound() {
        System.out.println("Woof");
    }
    public void eat() {
        System.out.println("omnomnom");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.makeSound();
    }
}
