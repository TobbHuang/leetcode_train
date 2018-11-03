/**
 * Created by huangtao on 2018/11/3.
 */
public class p28 {

    public int strStr(String haystack, String needle) {
        // 既然是简单题，就用最简单的解法。用indexOf的纯属流氓
        for(int i=0;i<=haystack.length()-needle.length();i++){
            boolean flag = true;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }

}
