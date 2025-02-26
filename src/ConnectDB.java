import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Belani
 */

 
public class ConnectDB {
 
    public static Connection getConnection() {   
        // SQLite connection string   
        
        String url = "jdbc:sqlite:SlidePuzzle.db";
        Connection conn = null;   
        try {   
            conn = DriverManager.getConnection(url);   
        } catch (SQLException e) {   
            System.out.println(e.getMessage());   
        }   
        return conn;   
    }   
} 
