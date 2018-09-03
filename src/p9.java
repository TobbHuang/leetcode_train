/**
 * Created by huangtao on 2018/9/3.
 */
public class p9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        java.util.ArrayList<Integer> nums = new java.util.ArrayList<>();

        int tmp;
        while ((tmp = x / 10) > 0) {
            nums.add(x % 10);
            x = tmp;
        }
        nums.add(x);

        for (int i = 0, j = nums.size() - 1; i < j; i++, j--) {
            if (nums.get(i) != nums.get(j)) {
                return false;
            }
        }
        return true;


    }

}
