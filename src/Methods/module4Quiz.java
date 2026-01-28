package Methods;

public class module4Quiz {

    public int max(int a) {
        int result = a * a;
        return result;
    }

    static int fact(int num) {
        int res = 1;
        for (int x = 1; x <=num; x++){
            res *= x;
        }
        return res;
    }

    static void check (String name, int age) {
        if (age > 17) {
            System.out.println(name);
        } else {
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {

    }
}
