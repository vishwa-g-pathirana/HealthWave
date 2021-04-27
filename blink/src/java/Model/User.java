/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pubz
 */
public class User {
    DBCon con = new DBCon();
    
    public boolean verifyUser(String username, String password){//Read
        boolean verified = false;
        
        try{
            PreparedStatement ps = con.createConnection().prepareStatement("select * from users where username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() && password.equals(rs.getString("password"))){
                verified = true;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return verified;
    }
    
    /**
     *
     * @param id
     * @param name
     * @param email
     * @param pass
     * @return
     */
    public boolean registerUser( int uniqueID,String name, String email, String pass){//Create
       int x = 0;
        
        try {
            PreparedStatement ps = con.createConnection().prepareStatement("Insert into users (ID, username, password,email ) values (? ,?, ?, ?)");
            ps.setInt(1,uniqueID);
            ps.setString(2, name);
            ps.setString(3, pass);
            ps.setString(4, email);
            
            x = ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return x == 1;
    }


}
