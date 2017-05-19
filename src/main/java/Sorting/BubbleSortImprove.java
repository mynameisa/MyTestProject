package Sorting;

/**
 * 改进版起泡排序
 * 加入flag
 * 如果一次遍历并没有做过switch的操作，那么就说明顺序已经正确了，不再继续
 * Created by jiatieying on 2017/5/7.
 */
public class BubbleSortImprove {
    public static void sort(int[] numbers){
        Boolean flag = true;
        int temp = 0;
        int times = 1;
        for (int i = 0;i<numbers.length && flag;i++){
            flag = false;
            for(int j = 0 ;j < numbers.length-1-i ; j++)
            {
                if(numbers[j] > numbers[j+1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    flag = true;
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
