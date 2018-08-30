package p5;

/**
 * Created by huangtao on 2018/8/29.
 */
public class Solution {

    public String longestPalindrome(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (str.length() >= j - i + 1) {
                    break;
                }

                if (isPalindrome(s.substring(i, j + 1))) {
                    if (str.length() < j - i + 1) {
                        str = s.substring(i, j + 1);
                    }
                }
            }

        }

        return str;
    }

    private boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        } else if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }

}
