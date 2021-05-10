/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Admin;

import Model.DBCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    public boolean updateAppointment(String id, String Pname, String Dep, String Dname,String date,String Time,String mail,String num,String message,String status){
       int x = 0;
        
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("update Appointment set Pname = ?, Dep = ?, Dname = ?,Date=?,Time=?,Pmail=?,Pnum=?,Message=?,Status=? where ID = ?");
            ps.setString(1, Pname);
            ps.setString(2, Dep);
            ps.setString(3, Dname);
            ps.setString(4, date);
            ps.setString(5, Time);
            ps.setString(6, mail);
            ps.setString(7, num);
            ps.setString(8, message);
            ps.setString(9, status);
            ps.setString(10, id);
            
            x = ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return x == 1;
    }
    
    public boolean deleteAppointment(String id){
       int x = 0;
        
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("delete from Appointment where ID = ?");
            ps.setString(1, id);
            
            x = ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return x == 1;
    }
    public ResultSet getAll(){//Read
       ResultSet rs = null;
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("select * from appointment");
            
            rs = ps.executeQuery();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet getAppoinment(String id){//Read
       ResultSet rs = null;
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("select * from appointment where ID=?");
            
            rs = ps.executeQuery();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet getAllApp(){//Read
       ResultSet rs = null;
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("select * from appointment where Pname='Vishwa G Pathirana'");
            
            rs = ps.executeQuery();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
