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
public class DepartmentCRUD {
     DBCon con = new DBCon();
    public boolean adddepartment(int depID,String name,String des,String stat){//Create
       int x = 0;
        
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("Insert into Department (ID, Name, Description,Status) values (? ,?, ?, ?)");
            ps.setInt(1,depID);
            ps.setString(2, name);
            ps.setString(3, des);
            ps.setString(4, stat);
       
            x = ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return x == 1;
    }

    public boolean addDoctor(int docID, String Fname, String Lname, String username, String email, String pass, String dob, String gender, String address, String country, String city, String state, String code, String phone, String bio, String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
