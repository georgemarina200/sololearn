package Classes.and.Objects;

public class A {
    private int x;

    public A () {
        x = 0;
    }
    public A (int val) {
        x = val;
    }
    public int getX () {
        return x;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void test() {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.test();
    }
}
