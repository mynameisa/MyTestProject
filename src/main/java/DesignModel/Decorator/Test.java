package DesignModel.Decorator;

/**
 * Created by Administrator on 2016/8/17.
 */
public class Test {
    public static void main(String[] args) {
        Base decorated = new Base(new Extra2(new Extra1()));
        decorated.functionCanBeAdded();
    }
}
