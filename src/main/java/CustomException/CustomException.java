package CustomException;

import threads.ExecutorServiceDemo;

/**
 * Created by jiatieying on 2017/1/4.
 */
public class CustomException extends Exception {
    public CustomException(String msg){
        super(msg);
    }
}
