package jdbcTest;

/**
 * Created by jiatieying on 2017/2/6.
 */
public class ConnectContext {
    private String URL;
    private String userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getURL() {
        return URL;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
