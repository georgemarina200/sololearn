package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0] = 18;
        ages[2] = 25;
        System.out.println(ages[2]);
        String[] names = new String[5];
        names[0] = "James";
        System.out.println(names[0]);
        String[] letters = {"A", "B", "C", "D"};
        System.out.println(letters[2]);
        int[] tmp = {5, 8, 9, 3};
        System.out.println(tmp[2]);
        int[] x = {4, 3, 6, 8};
        int res = x[1] * x[3];
        System.out.println(res);
    }
}
