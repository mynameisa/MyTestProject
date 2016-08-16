package DesignModel.Observer;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2016/8/10.
 */
public class WeatherData implements Subject{
    private String data;
    private List<Observer> observers = new ArrayList<>();

    public void setData(String data){
        this.data = data;
        notifyObservers();
    }

    public String getData(){
        return this.data;
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer ob : observers){
            ob.update(data);
        }
    }
}
