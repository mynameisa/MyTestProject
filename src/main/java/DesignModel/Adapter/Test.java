package DesignModel.Adapter;

import DesignModel.Adapter.Class.Adapter;
import DesignModel.Adapter.Class.Target;

/**
 * Created by jiatieying on 16/9/28.
 */
public class Test {
    /*源对象Source中有method1方法,为了使Target与Adapter适配,有了Adapter接口*/
    public static void classAdapterTest(){
        Adapter a = new Target();
        a.method1();
        a.method2();


        Target t = new Target();
        t.method1();
        t.method2();
    }

    public static void main(String[] args) {
        classAdapterTest();
    }
}
