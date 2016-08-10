package jdbcTest;

import java.sql.*;

/**
 * Created by Administrator on 2016/7/29.
 */
public class jdbcTest {
    static final String JDBC_URL = "";
    static final String DB_URL = "";

    static final String USER = "";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM action WHERE type='menu' OR  type='root'";
            ResultSet rs = stmt.executeQuery(sql);
            String resultJson = "[";
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                resultJson += "{'id':" + "'" + id + "',";

                int pid = rs.getInt("parentid");

                String type = rs.getString("type");
                if("menu".equals(type)){
                    String url = rs.getString("action_name");
                    resultJson += "'url':" + "'" + url + "',";
                }

                String name = rs.getString("menu");
                resultJson += "'name':" + "'" + name + "'},";

                String first = rs.getString("first");
                String last = rs.getString("last");

                //Display values
                System.out.print("ID: " + id);
//                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }
            //STEP 6: Clean-up environment
            rs.close();
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
        System.out.println("Goodbye!");
    }
}
