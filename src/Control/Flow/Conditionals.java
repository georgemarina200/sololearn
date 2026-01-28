package Control.Flow;

public class Conditionals {
    public static void main(String[] args) {
//        int age = 24;
//        if (age >= 18){
//            System.out.println("Welcome");
//        }
        int time = 18;
        if (time < 20){
            System.out.println("Open");
        }
        int number = 8;
        if (number == 8){
            System.out.println("Bingo");
        }
//        int age = 30;
//        if (age < 16) {
//            System.out.println("Too Young");
//        } else {
//            System.out.println("welcome");
//        }
//        int x = 10;
//        int y = 5;
//        if (x > y){
//            System.out.println(x);
//        } else {
//            System.out.println(y);
//        }
//        int age = 25;
//        if (age > 0){
//            if (age > 16){
//                System.out.println("Welcome!");
//            } else {
//                System.out.println("Too Young");
//            }
//        } else {
//            System.out.println("Error");
//        }
        int x = 3;
        if (x > 2){
            if (x >= 5){
                x = 4;
            } else {
                x = 6;
            }
        } else {
            x = 8;
        }
        int age = 25;
        if (age <= 0) {
            System.out.println("Error");
        } else if (age <= 16) {
            System.out.println("Too Young");
        } else if (age < 100) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Really?");
        }
        int num = 2;
        if (num == 1){
            System.out.println("A");
        } else if (num == 2) {
            System.out.println("B");
        } else {
            System.out.println("something else");
        }
        double temp = 36.6;
        if (temp > 38){
            System.out.println("Alert");
        } else if (temp < 34) {
            System.out.println("Error");
        } else {
            System.out.println("OK");
        }
    }
}
