package threads;

/**
 * 1.和2.会有很大的不同，同样是继承Runable接口照样1.照样不共享数据
 * 网上说继承Thread不能共享数据什么的明显是比较片面的
 * 根本原因还要参见Thread的方法：
    private void init(ThreadGroup g, Runnable target, String name,
        long stackSize, AccessControlContext acc)
 * 1.和2.的区别在于1.创建了3个线程对象，2.只创建了一个，并且两种方法创建的都是main线程，费解
 * 1.中的线程是互相独立的，属性不会相互共享，而2.中各线程可以对线程对象的属性任意修改如同在一个类中
 */
public class ThreadsTest{
    public static void main(String[] args) {
        DemoThread my = new DemoThread();
        DemoThread m2 = new DemoThread();
        DemoThread m3 = new DemoThread();
        new Thread(my, "A").start();//同一个mt，但是在Thread中就不可以，如果用同一个实例化对象mt，就会出现异常

        // 1
        new Thread(m2, "B").start();
        new Thread(m3, "C").start();
        // 2.
//        new Thread(my, "B").start();
//        new Thread(my, "C").start();
    }
}