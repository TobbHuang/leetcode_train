import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangtao on 2018/10/26.
 */
public class p17 {

    public List<String> letterCombinations(String digits) {
        char[][] keyboard = {{},{}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        List<String> result = new ArrayList<String>();

        if(digits.length() == 0){
            return result;
        }

        int num = digits.charAt(0) - '0';
        for(char ch : keyboard[num]){
            result.add(ch + "");
        }

        for(int i=1;i<digits.length();i++){
            num = digits.charAt(i) - '0';
            int length = result.size();
            for(int j=0;j<length;j++){
                String str = result.remove(0);
                for(char ch : keyboard[num]){
                    result.add(str + ch);
                }
            }
        }
        return result;
    }

}
