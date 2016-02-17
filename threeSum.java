import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Divydeep Agarwal on 1/24/2016.
 */
//Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//Note
//        Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
//        The solution set must not contain duplicate triplets.
//        For example, given array S = {-1 0 1 2 -1 -4},
//        A solution set is:
//        (-1, 0, 1)
//        (-1, -1, 2)
public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i=0; i<length; i++){
            if (i>0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i];
            int j = i + 1;
            int k = length - 1;
            while(j<k){
                if(nums[j] + nums[k] == target){
                    output.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }
                else if(nums[j] + nums[k] < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return output;
    }
    public void main(String[] args) {
        int[] x = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(x));
    }
}
