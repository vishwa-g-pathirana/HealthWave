/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pubz
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
        processRequest(request, response);PrintWriter out=response.getWriter();
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
        
        PrintWriter out = response.getWriter();
        User user = new User();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if("chandana".equals(username)){
            if ("chandana123".equals(password)) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Login successfull.');");
            out.println("location='profiles/doctorprofile/activities.html';");
            out.println("</script>");
            }
        }
        if("admin".equals(username)){
            if ("admin123".equals(password)) {
                out.println("<script type=\"text/javascript\">");
            out.println("alert('Login successfull.');");
            out.println("location='profiles/adminprofile/activities.html';");
            out.println("</script>");
            }
        }
        else if(user.verifyUser(username, password)){
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Login successfull.');");
            out.println("location='profiles/patientprofile/activityOne.html';");
            out.println("</script>");
            HttpSession session=request.getSession();
            session.setMaxInactiveInterval(600);
        }else {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Login failed');");
            out.println("location='createaccount.jsp';");
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
