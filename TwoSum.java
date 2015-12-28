import java.util.HashMap;

/**
 * Created by Divydeep Agarwal on 12/25/2015.
 */

//Given an array of integers, find two numbers such that they add up to a specific target number.
//
//        The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//
//        You may assume that each input would have exactly one solution.
//
//        Input: numbers={2, 7, 11, 15}, target=9
//        Output: index1=1, index2=2
public class TwoSum {
    public static int[] twoSumA(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for (int j=i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return null;
    }

    public static int[] twoSumB(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(integerHashMap.containsKey(target - nums[i])){
                result[0] = integerHashMap.get(target - nums[i]);
                result[1] = i + 1;
                return result;
            }
            else {
                integerHashMap.put(nums[i], i + 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSumA(nums, target);
//        int[] result = twoSumB(nums, target);
        for (int i: result){
            System.out.println(i);
        }
    }
}
