import java.util.Arrays;

/**
 * Created by huangtao on 2018/10/17.
 */
public class p16 {

    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            for(int j=i+1,k=nums.length-1;j<k;){
                int tmp = nums[i] + nums[j] + nums[k];
                if(target == tmp){
                    return tmp;
                } else {
                    if(Math.abs(target - tmp) < Math.abs(target - result)){
                        result = tmp;
                    }

                    if(target > tmp){
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }

        return result;
    }

}
