/**
 * Created by huangtao on 2018/9/1.
 */
public class p7 {

    public int reverse(int x) {
        long up = 2147483647;
        long low = -2147483648;

        String str = String.valueOf(x);
        if (str.charAt(0) == '-') {
            str = str.substring(1);
        }
        String str2 = "";
        for (char ch : str.toCharArray()) {
            str2 = ch + str2;
        }
        long num = Long.parseLong(str2) * (x < 0 ? -1 : 1);
        if (num > up || num < low) {
            return 0;
        }

        return (int) num;
    }

}
