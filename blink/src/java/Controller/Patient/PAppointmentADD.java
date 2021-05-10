/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Patient;

import Model.Admin.AppoinmentCRUD;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pubz
 */
@WebServlet(name = "PAppointmentADD", urlPatterns = {"/PAppointmentADD"})
public class PAppointmentADD extends HttpServlet {

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
        AppoinmentCRUD app = new AppoinmentCRUD();
        
        Random rand = new Random();
        int appID = rand.nextInt(999999);
        String Pname = request.getParameter("pname");
        String Dep = request.getParameter("Dep");
        String Dname = request.getParameter("dname");
        String date=request.getParameter("date");
        String Time=request.getParameter("time");
        String mail=request.getParameter("mail");
        String num=request.getParameter("number");
        String  message=request.getParameter("message");
        String  status=request.getParameter("stat");
                
        if(app.addappoinment(appID, Pname, Dep, Dname,date,Time,mail,num,message,status)){
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Successfully Added !! ');");
            out.println("location='profiles/patientprofile/appointments.html';");
            out.println("</script>");
        }
        else{
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Error :( ');");
            out.println("location='profiles/patientprofile/add-appointment.html';");
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
