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
public class AppoinmentCRUD {
    DBCon con = new DBCon();
    
    /**
     *
     * @param appID
     * @param Pname
     * @param Dep
     * @param Dname
     * @param date
     * @param Time
     * @param mail
     * @param num
     * @param message
     * @param status
     * @return
     */
    public boolean addappoinment( int appID, String Pname, String Dep, String Dname,String date,String Time,String mail,String num,String message,String status){//Create
       int x = 0;
        
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("Insert into Appointment (ID, Pname, Dep, Dname,Date,Time,Pmail,Pnum,Message,Status) values (? ,?, ?, ?,?,?,?,?,?,?)");
            ps.setInt(1,appID);
            ps.setString(2, Pname);
            ps.setString(3, Dep);
            ps.setString(4, Dname);
            ps.setString(5,date);
            ps.setString(6, Time);
            ps.setString(7, mail);
            ps.setString(8, num);
            ps.setString(9, message);
             ps.setString(10, status);       
            
            x = ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return x == 1;
    }
}
