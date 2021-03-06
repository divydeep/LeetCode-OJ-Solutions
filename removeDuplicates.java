/**
 * Created by Divydeep Agarwal on 2/14/2016.
 */
//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//Do not allocate extra space for another array, you must do this in place with constant memory.
//For example,
//Given input array nums = [1,1,2],
//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int cur = 0;
        for(int n:nums){
            if(n>nums[cur]){
                nums[++cur] = n;
            }
        }
        return cur+1;

    }
    public static void main(String[] args) {
        int[] x = {1,1,2};
        System.out.println(removeDuplicates(x));
    }
}
