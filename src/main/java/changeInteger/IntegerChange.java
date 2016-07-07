package changeInteger;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2016/7/7.
 */
public class IntegerChange {
    public static void setInt(Integer i,Integer j) throws Exception{
        Field field = i.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(i,j.intValue());
    }
    public static void change(Integer a,Integer  b) throws Exception{
        Integer temp = a.intValue();
        setInt(a,b);
        setInt(b,temp);
    }
    public static void main(String[] args) throws Exception{
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        //这样就不行
        //Integer a = 1;
        //Integer b = 2;
        change(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
