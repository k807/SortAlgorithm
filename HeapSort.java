package sort;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-05-15 15:16
 * =============================================
 */
public class HeapSort implements Sort{
    public void maxHeapify(int[] arr,int length,int root){
        int leftChild = 2*root + 1;
        int rightChild = 2*root + 2;
        int largeChildIndex = leftChild;
        if(rightChild < length && arr[rightChild] > arr[leftChild]){
            largeChildIndex = rightChild;
        }
        if(largeChildIndex < length && arr[root] < arr[largeChildIndex]){
            int temp = arr[root];
            arr[root] = arr[largeChildIndex];
            arr[largeChildIndex] = temp;
            maxHeapify(arr,length,largeChildIndex);
        }
    }

    public void buildHeap(int[] arr){
        int length = arr.length;
        int n = (length - 2) / 2;
        while(n >= 0){
            maxHeapify(arr,length,n);
            n--;
        }
    }

    public void HeapSort(int[] arr){
        int length = arr.length;
        int temp;
        buildHeap(arr);
        for(int i = length - 1 ; i >= 0 ; i--){
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr,i ,0);
        }
    }

    @Override
    public void sort(int[] arr) {
        buildHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;
            maxHeapify(arr, i, 0);
        }
    }
}
