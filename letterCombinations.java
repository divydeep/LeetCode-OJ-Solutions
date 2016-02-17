import java.util.ArrayList;
import java.util.List;

/**
 * Created by Divydeep Agarwal on 2/9/2016.
 */
//Given a digit string, return all possible letter combinations that the number could represent.
//A mapping of digit to letters (just like on the telephone buttons) is given below.
//Input:Digit string "23"
//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
public class letterCombinations {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) return result;
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        for(int i=0;i < digits.length();i++){
            List<String> temp = new ArrayList<>();
            String words = mapping[digits.charAt(i) - '0'];
            for(int j=0;j<words.length();j++){
                for(String s: result){
                    temp.add(s+words.charAt(j));
                }
            }
            result = temp;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
