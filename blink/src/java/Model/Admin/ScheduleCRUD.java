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
public class ScheduleCRUD {
    DBCon con = new DBCon();

    public boolean addSchedule(int SCID, String name, String days, String start, String end, String message, String status) {
        int x = 0;
        
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("Insert into Schedule (SCID,name,days, start, end, message,status) values (? ,?, ?, ?,?,?,?)");
            ps.setInt(1,SCID);
            ps.setString(2, name);
            ps.setString(3, days);
            ps.setString(4, start);
            ps.setString(5,end);
            ps.setString(6, message);
            ps.setString(7, status);
    
            x = ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return x == 1;
    }
}
