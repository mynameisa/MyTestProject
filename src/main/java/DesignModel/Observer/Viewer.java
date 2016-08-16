package DesignModel.Observer;

/**
 * Created by Administrator on 2016/8/16.
 */
public class Viewer implements Observer {
    private String name;

    public Viewer(String name){
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println("This is : " + name + ".Get the data : " + data + ".");
    }
}
