/**
 * Created by huangtao on 2018/10/8.
 */
public class p10 {

    //TODO not finished, skip first

    public static void main(String[] args) {

    }

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length()][p.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                    if (i == 0 && j == 0) {
                        dp[i][j] = true;
                    } else if (i == 0 || j == 0) {
                        dp[i][j] = false;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                } else if (p.charAt(j) == '*') {
                    if (i == 0 && j == 0) {
                        dp[i][j] = true;
                    } else if (i > 0 && j == 0) {
                        dp[i][j] = false;
                    } else if (i == 0 && j == 1) {
                        dp[i][j] = dp[i][j - 1];
                    } else if (i == 0 && j > 1) {
                        dp[i][j] = dp[i][j - 2] || dp[i][j - 1];
                    } else if (i > 0 && j == 1) {
                        dp[i][j] = s.charAt(i) == p.charAt(j - 1) && (dp[i][j - 1] || dp[i - 1][j - 1]);
                    } else {
                        if (s.charAt(i) != p.charAt(j - 1)) {
                            dp[i][j] = dp[i][j - 2];
                        } else {
                            dp[i][j] = dp[i - 1][j - 2] || dp[i - 1][j - 1] || dp[i - 1][j] || dp[i][j - 2];
                        }
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[s.length() - 1][p.length() - 1];
    }

}
