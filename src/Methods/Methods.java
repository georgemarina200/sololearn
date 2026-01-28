package Methods;

public class Methods {

    static void welcome() {
        System.out.println("Welcome");
        System.out.println("I am a method");
        System.out.println("End of method");
    }

    static void login() {
        System.out.println("Login");
    }

    static void shoot() {
        System.out.println("boom");
    }

    public static void main(String[] args) {
        welcome();
        welcome();
        welcome();
        login();
        shoot();
        shoot();
    }
}
