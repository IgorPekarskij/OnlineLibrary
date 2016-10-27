package Connections;

import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.*;

public class ConnectToDB {
    private static Connection connection = null;
    private static InitialContext ic = null;
    private static DataSource ds = null;

    public static Connection getConnection(){
        try {
           ic = new InitialContext();
           ds = (DataSource) ic.lookup("java:comp/env/jdbc/library");
           connection = ds.getConnection();

        } catch (NamingException e) {
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

}
