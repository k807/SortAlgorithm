package sort;

import java.util.Arrays;

/**
 * =============================================
 * 归并排序
 * @author wu
 * @create 2018-05-15 15:47
 * =============================================
 */
public class MergeSort implements Sort{
    @Override
    public void sort(int[] nums) {
        mergeSort(nums,0,nums.length - 1);
    }

    private void mergeSort(int[]arr,int start,int end){
        if(start >= end){
            return;
        }
        int mid = (start + end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,mid+1,end);
    }

    private void overArray(int[] source,int[] target,int start){
        int length = source.length;
        for(int i=0;i<length;i++){
            target[start++] = source[i];
        }
    }
    private void merge(int[] arr,int start1,int end1,int start2,int end2){
        int length = (end1 - start1 + 1) + (end2 - start2 + 1);
        int[] temp = new int[length];
        int i = 0;
        int start = start1;
        while(start1<= end1 && start2<= end2){
            if(arr[start1] <= arr[start2]){
                temp[i++] = arr[start1++];
            }else{
                temp[i++] = arr[start2++];
            }
        }
        if(start1 > end1){
            while(i < length){
                temp[i++] = arr[start2++];
            }
        }
        if(start2 > end2){
            while (i < length){
                temp[i++] = arr[start1++];
            }
        }
        overArray(temp,arr,start);
    }
}
