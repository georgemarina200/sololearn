package Control.Flow;

public class MultipleConditions {
    public static void main(String[] args) {
        int age = 42;
        int money = 4000;
        int height = 100;
        String county = "US";
        if (age > 18 && age < 50) {
            System.out.println("Welcome!");
        }
        if (age > 21 && money > 500) {
            System.out.println("Welcome!");
        }
        if (age > 18 || height > 150) {
            System.out.println("Welcome!");
        }
        int a = 11; int b = 12;
        int c = 40;
        if (a > 100 || b > 3){
            System.out.println(a);
        } else {
            System.out.println(c);
        }
        if (!(age > 18)) {
            System.out.println("Too Young");
        } else {
            System.out.println("welcome");
        }
        if ((county == "US" || county == "GB") && (age > 0 && age < 100)) {
            System.out.println("Allowed");
        }
        int temp = 37;
        if (temp >= 36 && temp <= 38) {
            System.out.println("OK");
        } else {
            System.out.println("Alert");
        }
    }
}
