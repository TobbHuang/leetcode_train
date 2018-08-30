package p6;

/**
 * Created by huangtao on 2018/8/30.
 */
public class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder str = new StringBuilder();

        int m = 2 * numRows - 2;

        int n = s.length() / m;
        if (s.length() % m > 0) {
            n++;
        }

        for (int i = 0; i < n; i++) {
            str.append(s.charAt(i * m));
        }

        for (int i = 1; i < numRows - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j * m + i < s.length()) {
                    str.append(s.charAt(j * m + i));
                }
                if ((j + 1) * m - i < s.length()) {
                    str.append(s.charAt((j + 1) * m - i));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i * m + numRows - 1 < s.length()) {
                str.append(s.charAt(i * m + numRows - 1));
            }
        }

        return str.toString();
    }

}
