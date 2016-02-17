import java.util.*;

/**
 * Created by Divydeep Agarwal on 1/24/2016.
 */
//Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//        For example, given array S = {-1 2 1 -4}, and target = 1.
//        The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
public class threeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int initSum = nums[0] + nums[1] + nums[2];
        int result  = initSum;
        int length  = nums.length;
        for(int i=0; i<length; i++){
            int j = i+1;
            int k = length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }
                if(sum < target){
                    j++;
                }
                else {
                    k--;
                }
                if(Math.abs(sum - target) < Math.abs(result - target)) result = sum;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] x = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(x, target));
    }
}
