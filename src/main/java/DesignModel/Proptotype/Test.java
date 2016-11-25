package DesignModel.Proptotype;

/**
 * Created by jiatieying on 16/9/27.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Prototype p1 = new Prototype();
        p1.testParam1 = "a";
        p1.testParam2 = 2;
        Prototype p2 = (Prototype)p1.simpleClone();
        System.out.println("p1: " + p2 + "p2: " + p2);


    }
}
