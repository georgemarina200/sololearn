package Methods;

public class ReturningFromMethods {

//    static void perc(double num, int percentage) {
//        double res = num * percentage / 100;
//        System.out.println(res);
//    }

    static double perc(double num, int percentage) {
        double res = num*percentage/100;
        return res;
    }

    static int sum(int x, int y) {
        int res = x + y;
        return res;
    }
    static boolean check(int grade) {
        if (grade >= 70) {
            return true;
        } else {
            return false;
        }
    }

    static boolean checkAge(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        double x = perc(530,23);
//        System.out.println("Result is: " + x);
        int n1 = 33;
        int n2 = 12;
        int n = sum(n1,n2);
        int x = 89;
        if (check(x) == true) {
            System.out.println("Congrats");
        }
    }
}
