/**
 * Created by Divydeep Agarwal on 12/27/2015.
 */
//Determine whether an integer is a palindrome. Do this without extra space.
public class isPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int result = 0;
        while(temp!=0){
            result = result * 10 + temp%10;
            temp = temp/10;
        }
        if (x == result){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int x = 1234321;
        System.out.println(isPalindrome(x));
    }
}
