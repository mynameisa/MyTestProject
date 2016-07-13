package threads;

import static java.lang.Thread.sleep;

/**
 * Created by Administrator on 2016/7/13.
 */
public class DemoThread implements Runnable {
    private String name;

    public DemoThread(String name){
        this.name = name;
    }

    //线程公有对象
    public String publicObject;
    //线程公有数据
    public int publicData;
    //线程私有对象
    private String privateObject;
    //线程私有对象
    private int privateData;

    public String getPublicObject() {
        return publicObject;
    }

    public void setPublicObject(String publicObject) {
        this.publicObject = publicObject;
    }

    public int getPublicData() {
        return publicData;
    }

    public void setPublicData(int publicData) {
        this.publicData = publicData;
    }

    public String getPrivateObject() {
        return privateObject;
    }

    public void setPrivateObject(String privateObject) {
        this.privateObject = privateObject;
    }

    public int getPrivateData() {
        return privateData;
    }

    public void setPrivateData(int privateData) {
        this.privateData = privateData;
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + "begin.");
        for (int i=0;i<8;i++){
            System.out.println(i + ".Thread " + name + "running");
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread" + name + "over.");
    }

}
