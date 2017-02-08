package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * Created by jiatieying on 2017/2/6.
 */
public class MySqlUtil {
    /**
     * 加载驱动,Class.forName()是为了加载Driver里的static方法
     */
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String url,String userName,String password) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static List<Map<String,Object>> query(ConnectContext connectContext,String SQL){
        Statement stmt = null;
        try{
            Connection con = getConnection(connectContext.getURL(),connectContext.getUserName(),connectContext.getPassword());
            stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(SQL);
            int colNum = resultSet.getMetaData().getColumnCount();
            resultSet.last();
            int rowNum = resultSet.getRow();
            resultSet.first();

        }catch (Exception e){

        }
        return null;
    }
}
