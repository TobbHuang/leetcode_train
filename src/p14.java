/**
 * Created by huangtao on 2018/10/16.
 */
public class p14 {
    public String longestCommonPrefix(String[] strs) {
        int num = strs.length;
        int minSize = Integer.MAX_VALUE;

        if(num == 0){
            return "";
        } else if(num == 1){
            return strs[0];
        }

        for(int i=0;i<num;i++){
            if(strs[i] == null || strs[i].isEmpty()){
                return "";
            }
            minSize = Math.min(minSize, strs[i].length());
        }

        int commonLength=0;
        for(int i=0;i<minSize;i++){
            boolean flag = true;
            for(int j=1;j<num;j++){
                if(strs[j].charAt(i) != strs[0].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                return strs[0].substring(0, i);
            }
        }
        return strs[0].substring(0, minSize);
    }
}
