/**
 * Created by huangtao on 2018/11/2.
 */
public class p27 {

    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }

        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }

}
