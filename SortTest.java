package sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * =============================================
 * 冒泡排序，时间复杂度为O(n2)
 * @author wu
 * @create 2018-05-14 20:09
 * =============================================
 */
@RunWith(JUnit4.class)
public class SortTest {
    private Sort sort = new MergeSort();
    private long startTime;
    private long endTime;
    @Before
    public void befor(){
        startTime = System.currentTimeMillis();
        System.out.println("----------------------------------------");
    }
    @After
    public void after(){
        endTime = System.currentTimeMillis();
        System.out.println("程序运行时间" + (endTime - startTime) + "ms");
        System.out.println("----------------------------------------");
    }
    @Test
    public void test1(){
        int[] nums = new int[]{65,97,76,13,27,49,33,65,35,98,26,61,33,23,03,39,32};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);
    }

    @Test
    public void test4(){
        int[] nums = new int[]{4,8,2,6,1,9,6,4,3,0};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);
    }

    @Test
    public void test2(){
        int[] nums = new int[]{};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);
    }

    @Test
    public void test3(){
        int[] nums = new int[]{1};
        sort.print(nums);
        sort.sort(nums);
        sort.print(nums);
    }
}
