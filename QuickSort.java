package sort;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-05-15 15:28
 * =============================================
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] nums) {
        quickSort(nums,0,nums.length - 1);
    }

    private void swap(int[]nums,int left,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    private void quickSort(int[] nums,int left,int right){
        if(right <= left){
            return;
        }
        int temp = nums[left];
        int i,j;
        for(i=left,j=right;i < j;){
            while(i < j && nums[j] >= temp){
                j --;
            }
            nums[i] = nums[j];
            while(i < j && nums[i] <= temp){
                i ++;
            }
            nums[j] = nums[i];
        }
        nums[i] = temp;
        quickSort(nums,left,i-1);
        quickSort(nums,i+1,right);
    }
}
