package sort;

/**
 * =============================================
 * 实现插入排序
 * 时间复杂度为O(n2)
 * @author wu
 * @create 2018-05-14 19:48
 * =============================================
 */
public class InsertSort implements Sort {
    @Override
    public void sort(int[] nums) {
        int length = nums.length;
        if(length <= 1){
            return;
        }
        for(int i=1;i< length;i++){
            if(nums[i] < nums[i-1]){
                int temp = nums[i];
                int j = i-1;
                while(j>=0 && temp < nums[j]){
                    nums[j+1] = nums[j];
                    j--;
                }
                nums[j+1] = temp;
            }
        }
    }
}
