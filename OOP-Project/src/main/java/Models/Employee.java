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
public class Employee {
    public String eID;
    public String NIC;
    public String name;
    public String Adres;
    public String Tel;
    public String Job;

    public Employee(String eID, String NIC, String name, String Adres, String Tel, String Job) {
        this.eID = eID;
        this.NIC = NIC;
        this.name = name;
        this.Adres = Adres;
        this.Tel = Tel;
        this.Job = Job;
    }
    
    

}
