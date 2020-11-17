/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pankajan05
 */
public class Employer implements function{
    private String eID;
    private String NIC;
    private String name;
    private String Adres;
    private String Tel;
    private String Job;
    private Database database = new Database();

    public Employer(String eID, String NIC, String name, String Adres, String Tel, String Job) {
        this.eID = eID;
        this.NIC = NIC;
        this.name = name;
        this.Adres = Adres;
        this.Tel = Tel;
        this.Job = Job;
    }

    public Employer(String eID){
        this.eID = eID;
    }
    
    @Override
    public boolean add(){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO employee (EID,NIC,Name,Address,Tel,J_Allocate) values('");
        sql.append(eID).append("','");
        sql.append(NIC).append("','");
        sql.append(name).append("','");
        sql.append(Adres).append("','");
        sql.append(Tel).append("','");
        sql.append(Job).append("')");
        
        try {
            database.execute(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
     
         
    }

    @Override
    public boolean update() {
           StringBuilder sql2 = new StringBuilder();

            sql2.append("UPDATE employee SET NIC='").append(NIC);
            sql2.append("',Name='").append(name);
            sql2.append("',Address='").append(Adres);
            sql2.append("',Tel='").append(Tel);
            sql2.append("',J_Allocate='").append(Job);
            sql2.append("' WHERE EID='").append(eID).append("'");
            
        try {
            database.execute(sql2);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean delete() {
        String sql = "DELETE FROM employee WHERE EID='" + this.eID + "'";
        
        try {
            database.execute(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public String geteID() {
        return eID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
    
    

}
