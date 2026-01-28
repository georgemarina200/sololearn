package Arrays;

public class LoopingOverArrays {
    public static void main(String[] args) {
        int[] ages = {18, 33, 24, 64, 45};
        System.out.println(ages.length);
//        int[] x = {3, 2, 1};
//        System.out.println(x.length);
        for (int x = 0; x < ages.length; x++) {
            System.out.println(ages[x]);
        }
        int sum = 0;
        for (int x = 0; x < ages.length; x++) {
            sum += ages[x];
        }
        System.out.println(sum);
//        double sum = 0.0;
//        for (int x=0; x<nums.length; x++) {
//            sum += nums[x];
//        }
//        System.out.println(sum);
//        int[] nums = {2, 3, 5, 7};
//        for (int x : nums) {
//            System.out.println(x);
//        }
//        for (String n : names) {
//            System.out.println(n);
//        }
        sum = 0;
        for (int x : ages) {
            sum += x;
        }
        System.out.println(sum);
        int[ ] nums = {3, 8, 5, 2};
        int res = 0;
        for(int x: nums) {
            if(x > res) {
                res = x;
            }
        }
        System.out.println(res);
        int[] arr = {1, 2, 3, 4};
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
