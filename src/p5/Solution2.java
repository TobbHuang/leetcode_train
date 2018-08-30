package p5;

/**
 * Created by huangtao on 2018/8/30.
 */
public class Solution2 {

    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }

        String str = "";

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i - 1) == s.charAt(i + 1)) {
                int j = 2;
                while (i - j >= 0 && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j)) {
                    j++;
                }
                j--;
                String tmpStr = s.substring(i - j, i + j + 1);
                if(tmpStr.length() > str.length()){
                    str = tmpStr;
                }
            }

        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                int j = 1;
                while (i - j >= 0 && i + 1 + j < s.length() && s.charAt(i - j) == s.charAt(i + 1 + j)) {
                    j++;
                }
                j--;
                String tmpStr = s.substring(i - j, i + j + 2);
                if(tmpStr.length() > str.length()){
                    str = tmpStr;
                }
            }

        }

        if(!s.isEmpty() && str.isEmpty()){
            return String.valueOf(s.charAt(0));
        }
        return str;
    }

}
