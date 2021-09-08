/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_MIS;
/*
 * 
 *Created and built by @offensive #TDBSoft
 *
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class DBconnection {
    private static final String username="root";
    private static final String password="";
    private static final String dataConn ="jdbc:mysql://localhost:3306/studentres";
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(dataConn,username,password);
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
        
    }
}
