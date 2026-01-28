package Control.Flow;
import java.util.Scanner;
public class Module2Quiz {
    public static void main(String[] args) {
        int grade = 80;
        if (grade > 70) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 5) {
            System.out.println("Correct");
        }
        for (int x = 1; x <= 100; x++) {
            if (x == 42) {
                continue;
            }
            System.out.println(x);
        }
        int x = 8;
        while (x > 0) {
            System.out.println(x);
            x -= 3;
        }
        int position = 1;
        switch (position) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
        }
    }
}
