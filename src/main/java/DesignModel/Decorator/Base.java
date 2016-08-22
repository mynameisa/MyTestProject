package DesignModel.Decorator;

/**
 * 被装饰的类，在构造方法中传入一个构件，在相应方法中调用这个构件的方法
 * Created by Administrator on 2016/8/17.
 */
public class Base implements Decorator {
    private Component extra;
    public Base(Component extra){
        this.extra = extra;
    }
    public void functionCanBeAdded(){
        System.out.println("This is Base Function");
        this.extra.extraFunction();
    }
}
