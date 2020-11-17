/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;

import Models.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pankajan05
 */
public class Database {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    public Database(){
        this.conn = DBConnect.connection();
    }
    
    public void execute(StringBuilder sql) throws SQLException{
          pstmt = conn.prepareStatement(sql.toString());
          pstmt.execute();
    }
    
    public void execute(String sql) throws SQLException{
          pstmt = conn.prepareStatement(sql.toString());
          pstmt.execute();
    }
}
