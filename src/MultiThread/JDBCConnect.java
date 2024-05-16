package MultiThread;

import java.sql.Connection;
import java.sql.DriverManager;

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

    public Connection getConnectDb()  {
        Connection con = null;
        try {
            Class.forName(this.driverClass);
            con = DriverManager.getConnection(this.url, this.username, this.password);
            System.out.println("Success connect database");
        }catch (Exception clf){
            throw new RuntimeException(clf);
        }
        return con;
    }
}
