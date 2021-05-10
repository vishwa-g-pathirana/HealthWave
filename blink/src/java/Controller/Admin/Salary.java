/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import Model.Admin.PatientCRUD;
import Model.Admin.SalaryCRUD;
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
@WebServlet(name = "Salary", urlPatterns = {"/Salary"})
public class Salary extends HttpServlet {

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
            
        SalaryCRUD sal = new SalaryCRUD();
        
        Random rand = new Random();
        int SID = rand.nextInt(999999999);
        String name = request.getParameter("name");
        String salary = request.getParameter("sal");
        String basic = request.getParameter("basic");
        String DA = request.getParameter("DA");
        String HRA = request.getParameter("HRA");
        String Conveyance = request.getParameter("Conveyance");
        String Allowance = request.getParameter("Allowance");
        String medical = request.getParameter("medical");
        String other1 = request.getParameter("other1");
        String TDS = request.getParameter("TDS");
        String ESI = request.getParameter("ESI");
        String PF = request.getParameter("PF");
        String Leave = request.getParameter("Leave");
        String Tax = request.getParameter("Tax");
        String welfare = request.getParameter("welfare");
        String fund = request.getParameter("fund");
        String other2 = request.getParameter("other2");

           if(sal.addSalary(SID,name,salary, basic, DA, HRA,  Conveyance, Allowance , medical, other1,  TDS , ESI  ,PF ,Leave,Tax,welfare,fund,other2)){
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Values Successfully Added !! ');");
                out.println("location='profiles/adminprofile/salary.html';");
                out.println("</script>");
            }
            else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Error :( ');");
                out.println("location='profiles/adminprofile/add-salary.html';");
                out.println("</script>");
            }   
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
