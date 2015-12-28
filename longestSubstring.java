import java.util.*;

/**
 * Created by Divydeep Agarwal on 12/26/2015.
 */
//Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
//        HashMap<String, Integer> subStrings = new HashMap<>();
//        subStrings.put(temp.toString(), temp.size()); This will get all the unique substrings
public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int maxSize = 0;
        if (s == null || s == ""){
            return 0;
        }
        for(int i=0; i < charArray.length; i++){
            ArrayList<Character> temp = new ArrayList<>();
            temp.add(charArray[i]);
            for(int j = i+1; j< charArray.length; j++){
                if(temp.contains(charArray[j])){
                    break;
                }
                else{
                    temp.add(charArray[j]);
                }

            }
            if (temp.size() > maxSize){
                maxSize = temp.size();
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        String str = "kwwkew";
        longestSubstring l = new longestSubstring();
        System.out.println(l.lengthOfLongestSubstring(str));
    }
}
