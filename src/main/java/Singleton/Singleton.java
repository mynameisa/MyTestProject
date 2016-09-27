package Singleton;

/**
 * Created by jiatieying on 16/9/27.
 */
public class Singleton {
    /* 持有私有静态实例,防止被引用,赋值为null,目的是为了实现延迟加载 */
    private static Singleton instance = null;
    /* 私有化构造方法,不让别人new */
    private Singleton(){}
    /* 获取此单例 */
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
