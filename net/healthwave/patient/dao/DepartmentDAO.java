
package net.healthwave.patient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import net.healthwave.patient.model.Department;

/**
 *
 * @author Sparrow009
 */
public class DepartmentDAO {
    
    private String jdbcURL = "jdbc:mysql://localhost:3307/demo?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "1234";

	private static final String INSERT_DEPARTMENTS_SQL = "INSERT INTO department" + "  (depName, status) VALUES "
			+ " (?, ?);";

	private static final String SELECT_DEPARTMENT_BY_ID = "select depName,status from appointment where id =?";
	private static final String SELECT_ALL_DEPARTMENTS = "select * from department";
	private static final String DELETE_DEPARTMENTS_SQL = "delete from department where id = ?;";
	private static final String UPDATE_DEPARTMENTS_SQL = "update deapartment set depName = ?, status = ?  where id = ?;";
        
        
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
        
        
        public void insertDepartment(Department department) throws SQLException {
		System.out.println(INSERT_DEPARTMENTS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DEPARTMENTS_SQL)) {
			preparedStatement.setString(1, department.getDepName());
                        preparedStatement.setString(7, department.getStatus());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
        
        public boolean updateDepartment(Department department) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_DEPARTMENTS_SQL);) {
			statement.setString(1, department.getDepName());
                        statement.setString(7, department.getStatus());
                        
                        statement.setInt(8, department.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
        
        public Department selectDepartment(int id) {
		Department department = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DEPARTMENT_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String depName = rs.getString("depName");
                                String status = rs.getString("status");
                          
				department = new Department(id, depName, status);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return department;
	}
        
        
        public List<Department> selectAllDepartments() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Department> departments = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DEPARTMENTS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("appID");
				String depName = rs.getString("depName");
                                String status = rs.getString("status");
				departments.add(new Department(id, depName, status));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return departments;
	}
        
        public boolean deleteDepartment(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_DEPARTMENTS_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}
    
}
