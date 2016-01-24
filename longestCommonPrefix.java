/**
 * Created by Divydeep Agarwal on 1/24/2016.
 */
public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String lcp = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(lcp) != 0){
                lcp = lcp.substring(0, lcp.length() - 1);
            }
        }
        return lcp;
    }
    public static void main(String[] args) {
        String[] x = {"abcd", "abc", "ab"};
        System.out.println(longestCommonPrefix(x));
    }
}
