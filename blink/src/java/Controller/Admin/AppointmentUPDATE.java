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
@WebServlet(name = "AppointmentUPDATE", urlPatterns = {"/AppointmentUPDATE"})
public class AppointmentUPDATE extends HttpServlet {

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
       PrintWriter out = response.getWriter();
       String Pname = "";
        String Dep = "";
        String Dname = "";
        String date="";
        String Time="";
        String mail="";
        String num="";
        String message="";
       String status = request.getParameter("stat");
        
        AppoinmentCRUD app = new AppoinmentCRUD();
        String id = request.getParameter("id");

           try {
            ResultSet rsa = app.getAppoinment(id);
            
            if(rsa.next()){
                 Pname = rsa.getString("Pname");
                 Dep = rsa.getString("Dep");
                 Dname = rsa.getString("Dname");
                 date = rsa.getString("Date");
                 Time = rsa.getString("Time");
                 mail = rsa.getString("Pmail");
                 num = rsa.getString("Pnum");
                 message = rsa.getString("Message");
                 status = rsa.getString("Status");  
            }
           }
           catch (Exception e) {
            System.out.println(e.getMessage());
           }
    
        if(request.getParameter("pname") != null && !request.getParameter("pname").isEmpty()){
            Pname = request.getParameter("pname");
        }
        if(request.getParameter("Dep") != null && !request.getParameter("Dep").isEmpty()){
            Dep = request.getParameter("Dep");
        }
        if(request.getParameter("dname") != null && !request.getParameter("dname").isEmpty()){
            Dname = request.getParameter("dname");
        }
        if(request.getParameter("date") != null && !request.getParameter("date").isEmpty()){
            date = request.getParameter("date");
        }
        if(request.getParameter("time") != null && !request.getParameter("time").isEmpty()){
            Time = request.getParameter("time");
        }
        if(request.getParameter("mail") != null && !request.getParameter("mail").isEmpty()){
            mail = request.getParameter("mail");
        }
        if(request.getParameter("number") != null && !request.getParameter("number").isEmpty()){
            num = request.getParameter("number");
        }
        if(request.getParameter("message") != null && !request.getParameter("message").isEmpty()){
            message = request.getParameter("message");
        }
                      
        if(app.updateAppointment(id, Pname, Dep, Dname,date,Time,mail,num,message,status)){
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Successfully Updated !! ');");
            out.println("location='profiles/adminprofile/appointments.html';");
            out.println("</script>");
        }else{
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Error :( ');");
            out.println("location='profiles/adminprofile/appointments.html';");
            out.println("</script>");
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
