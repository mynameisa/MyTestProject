package Sorting;

/**
 * Created by jiatieying on 2017/5/15.
 */
public class InsertSort {
    public static void sort(int[] arr)
    {
        int i, j;
        int target;

        //假定第一个元素被放到了正确的位置上
        //这样，仅需遍历1 - n-1
        for (i = 1; i < arr.length; i++)
        {
            j = i;
            target = arr[i];//认为0号位置的数字是正确的，随后遍历整个数组，选择位置
            while (j > 0 && target < arr[j - 1]) //
            {
                arr[j] = arr[j - 1];
                j--;
                printNumbers(arr);
                System.out.println("target: " + target);
            }

            arr[j] = target;
        }
        printNumbers(arr);
    }

    public static void printNumbers(int[] numbers){
        for (int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }
}
