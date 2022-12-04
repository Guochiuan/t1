import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//        int[][] d = new int[5][4];
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4; j++) {
//                d[i][j] = 1;
//
//            }
//        }
//        for (int[] arr : d) {
//            Arrays.fill(arr, 0);
//        }
//
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.println("cell " + i + " " + j + " :" + d[i][j]);

//            }


//        }


        int[] a = {2,3,3,3,2,3,2,3,1};
        int[] b = {2,3,5};
        System.out.println("a = " + canPartition(a));
//        System.out.println("b = " + canPartition(b));
        }

    public static boolean canPartition(int[] nums) {
        if (nums.length == 0)
            return false;
        int totalSum = 0;
        // find sum of all array elements
        for (int num : nums) {
            totalSum += num;
        }
        // if totalSum is odd, it cannot be partitioned into equal sum subset
        if (totalSum % 2 != 0) return false;
        int subSetSum = totalSum / 2;
        boolean dp[] = new boolean[subSetSum + 1];
        dp[0] = true;
        for (int curr : nums) {
            for (int j = subSetSum; j >= curr; j--) {
                dp[j] = dp[j] || dp[j - curr];
            }
        }
        return dp[subSetSum];
    }



    }

