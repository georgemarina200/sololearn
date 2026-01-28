package Control.Flow;

public class ForLoops {
    public static void main(String[] args) {
        int x;
        for (x = 1;x < 5;x++) {
            System.out.println(x);
        }
        for (x = 10; x > 0; x--) {
            System.out.println(x);
        }
        for (x = 0; x <= 10; x += 2) {
            System.out.println(x);
        }
        for (int i = 2; i < 10; i = i * i) {
            System.out.println(i);
        }
        x = 1;
        while (x < 10) {
            System.out.println(x);
            if (x == 4) {
                break;
            }
            x++;
        }
        for (x = 1; x < 10; x++) {
            System.out.println(x);
            if (x == 4) {
                break;
            }
        }
        for (int num = 0;num < 1000; num++) {
            if (num == 55) {
                break;
            }
        }
        for (x = 10; x <= 40; x += 10) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
        }
        for (x = 10; x < 20; x++) {
            if (x == 13) {
                continue;
            }
            System.out.println(x);
        }
        int sum = 0;
        for (x = 1; x <=1000; x++) {
            sum += x;
        }
        System.out.println(sum);
    }
}
