package DesignModel.Observer;

/**
 * 观察对象
 */
public interface Subject {
    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 注销观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 提醒观察者
     */
    public void notifyObservers();
}
