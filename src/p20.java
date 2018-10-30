/**
 * Created by huangtao on 2018/10/29.
 */
public class p20 {

    public boolean isValid(String s) {
        char[] stack = new char[10000];
        int j = -1;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            switch(ch) {
                case '(':
                    stack[++j] = ch;
                    break;
                case ')':
                    if(j >= 0 && stack[j] == '('){
                        j--;
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    stack[++j] = ch;
                    break;
                case ']':
                    if(j >= 0 && stack[j] == '['){
                        j--;
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    stack[++j] = ch;
                    break;
                case '}':
                    if(j >= 0 && stack[j] == '{'){
                        j--;
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return j == -1;
    }

}
