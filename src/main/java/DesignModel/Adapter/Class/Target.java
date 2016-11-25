package DesignModel.Adapter.Class;

/**
 * Created by jiatieying on 16/9/28.
 */
public class Target extends Source implements Adapter {
    @Override
    public void method2() {
        System.out.println("this is method2 of Target");
    }
}
