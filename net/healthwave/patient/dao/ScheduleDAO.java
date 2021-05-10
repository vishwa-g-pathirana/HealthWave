
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
import net.healthwave.patient.model.Schedule;

/**
 *
 * @author Sparrow009
 */
public class ScheduleDAO {
    
    private String jdbcURL = "jdbc:mysql://localhost:3307/demo?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "1234";

	private static final String SELECT_SCHEDULE_BY_ID = "select dName,department from doctor where id =?";
	private static final String SELECT_ALL_SCHEDULE = "select * from doctor";
        
        
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
        
        
       
      
        public Schedule selectSchedule(int id) {
		Schedule schedule= null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SCHEDULE_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String dName = rs.getString("dName");
                                String department = rs.getString("dep");
                                String date = rs.getString("date");
                                String time = rs.getString("time");
                                String status = rs.getString("status");
				schedule = new Schedule(id,dName, department, date, time , status);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return schedule;
	}
        
        
        public List<Schedule> selectAllSchedule() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Schedule> schedules = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SCHEDULE);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String dName = rs.getString("dName");
                                String department = rs.getString("dep");
                                String date = rs.getString("date");
                                String time = rs.getString("time");
                                String status = rs.getString("status");
				schedules.add(new Schedule(id, dName, department, date, time, status));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return schedules;
	}
        
      
    
}
