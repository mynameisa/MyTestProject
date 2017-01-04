import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
/**
 * Created by jiatieying on 2016/10/24.
 */
public class File_Gzip_Upload {
    public static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return (new sun.misc.BASE64Encoder()).encode(out.toString().getBytes());
    }

    public void post(){

    }

    public static void main(String[] args) throws Exception{
        System.out.println(compress("A String"));
    }

}
