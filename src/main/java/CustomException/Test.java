package CustomException;

/**
 * Created by jiatieying on 2017/1/4.
 */
public class Test {
    public static void aFunctionCouldThrowException() throws CustomException{
        throw new CustomException("This is a customException");
    }

    public static void main(String[] args) throws Exception{
        aFunctionCouldThrowException();
    }
}
