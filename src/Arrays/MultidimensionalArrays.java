package Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] sample = {{1, 2, 3}, {4, 5, 6}};
//        int x = sample[1][0];
//        System.out.println(x);
//        int[][] grid = {{8, 4}, {2, 5}, {9, 6}};
//        x = grid[2][1];
//        System.out.println(x);
        int[][] array =  {{3, 5, 8}, {7, 54, 1, 12, 4}};
        System.out.println(array[0][2]);
        for (int x = 0; x < sample.length; x++) {
            for (int y = 0; y < sample[x].length; y++){
                System.out.println(sample[x][y]);
            }
        }
//        int sum = 0;
//        for(int x=0; x<arr.length; x++) {
//            for(int y=0; y< arr[x].length; y++) {
//                sum += arr[x][y];
//            }
//        }
//        System.out.println(sum);

    }
}
