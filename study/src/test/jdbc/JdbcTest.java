package jdbc;

import org.junit.Test;

import java.sql.Connection;

/**
 * Created by jeremy on 2016/9/10.
 */
public class JdbcTest {

    private Connection connection;

    @Test
    public void testConn(){

        connection =  new ConnectMysql().getConn();

        System.out.println(connection);

    }
}
