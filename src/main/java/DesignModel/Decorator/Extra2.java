package DesignModel.Decorator;

/**
 * Created by Administrator on 2016/8/17.
 */
public class Extra2 implements Component{
    private Component extra;
    public Extra2(){

    }
    public Extra2(Component extra){
        this.extra = extra;
    }
    public void extraFunction(){
        System.out.println("This is Extra2 Function");
        if(this.extra != null){
            this.extra.extraFunction();
        }
    }
}
