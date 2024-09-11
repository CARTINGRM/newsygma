
package db;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;


public class dbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sygmadb", "root", "root");
            st=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
    }
}
}