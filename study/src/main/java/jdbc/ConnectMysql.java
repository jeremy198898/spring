package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jeremy on 2016/9/10.
 */
public class ConnectMysql {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://140.206.185.206:3306/zzd?useSSL=false&useUnicode=true&characterEncoding=utf-8";
    private static final String username = "jeremy";
    private static final String password = "e3,t6,P?";

    private Connection conn = null;

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConn(){
        try {
            conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConnect(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ;
        }
    }

}
