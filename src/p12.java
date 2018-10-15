/**
 * Created by huangtao on 2018/10/15.
 */
public class p12 {

    public String intToRoman(int num) {
        int i = 0, v = 0, x = 0, l = 0, c = 0, d = 0, m = 0, iv = 0, ix = 0, xl = 0, xc = 0, cd = 0, cm = 0;
        String str = "";

        m = num / 1000;
        num = num % 1000;
        while (m-- > 0) {
            str += "M";
        }

        cm = num / 900;
        num = num % 900;
        while (cm-- > 0) {
            str += "CM";
        }

        d = num / 500;
        num = num % 500;
        while (d-- > 0) {
            str += "D";
        }

        cd = num / 400;
        num = num % 400;
        while (cd-- > 0) {
            str += "CD";
        }

        c = num / 100;
        num = num % 100;
        while (c-- > 0) {
            str += "C";
        }

        xc = num / 90;
        num = num % 90;
        while (xc-- > 0) {
            str += "XC";
        }

        l = num / 50;
        num = num % 50;
        while (l-- > 0) {
            str += "L";
        }

        xl = num / 40;
        num = num % 40;
        while (xl-- > 0) {
            str += "XL";
        }

        x = num / 10;
        num = num % 10;
        while (x-- > 0) {
            str += "X";
        }

        ix = num / 9;
        num = num % 9;
        while (ix-- > 0) {
            str += "IX";
        }

        v = num / 5;
        num = num % 5;
        while (v-- > 0) {
            str += "V";
        }

        iv = num / 4;
        num = num % 4;
        while (iv-- > 0) {
            str += "IV";
        }

        i = num;
        while (i-- > 0) {
            str += "I";
        }

        return str;
    }

}
