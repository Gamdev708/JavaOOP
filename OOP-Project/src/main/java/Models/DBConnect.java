/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.*;

/**
 *
 * @author S.D.P.M.Siriwardana
 */
public class DBConnect {
    
    private static final String url="jdbc:mysql://localhost:3308/rustyrepaire";
    private static final String user="root";
    private static final String password="";
    
    public static void Login(String user,String Password)
    {
        
    }
    
    public static Connection connection()
    {
        
        Connection conn=null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
    
}
