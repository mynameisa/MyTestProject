package jdbcTest;

import java.security.MessageDigest;
import java.sql.*;

/**
 * Created by Administrator on 2016/7/29.
 */
public class jdbcTest {
    static final String DB_URL = "jdbc:mysql://59.151.42.245:28066/wifiin_online?useUnicode=true&characterEncoding=utf-8";
    static final String USER = "wifiin";
    static final String PASS = "OtbqAzzsV20710";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        Statement stmt2 = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            stmt2 = conn.createStatement();
            String sql;
            int begin = 0;
            for (int i = 0;i<80;i++) {
                sql = "SELECT id,portal_html FROM portal_event LIMIT " + begin + ",1000";
                ResultSet rs = stmt.executeQuery(sql);
                //STEP 5: Extract data from result set
                while (rs.next()) {
                    int id = rs.getInt("id");
                    stmt2.executeUpdate(addMd5SQL(rs.getString("portal_html"), id));
                    System.out.println(id);
                }
                //STEP 6: Clean-up environment
                rs.close();
                begin+=1000;
            }
            stmt2.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("End");
    }

    public static String addMd5SQL(String html,int id){
        String md5 = getMd5(html);
        System.out.println(md5);
        return "UPDATE portal_event " + "SET md5_value='" + md5 + "' WHERE id=" + id;
    }

    private static MessageDigest md5 = null;
    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 用于获取一个String的md5值
     * @return
     */
    public static String getMd5(String str) {
        byte[] bs = md5.digest(str.getBytes());
        StringBuilder sb = new StringBuilder(40);
        for(byte x:bs) {
            if((x & 0xff)>>4 == 0) {
                sb.append("0").append(Integer.toHexString(x & 0xff));
            } else {
                sb.append(Integer.toHexString(x & 0xff));
            }
        }
        return sb.toString();
    }
}
