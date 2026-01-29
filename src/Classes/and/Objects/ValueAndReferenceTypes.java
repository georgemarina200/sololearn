package Classes.and.Objects;

public class ValueAndReferenceTypes {

    public static void main(String[] args) {
        int x = 4;
//        addOneTo(x);
        square(x);
        System.out.println(x);

    }

    static void addOneTo(int num) {
        num = num +1;
    }

    static void square (int x) {
        x = x * x;
    }
}
