package DesignModel.ChainOfResponsibility;

/**
 * Created by jiatieying on 16/9/19.
 */
public abstract class Handler {
    /**
     * 持有后继的责任者
     */
    protected Handler handler;

    public Handler getHandler(){
        return this.handler;
    }

    public void setHandler(Handler h){
        this.handler = h;
    }

    /**
     * 处理请求的方法
     */
    public abstract void handleRequest();
}
