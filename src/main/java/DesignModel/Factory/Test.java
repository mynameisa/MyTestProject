package DesignModel.Factory;

/**
 * Created by jiatieying on 16/9/27.
 */
public class Test {
    public static void main(String[] args) {
        SomeFactory.makeImpl1().someFunction();
        SomeFactory.makeImpl2().someFunction();
        SomeFactory sf = new SomeFactory();
        sf.makeIt("impl1").someFunction();
        sf.makeIt("impl2").someFunction();


    }
}
