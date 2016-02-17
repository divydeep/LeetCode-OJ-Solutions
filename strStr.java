/**
 * Created by Divydeep Agarwal on 2/17/2016.
 */
//Implement strStr().
//Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class strStr {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len2 == 0) return 0;
        int threshold = len1-len2;
        for(int i=0;i<=threshold;i++){
            if(haystack.substring(i, i+len2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
