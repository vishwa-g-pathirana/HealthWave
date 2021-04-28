/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Model.DBCon;
import java.sql.PreparedStatement;

/**
 *
 * @author Pubz
 */
public class PatientCRUD {
    DBCon con = new DBCon();
    public boolean addPatient(int PID,String Fname,String Lname,String username,String email,String pass, String dob, String gender ,String address,String country,String  city , String state  ,String code ,String phone){//Create
       int x = 0;
        
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("Insert into Patient (PID,Fname,Lname, username, email, pass,  dob, gender , address, country,  city , state  ,code ,phone) values (? ,?, ?, ?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,PID);
            ps.setString(2, Fname);
            ps.setString(3, Lname);
            ps.setString(4, username);
            ps.setString(5,email);
            ps.setString(6, pass);
            ps.setString(7, dob);
            ps.setString(8, gender);
            ps.setString(9,address);
            ps.setString(10, country);
            ps.setString(11, city);
            ps.setString(12, state);
            ps.setString(13,code);
            ps.setString(14, phone);
           
            x = ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return x == 1;
    }
}
