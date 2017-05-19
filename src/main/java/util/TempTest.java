package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/24.
 */
public class TempTest {
    public final static int LIMIT = 2000;
    public static void  main(String[] args){
//        Map<String,Object> testMap = new HashMap<>();
//        testMap.put("3","third");
//        testMap.put("itself",testMap);
//        testMap.put("1","first");
//        testMap.put("2","second");
//        System.out.println(testMap);
//        Map<String,Object> m = (Map)testMap.get("itself");
//        m.put("4","4th");
//        System.out.println(m.get("itself"));
//        System.out.println(testMap);

//        int n =1000;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("input num:");
//        while(sc.hasNext()){
//            int m=sc.nextInt();
//            System.out.println("input is:"+m);
//            if(m>0&&(m+n)<=LIMIT){
//                System.out.println("ok,num is:"+(m+n));
//            }else{
//                System.out.println("error");
//            }
//        }

//        int m = 2147483647;
//        System.out.println(m+1);

        String s1="ab"+"c";
        String s2="abc";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println((s1==s2) + ":" + s1.equals(s2));

    }

    public static void hello() {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();

        System.out.println(className);
        System.out.println(methodName);
        System.out.println(lineNumber);
    }

    private static String fillTemplateByDetail(String template, Map<String, Object> paraMap) {
        String finalMessage = template;
        for (Map.Entry<String, Object> entry : paraMap.entrySet()) {
            finalMessage = finalMessage.replace("{" + entry.getKey() + "}", String.valueOf(entry.getValue()));
        }
        return finalMessage;
    }
}
