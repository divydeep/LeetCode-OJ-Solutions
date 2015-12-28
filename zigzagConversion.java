import java.util.ArrayList;

/**
 * Created by Divydeep Agarwal on 12/26/2015.
 */
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
public class zigzagConversion {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = numRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }
    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        System.out.println(new zigzagConversion().convert(s,4));
    }
}
