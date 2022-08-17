/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import javax.swing.*;

/**
 *
 * @author makur
 */
public class Logout {
    public static void logout(JFrame context, loginform loginScreen){
        LoginSession.isLoggedIn = false;
        context.setVisible(true);
    }
    
}
