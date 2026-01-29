package samples;

public class Counter {
    public static int COUNT = 0;
    public static final double PI = 3.14;
    Counter() {
        COUNT++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
        System.out.println(PI);
    }
}
