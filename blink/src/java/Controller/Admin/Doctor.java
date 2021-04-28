/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import Model.Admin.DepartmentCRUD;
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
@WebServlet(name = "Doctor", urlPatterns = {"/Doctor"})
public class Doctor extends HttpServlet {

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
   
        PrintWriter out = response.getWriter();
        DepartmentCRUD dep = new DepartmentCRUD();
        
        Random rand = new Random();
        int docID = rand.nextInt(99999);
        String Fname = request.getParameter("Fname");
        String Lname = request.getParameter("Lname");
        String username = request.getParameter("username");
        String email = request.getParameter("mail");
        String pass = request.getParameter("pass");
        String Cpass = request.getParameter("Cpass");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String code = request.getParameter("code");
        String phone = request.getParameter("phone");
        String bio = request.getParameter("bio");
        String status = request.getParameter("status");

        if(Cpass.equals(pass)){
           if(dep.addDoctor(docID,Fname,Lname, username, email, pass,  dob, gender , address, country,  city , state  ,code ,phone,  bio, status)){
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Added !! ');");
                out.println("location='profiles/adminprofile/doctors.html';");
                out.println("</script>");
            }
            else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Error :( ');");
                out.println("location='profiles/adminprofile/add-doctor.html';");
                out.println("</script>");
            }   
        }
        else{
            out.println("<script type=\"text/javascript\">");
                out.println("alert('Passwords do not match');");
                out.println("location='profiles/adminprofile/add-doctor.html';");
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
        response.setContentType("text/html;charset=UTF-8"); 
        
        PrintWriter out = response.getWriter();
        DepartmentCRUD dep = new DepartmentCRUD();
        
        Random rand = new Random();
        int docID = rand.nextInt(99999);
        String Fname = request.getParameter("Fname");
        String Lname = request.getParameter("Lname");
        String username = request.getParameter("username");
        String email = request.getParameter("mail");
        String pass = request.getParameter("pass");
        String Cpass = request.getParameter("Cpass");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String code = request.getParameter("code");
        String phone = request.getParameter("phone");
        String bio = request.getParameter("bio");
        String status = request.getParameter("status");

       if(Cpass.equals(pass)){
           if(dep.addDoctor(docID,Fname,Lname, username, email, pass,  dob, gender , address, country,  city , state  ,code ,phone,  bio, status)){
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully Added !! ');");
                out.println("location='profiles/adminprofile/doctors.html';");
                out.println("</script>");
            }
            else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Error :( ');");
                out.println("location='profiles/adminprofile/add-doctor.html';");
                out.println("</script>");
            }     
       }
       else{
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Passwords don't match')");
            out.println("location='profiles/adminprofile/add-doctor.html';");
            out.println("</script>");
       }
        
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
