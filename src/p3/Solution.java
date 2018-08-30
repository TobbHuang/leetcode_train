package p3;

/**
 * Created by huangtao on 2018/8/29.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            int pos = str.indexOf(cur);
            if (pos == -1) {
                str += cur;
                max = Math.max(max, str.length());
            } else {
                str = str.substring(pos + 1) + cur;
            }
        }

        return max;
    }
}
