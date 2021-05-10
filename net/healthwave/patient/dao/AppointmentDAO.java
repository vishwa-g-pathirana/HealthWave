
package net.healthwave.patient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import net.healthwave.patient.model.Appointment;

/**
 *
 * @author Sparrow009
 */
public class AppointmentDAO {
    
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "1234";

	private static final String INSERT_APPOINTMENTS_SQL = "INSERT INTO appointment" + "  (pName, pAge, doctor, department, date, time, status) VALUES "
			+ " (?, ?, ?, ?, ?, ?, ?);";

	private static final String SELECT_APPOINTMENT_BY_ID = "select appID,pName,pAge,doctor,department,date,time,status from appointment where appID =?";
	private static final String SELECT_ALL_APPOINTMENTS = "select * from appointment";
	private static final String DELETE_APPOINTMENTS_SQL = "delete from appointment where appID = ?;";
	private static final String UPDATE_APPOINTMENTS_SQL = "update appointment set pName = ?, pAge= ?, doctor = ?, department = ?, date = ?,"
                + "time = ?, status = ?  where appID = ?;";
        
        
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
        
        
        public void insertAppointment(Appointment appointment) throws SQLException {
		System.out.println(INSERT_APPOINTMENTS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_APPOINTMENTS_SQL)) {
			preparedStatement.setString(1, appointment.getName());
			preparedStatement.setString(2, appointment.getAge());
                        preparedStatement.setString(3, appointment.getdName());
			preparedStatement.setString(4, appointment.getDepartment());
                        preparedStatement.setString(5, appointment.getDate());
                        preparedStatement.setString(6, appointment.getTime());
                        preparedStatement.setString(7, appointment.getStatus());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
        
        public boolean updateAppointment(Appointment appointment) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_APPOINTMENTS_SQL);) {
			statement.setString(1, appointment.getName());
			statement.setString(2, appointment.getAge());
			statement.setString(3, appointment.getdName());
			statement.setString(4, appointment.getDepartment());
                        statement.setString(5, appointment.getDate());
                        statement.setString(6, appointment.getTime());
                        statement.setString(7, appointment.getStatus());
                        
                        statement.setInt(8, appointment.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
        
        public Appointment selectAppointment(int id) {
		Appointment appointment = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_APPOINTMENT_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String pName = rs.getString("pName");
				String pAge = rs.getString("pAge");
				String dName = rs.getString("doctor");
                                String department = rs.getString("department");
                                String date = rs.getString("date");
                                String time = rs.getString("time");
                                String status = rs.getString("status");
                          
				appointment = new Appointment(id, pName, pAge, dName, department, date, time, status);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return appointment;
	}
        
        
        public List<Appointment> selectAllAppointments() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Appointment> appointments = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_APPOINTMENTS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("appID");
				String pName = rs.getString("pName");
				String pAge = rs.getString("pAge");
				String dName = rs.getString("doctor");
                                String department = rs.getString("department");
                                String date = rs.getString("date");
                                String time = rs.getString("time");
                                String status = rs.getString("status");
				appointments.add(new Appointment(id, pName, pAge, dName, department, date, time, status));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return appointments;
	}
        
        public boolean deleteAppointment(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_APPOINTMENTS_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}
    
}
