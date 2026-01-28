package Control.Flow;

import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Name:" + name);
//        String nick = sc.nextLine();
//        int age = sc.nextInt();
//        int x = sc.nextInt();
//        System.out.println(x * 2);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Welcome: " + name);
        System.out.println("Age: " + age);

    }
}
