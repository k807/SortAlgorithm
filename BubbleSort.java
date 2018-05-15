package sort;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-05-15 15:18
 * =============================================
 */
public class BubbleSort implements Sort{
    @Override
    public void sort(int[] nums) {
        int length = nums.length;
        for(int i=0; i<length ;i++){
            for(int j=0;j<length - i -1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
