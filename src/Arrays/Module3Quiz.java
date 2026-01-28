package Arrays;

public class Module3Quiz {
    public static void main(String[] args) {
//        int count = 0;
//        for (int x = 0; x <dates.length; x++) {
//            if (dates[x] == 2000){
//                count++;
//            }
//        }
//        System.out.println(count);
        int[ ] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }

//        int res = arr[0] + arr[2];
//        System.out.println(res);

        int[] even = {2, 4, 6, 8};
        int res = even[0] + even[3];
        System.out.println(res);
    }
}
