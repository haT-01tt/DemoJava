package MultiThread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnect {
    private String driverClass;
    private String url;
    private String username;
    private String password;
    private String query;


    public JDBCConnect(String driverClass, String url, String username, String password, String query) {
        this.driverClass = driverClass;
        this.url = url;
        this.username = username;
        this.password = password;
        this.query = query;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Connection getConnectDb(String driverClass,
                                   String url,
                                   String username,
                                   String password)  {
        Connection con = null;
        try {
            Class.forName(driverClass);
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Success connect database");
        }catch (Exception clf){
            throw new RuntimeException(clf);
        }
        return con;
    }
}
