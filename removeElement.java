/**
 * Created by Divydeep Agarwal on 2/14/2016.
 */
//Given an array and a value, remove all instances of that value in place and return the new length.
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
public class removeElement {
    public int removeElement(int[] nums, int val) {
        int cur = 0;
        for(int n: nums){
            if(n != val){
                nums[cur++] = n;
            }
        }
        return cur;
    }
}
