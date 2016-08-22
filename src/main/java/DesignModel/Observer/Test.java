package DesignModel.Observer;

/**
 * Created by Administrator on 2016/8/16.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData ex = new WeatherData();
        Viewer v1 = new Viewer("viewer1");
        Viewer v2 = new Viewer("viewer2");
        ex.registerObserver(v1);
        ex.registerObserver(v2);
        ex.setData("{data:I'm data}");
        ex.removeObserver(v2);
        ex.setData("{data changed.ahahah}");
    }
}
