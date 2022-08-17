package jdbc;
import java.sql.*;
public class connection {
    public static Connection getconnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connect local mysql using JDBC driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?" + "user=root&password=root");
            return con;
    }
}