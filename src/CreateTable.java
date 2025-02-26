import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 

* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Belani
 */
 
public class CreateTable { 
    public static void createNewTable() {   
         
           
        // SQL statement for creating a new table   
        String sql = "CREATE TABLE IF NOT EXISTS users (\n"   
                + " No integer PRIMARY KEY AUTOINCREMENT,\n"   
                + " Name text NOT NULL,\n"   
                + " Time time \n"   
                + ");";   
           
        try{
            
            Connection conn = ConnectDB.getConnection();
            Statement stmt = conn.createStatement();   
            stmt.execute(sql);   
        } catch (SQLException e) {   
            System.out.println(e.getMessage());   
        }   
    }   
    
    /**  
     * @param args the command line arguments  
     */   
    public static void main(String[] args) {   
        
        createNewTable();
    }   
} 
