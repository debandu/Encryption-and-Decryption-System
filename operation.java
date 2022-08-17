
package jdbc;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author makur
 */
public class operation {
    public static boolean isLogin(String username, String password, JFrame frame){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?" + "user=root&password=root");

            String query="select * from users where username='"+username+"' AND password='"+password+"'";
            
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery(query);
            while(res.next())
            {

                LoginSession.username=res.getString("username");
                LoginSession.password=res.getString("password");
                LoginSession.isLoggedIn=true;
                return true;
            }

            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,e);
            
        }
        return false;
    }
    
    public static int getpath(String path,int key){
        LoginSession.select_path=path;
        LoginSession.key=key;
        return 0;
    }
    public static int enter(JFrame frame){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?" + "user=root&password=root");

            String query=" INSERT INTO users values ('"+LoginSession.username+"','"+LoginSession.password+"','"+LoginSession.select_path+"','"+LoginSession.key+"');";
            Statement st=con.createStatement();
            int res=st.executeUpdate(query);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(frame,e);
            
        }
        return 0;
    }
    
}
