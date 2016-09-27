package DesignModel.Factory;

/**
 * 抽象工厂
 * 让工厂在实现一个接口
 * 工厂还是那个SomeInterface的工厂
 * 只是可以有更多不同的工厂
 * Created by jiatieying on 16/9/27.
 */
public interface SomeAbstractFactory {
    public SomeInterface makeIt(String param);
}
