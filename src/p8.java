/**
 * Created by huangtao on 2018/9/3.
 */
public class p8 {

    public int myAtoi(String str) {
        long up = (long) (Math.pow(2, 31) - 1), low = (long) (Math.pow(2, 31) * -1);
        int symbol = 1;
        String numStr = "";

        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        if (i == str.length()) {
            return 0;
        }

        if (str.charAt(i) == '+') {
            i++;
        } else if (str.charAt(i) == '-') {
            symbol = -1;
            i++;
        } else if (str.charAt(i) < '0' || str.charAt(i) > '9') {
            return 0;
        }

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            numStr += str.charAt(i);
            i++;
        }

        if(numStr.length() == 0) {
            return 0;
        }

        double result = Double.parseDouble(numStr) * symbol;
        if (result > up) {
            return (int) up;
        } else if (result < low) {
            return (int) low;
        } else {
            return (int) result;
        }
    }

}
