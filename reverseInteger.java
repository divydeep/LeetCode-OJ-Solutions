/**
 * Created by Divydeep Agarwal on 12/26/2015.
 */
//Reverse digits of an integer.
//        Example1: x = 123, return 321
//        Example2: x = -123, return -321
public class reverseInteger {
    public int reverse(int x) {
        long result = 0;
        while(x!=0){
            result = result * 10 + x % 10;
            x = x/10;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        return (int)result;
    }
    public static void main(String[] args) {
        int num = 1534236469;
        String str = "anfkdf";
        System.out.println(new reverseInteger().reverse(num));
    }
}
