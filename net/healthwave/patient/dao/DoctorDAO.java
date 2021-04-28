
package net.healthwave.patient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import net.healthwave.patient.model.Department;
import net.healthwave.patient.model.Doctor;

/**
 *
 * @author Sparrow009
 */
public class DoctorDAO {
    
    private String jdbcURL = "jdbc:mysql://localhost:3307/demo?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "1234";



	private static final String SELECT_DOCTOR_BY_ID = "select dName,department from doctor where id =?";
	private static final String SELECT_ALL_DOCTORS = "select * from doctor";

        
        
        protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
        
        
       
      
        public Doctor selectDoctor(int id) {
		Doctor doctor = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DOCTOR_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String dName = rs.getString("dName");
                                String department = rs.getString("department");
                          
				doctor = new Doctor(dName, department);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctor;
	}
        
        
        public List<Doctor> selectAllDoctors() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Doctor> doctors = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DOCTORS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String dName = rs.getString("depName");
                                String department = rs.getString("status");
				doctors.add(new Doctor(id, dName, department));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return doctors;
	}
        
      
    
}
