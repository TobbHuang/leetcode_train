package p4;

/**
 * Created by huangtao on 2018/8/29.
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length + nums2.length];
        int index = 0;

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                num[index] = nums1[i];
                i++;
            } else {
                num[index] = nums2[j];
                j++;
            }
            index++;
        }

        if(i>=nums1.length){
            for(;j< nums2.length;j++){
                num[index] = nums2[j];
                index++;
            }
        } else{
            for(;i< nums1.length;i++){
                num[index] = nums1[i];
                index++;
            }
        }

        if (num.length % 2 == 0) {
            return (double) (num[num.length / 2 - 1] + num[num.length / 2]) / 2;
        } else {
            return num[num.length / 2];
        }
    }

}
