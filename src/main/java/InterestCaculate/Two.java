package InterestCaculate;

/**
 * Created by jiatieying on 2016/11/25.
 * 判断一个数是否为2的n次幂
 */
public class Two {
    public static void judge(int x){
        if((x & (x-1)) == 0){
            System.out.printf("%s是2的次幂",x);
        }
    }
}
