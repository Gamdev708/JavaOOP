/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Pankajan05
 */
public class Employee implements function{
    private String eID;
    private String NIC;
    private String name;
    private String Adres;
    private String Tel;
    private String Job;
    private Database database;

    public Employee(String eID, String NIC, String name, String Adres, String Tel, String Job) {
        this.eID = eID;
        this.NIC = NIC;
        this.name = name;
        this.Adres = Adres;
        this.Tel = Tel;
        this.Job = Job;
    }

    @Override
    public boolean add() {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO employee (EID,NIC,Name,Address,Tel,J_Allocate) values('");
        sql.append(eID).append("','");
        sql.append(NIC).append("','");
        sql.append(name).append("','");
        sql.append(Adres).append("','");
        sql.append(Tel).append("','");
        sql.append(Job).append("')");
        
        database
     
         return true;
    }

    @Override
    public boolean update() {
        return true;
    }

    @Override
    public boolean delete() {
         return true;
    }
    
    

}
