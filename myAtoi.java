import java.math.BigInteger;
import java.util.InputMismatchException;

/**
 * Created by Divydeep Agarwal on 12/27/2015.
 */
public class myAtoi {
    public int myAtoi(String str) {
        int result = 0;
        int sign = 1, i=0;
        char[] chars = str.toCharArray();
        str = str.trim();
        if(str.isEmpty()){
            return 0;
        }
        if((str.charAt(0) == '-') || (str.charAt(0) == '+')){
            sign = str.charAt(0) == '-'? -1 : 1;
            i++;
        }
        for(int j=i; j<chars.length; j++){
            if(Character.isDigit(chars[j])){
                int d = str.charAt(j) - '0';
                if(Integer.MAX_VALUE/10 < result || Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE %10 < d)
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                result = result*10 + d;
            }
            else{
                break;
            }
        }
        return result * sign;
    }
    public static void main(String[] args) {
        String str = "9223372036854775809";
        System.out.println(new myAtoi().myAtoi(str));
    }
}
