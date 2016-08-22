package DesignModel.Decorator;

/**
 * 构件中还可以接收其他构建
 * Created by Administrator on 2016/8/17.
 */
public class Extra1 implements Component {
    private Component extra;
    public Extra1(){

    }
    public Extra1(Component extra){
        this.extra = extra;
    }
    public void extraFunction(){
        System.out.println("This is Extra1 Function");
        if(this.extra != null){
            this.extra.extraFunction();
        }
    }
}
