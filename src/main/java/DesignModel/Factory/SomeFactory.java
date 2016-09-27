package DesignModel.Factory;

/**
 * Created by jiatieying on 16/9/27.
 */
public class SomeFactory implements SomeAbstractFactory{
    /**
     * 普通工厂
     * @param param
     * @return
     */
    public SomeInterface makeIt(String param){
        if("impl1".equals(param)){
            return new Implement1();
        }else if("impl2".equals(param)){
            return new Implement2();
        }else{
            return null;
        }
    }

    /**
     * 静态工厂,不用实例化工厂,直接获取需要的类
     * @return
     */
    public static SomeInterface makeImpl1(){
        System.out.println("static");
        return new Implement1();
    }

    /**
     * 静态工厂,不用实例化工厂,直接获取需要的类
     * @return
     */
    public static SomeInterface makeImpl2(){
        System.out.println("static");
        return new Implement2();
    }
}
