package ExtendTest;

/**
 * Created by Administrator on 2016/8/5.
 */
public class Test {
    public static void main(String[] args) {
        Parent son = new Son();
        son.setShareString("abc");
        System.out.println(son.getParentString());
    }
}
