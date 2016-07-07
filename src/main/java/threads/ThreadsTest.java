package threads;

/**
 * Created by Administrator on 2016/6/24.
 */
public class ThreadsTest implements Runnable {
    private int count = 15;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "运行 count= " + count--);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ThreadsTest my = new ThreadsTest();
        new Thread(my, "C").start();//同一个mt，但是在Thread中就不可以，如果用同一个实例化对象mt，就会出现异常
        new Thread(my, "D").start();
        new Thread(my, "E").start();
    }
}