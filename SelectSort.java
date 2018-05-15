package sort;

/**
 * =============================================
 * 选择排序
 * 时间复杂度为O(n2)
 * @author wu
 * @create 2018-05-14 20:41
 * =============================================
 */
public class SelectSort implements Sort{
    /**
     * 选择最小的数字
     * @param nums
     * @param left
     * @return
     */
    private int selectMin(int[]nums,int left){
        int ret = left;
        for(int i = left + 1 ; i<nums.length;i++){
            if(nums[i] < nums[ret]){
                ret = i;
            }
        }
        return ret;
    }

    /**
     * 可以对算法进行改进
     * 二元选择算法，每次确定最大值和最小值
     * @param nums
     */
    @Override
    public void sort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int min = selectMin(nums,i);
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
}
