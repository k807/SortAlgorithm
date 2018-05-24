package sort;

/**
 * =============================================
 * 希尔排序
 * @author wu
 * @create 2018-05-14 20:36
 * =============================================
 */
public class ShellInsertSort implements Sort {
    @Override
    public void sort(int[] nums) {
        int length = nums.length;
        int i,j;
        int h;
        int temp;
        for(h = length/2;h>0;h/=2){
            for(i=h;i<length;i++){
                temp = nums[i];
                for(j = i-h;j>=0;j-=h){
                    if(temp<nums[j]){
                        nums[j+h] = nums[j];
                    }else{
                        break;
                    }
                }
                nums[j+h] = temp;
            }
        }
    }
}
