import java.util.*;

/**
 * Created by Divydeep Agarwal on 1/20/2016.
 */
//Given a roman numeral, convert it to an integer.
//Input is guaranteed to be within the range from 1 to 3999.
public class romanToInt {
    public static int romanToInt(String s) {
        int len = s.length();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = map.get(s.charAt(len-1));
        int pivot = result;
        for(int i = len-2; i>= 0;i--){
            int curr = map.get(s.charAt(i));
            if(curr >=  pivot){
                result += curr;
            }else{
                result -= curr;
            }
            pivot = curr;
        }
        return result;
    }
    public static void main(String[] args) {
        int x = 1234;
        System.out.println(romanToInt("MCMXCVI"));
    }
}
