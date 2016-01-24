import java.util.*;

/**
 * Created by Divydeep Agarwal on 1/20/2016.
 */
public class intToRoman {
    public static String intToRoman(int num) {
        LinkedHashMap<Integer, String> formula = new LinkedHashMap<>();
        formula.put(1000, "M");
        formula.put(900, "CM");
        formula.put(500, "D");
        formula.put(400, "CD");
        formula.put(100, "C");
        formula.put(90, "XC");
        formula.put(50, "L");
        formula.put(40, "XL");
        formula.put(10, "X");
        formula.put(9, "IX");
        formula.put(5, "V");
        formula.put(4, "IV");
        formula.put(1, "I");

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Integer, String> entry : formula.entrySet()){
            while(num >= entry.getKey()){
                num = num - entry.getKey();
                sb.append(entry.getValue());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int x = 1234;
        System.out.println(intToRoman(15));
    }
}
