package Methods;

public class MethodParameters {

    static void welcome(String name, int age) {
        System.out.println("Welcome, " + name);
        System.out.println("Your age: " + age);
    }

    static void doubleNum (int num) {
        System.out.println(num * 2);
    }

    static void sum (int a, int b){
        System.out.println(a + b);
    }

    static void perc (double num, int percentage){
        double res = num * percentage / 100;
        System.out.println(res);
    }

    static void demo(int x, int y) {
        if(x<y) {
            System.out.println(x+y);
        } else {
            System.out.println(x%y);
        }
    }

    static void area(double w, double h) {
        double res = w * h;
        System.out.println(res);
    }

    public static void main(String[] args) {
        welcome("James", 42);
        welcome("Amy", 25);
        doubleNum(42);
        int x = 8;
        int y = 11;
        sum(x, y);
        perc(530,23);
        demo(8,3);
    }
}
