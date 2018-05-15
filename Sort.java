package sort;

public interface Sort {
    void sort(int[] nums);
    default void print(int[] nums){
        System.out.print("[");
        for(int num : nums){
            System.out.print(num + ",");
        }
        System.out.print("]");
        System.out.println();
    };
}
