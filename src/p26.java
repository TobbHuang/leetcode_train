/**
 * Created by huangtao on 2018/11/2.
 */
public class p26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int n = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }

}
