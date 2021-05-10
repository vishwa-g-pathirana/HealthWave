/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import Model.Admin.AppoinmentCRUD;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pubz
 */
@WebServlet(name = "GetAllAppoinment", urlPatterns = {"/GetAllAppoinment"})
public class GetAllAppoinment extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<th>ID</th>");
        out.println("<th>Patient Name</th>");
        out.println("<th>Department</th>");
        out.println("<th>Doctor</th>");
        out.println("<th>Date</th>");
        out.println("<th>Time</th>");
        out.println("<th>Email</th>");
        out.println("<th>Contact number</th>");
        out.println("<th>Message</th>");
        out.println("<th>Status</th>");
        out.println("</tr>");
        
        AppoinmentCRUD app = new AppoinmentCRUD();
  
        try {
            
            ResultSet rs = app.getAll();
            
            while(rs.next()){
                int id = rs.getInt("ID");
                String patient = rs.getString("Pname");
                String depart = rs.getString("Dep");
                String doctor = rs.getString("Dname");
                String date = rs.getString("Date");
                String time = rs.getString("Time");
                String mail = rs.getString("Pmail");
                String number = rs.getString("Pnum");
                String message = rs.getString("Message");
                String status = rs.getString("Status");
                
                out.println("<tr>");
                out.println("<td>"+id+"</td>");
                out.println("<td>"+patient+"</td>");
                out.println("<td>"+depart+"</td>");
                out.println("<td>"+doctor+"</td>");
                out.println("<td>"+date+"</td>");
                out.println("<td>"+time+"</td>");
                out.println("<td>"+mail+"</td>");
                out.println("<td>"+number+"</td>");
                 out.println("<td>"+message+"</td>");
                out.println("<td>"+status+"</td>");
                
                out.println("<td><form method='get' action='/blink/profiles/adminprofile/edit-appointment.html'>"
                        + "<input type='hidden' value="+id+" name='id'>"
                        + "<input type='submit' value='update'></form></td>");
                
                out.println("<td><form method='get' action='AppointmentDELETE'>"
                        + "<input type='hidden' value="+id+" name='id'>"
                        + "<input type='submit' value='delete'></form></td>");
                out.println("</tr>");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        out.println("</table>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
