package util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/24.
 */
public class TempTest {
    public static void  main(String[] args){
        hello();
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
