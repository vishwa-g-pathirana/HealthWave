/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.healthwave.patient.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.healthwave.patient.dao.AppointmentDAO;
import net.healthwave.patient.model.Appointment;

/**
 *
 * @author Sparrow009
 */
@WebServlet("/")
public class AppointmentServlet extends HttpServlet {
    //private static final long serialVersionUID = 1L;
    
    private AppointmentDAO appointmentDAO;

    public AppointmentServlet() {
        this.appointmentDAO = new AppointmentDAO();
    }
    
    

      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
                            showNewForm(request, response);
                            break;
			case "/insert":
				insertAppointment(request, response);
				break;
			case "/delete":
				deleteAppointment(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateAppointment(request, response);
				break;
			default:
				listAppointment(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
        
    }
    
    
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("appointment-form.jsp");
		dispatcher.forward(request, response);
	}

    
    private void insertAppointment(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String pName = request.getParameter("pName");
		String pAge = request.getParameter("pAge");
		String dName = request.getParameter("doctor");
                String department = request.getParameter("department");
                String date = request.getParameter("date");
                String time = request.getParameter("time");
                String status = request.getParameter("status");
		Appointment newAppointment = new Appointment(pName, pAge, dName, department, date, time, status);
		appointmentDAO.insertAppointment(newAppointment);
		response.sendRedirect("list");
	}
  
    private void deleteAppointment(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("appID"));
		appointmentDAO.deleteAppointment(id);
		response.sendRedirect("list");

	}

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("appID"));
		Appointment existingAppointment = appointmentDAO.selectAppointment(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("appointment-form.jsp");
		request.setAttribute("appointment", existingAppointment);
		dispatcher.forward(request, response);

	}

    private void updateAppointment(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
        
		int id = Integer.parseInt(request.getParameter("appID"));
		String pName = request.getParameter("pName");
		String pAge = request.getParameter("pAge");
		String dName = request.getParameter("doctor");
                String department = request.getParameter("department");
                String date = request.getParameter("date");
                String time = request.getParameter("time");
                String status = request.getParameter("status");
                

		Appointment appointment = new Appointment(id, pName, pAge, dName, department, date, time, status);
		appointmentDAO.updateAppointment(appointment);
		response.sendRedirect("list");
	}
    
    
    private void listAppointment(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Appointment> listAppointment = appointmentDAO.selectAllAppointments();
		request.setAttribute("listAppointment", listAppointment);
		RequestDispatcher dispatcher = request.getRequestDispatcher("appoinmtent-list.jsp");
		dispatcher.forward(request, response);
	}
    
    
    
}
