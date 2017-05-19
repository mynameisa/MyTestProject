package Sorting;

/**
 * 气泡排序
 * Created by jiatieying on 2017/5/1.
 */
public class BubbleSort {
    public static void sort(int[] numbers){
        int temp = 0;
        int size = numbers.length;
        int times = 1;
        for(int i = 0 ; i < size-1; i ++)
        {
            for(int j = 0 ;j < size-1-i ; j++)
            {
                if(numbers[j] > numbers[j+1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
                System.out.print("[The " + times + " times result] ");
                times++;
                printNumbers(numbers);
            }
        }
    }

    public static void printNumbers(int[] numbers){
        for (int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }
}
