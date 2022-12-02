package project3.orderman.invoice.login;
import java.sql.*;

/**
 *
 * @author rohena
 */
public class myConnection {
    
    static final String DB_URL="jdbc:mysql://localhost/demo";
    static final String USER= "root";
    static final String PASS= "";
    
    public static Connection connectDB(){
        Connection conn= null;
        
        try{
            //register jdbc driver
            //Class.forName("com.mysql.jdbc.Driver");
            
            //opens a connection
            conn= DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
            
        } catch(Exception ex){ 
            System.out.println("There were errors while connecting to the database");
            return null;
    }
    
    }
    
    
}
