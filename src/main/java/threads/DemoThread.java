package threads;

import static java.lang.Thread.sleep;

/**
 * Created by Administrator on 2016/7/13.
 */
public class DemoThread implements Runnable {

    //线程公有对象
    public String publicObject;
    //线程公有数据
    public char publicData;
    //线程私有对象
    private String privateObject;
    //线程私有对象
    private char privateData;

    public DemoThread(){
        System.out.println("Thread " + Thread.currentThread().getName() + " is instant.");
    }

    public String getPublicObject() {
        return publicObject;
    }

    public void setPublicObject(String publicObject) {
        this.publicObject = publicObject;
    }

    public char getPublicData() {
        return publicData;
    }

    public void setPublicData(char publicData) {
        this.publicData = publicData;
    }

    public String getPrivateObject() {
        return privateObject;
    }

    public void setPrivateObject(String privateObject) {
        this.privateObject = privateObject;
    }

    public char getPrivateData() {
        return privateData;
    }

    public void setPrivateData(char privateData) {
        this.privateData = privateData;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " begin.");
        for (int i=0;i<5;i++){
            System.out.println("Thread " + Thread.currentThread().getName() + " is running for " + i + " times");
            System.out.println("In thread " + Thread.currentThread().getName() + ",public data is " + getPublicData() + " now.");
            System.out.println("In thread " + Thread.currentThread().getName() + ",private data is " + privateData + " now.");
            try {
                this.setPublicData(Thread.currentThread().getName().charAt(0));

                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " over.");
    }

}
