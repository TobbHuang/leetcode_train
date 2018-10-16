/**
 * Created by huangtao on 2018/10/16.
 */
public class p13 {
    public int romanToInt(String s) {
        int num = 0;

        if(s.contains("IV")){
            num += 4;
            s=s.replace("IV","");
        }

        if(s.contains("IX")){
            num += 9;
            s=s.replace("IX","");
        }

        if(s.contains("XL")){
            num += 40;
            s=s.replace("XL","");
        }

        if(s.contains("XC")){
            num += 90;
            s=s.replace("XC","");
        }

        if(s.contains("CD")){
            num += 400;
            s=s.replace("CD","");
        }

        if(s.contains("CM")){
            num += 900;
            s=s.replace("CM","");
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'I'){
                num += 1;
            } else if(s.charAt(i) == 'V'){
                num += 5;
            } else if(s.charAt(i) == 'X'){
                num += 10;
            } else if(s.charAt(i) == 'L'){
                num += 50;
            } else if(s.charAt(i) == 'C'){
                num += 100;
            } else if(s.charAt(i) == 'D'){
                num += 500;
            } else if(s.charAt(i) == 'M'){
                num += 1000;
            }
        }
        return num;
    }

}
