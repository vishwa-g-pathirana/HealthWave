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
public class SalaryCRUD {
    DBCon con = new DBCon();

    public boolean addSalary(int SID, String name, String salary, String basic, String DA, String HRA, String Conveyance, String Allowance, String medical, String other1, String TDS, String ESI, String PF, String Leave, String Tax, String welfare, String fund, String other2) {
        int x = 0;
        
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("Insert into Salary values (SID,name,salary, basic, DA, HRA,  Conveyance, Allowance , medical, other1,  TDS , ESI  ,PF ,Leave,Tax,welfare,fund,other2) values (? ,?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,SID);
            ps.setString(2, name);
            ps.setString(3, salary);
            ps.setString(4, basic);
            ps.setString(5,DA);
            ps.setString(6, HRA);
            ps.setString(7, Conveyance);
            ps.setString(8, Allowance);
            ps.setString(9,medical);
            ps.setString(10, other1);
            ps.setString(11, TDS);
            ps.setString(12, ESI);
            ps.setString(13,PF);
            ps.setString(14, Leave);
            ps.setString(15, Tax);
            ps.setString(16, welfare);
            ps.setString(17,fund);
            ps.setString(18, other2);
           
            x = ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return x == 1;
        
    }

}
