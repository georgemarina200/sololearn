package Control.Flow;

public class TheSwitchStatement {
    public static void main(String[] args) {
        int day = 2;
//        if (day == 1) {
//            System.out.println("monday");
//        } else if (day == 2) {
//            System.out.println("Tuesday");
//        } else if (day == 3) {
//            System.out.println("Wednesday");
//        }
        day = 5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
        int x = 2;
        switch (x){
            case 1: x = 2;
            case 2: x = 3;
            case 3: x = 4;
        }
        int a = 11; int b = 12; int c = 40;
        switch (a){
            case 40:
                System.out.println(b);
                break;
            default:
                System.out.println(c);
        }
        int item = 1;
        switch (item) {
            case 1:
                System.out.println("Coffee");
                break;
            case 2:
                System.out.println("Tea");
                break;
            default:
                System.out.println("Try again");
        }
    }
}
