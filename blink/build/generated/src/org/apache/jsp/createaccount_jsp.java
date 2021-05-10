package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <script\n");
      out.write("      src=\"https://kit.fontawesome.com/64d58efce2.js\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <link href=\"css/reg.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <title>Sign in & Sign up Form</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"forms-container\">\n");
      out.write("        <div class=\"signin-signup\">\n");
      out.write("          <form action=\"Login\" class=\"sign-in-form\" method =\"post\">\n");
      out.write("            <h2 class=\"title\">Sign in</h2>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-user\"></i>\n");
      out.write("              <input type=\"text\" placeholder=\"Username\" name=\"username\" required />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-lock\"></i>\n");
      out.write("              <input type=\"password\" placeholder=\"Password\" name=\"password\" required/>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" action=\"Login\" value=\"Login\" class=\"btn solid\" />\n");
      out.write("            <p class=\"social-text\">Or Sign in with social platforms</p>\n");
      out.write("            <div class=\"social-media\">\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-twitter\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-google\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("          <form action=\"Register\" class=\"sign-up-form\" method =\"post\">\n");
      out.write("            <h2 class=\"title\">Sign up</h2>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-user\"></i>\n");
      out.write("              <input type=\"text\" placeholder=\"Username\" name=\"name\" required/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-envelope\"></i>\n");
      out.write("              <input type=\"email\" placeholder=\"Email\" name=\"email\"required />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-lock\"></i>\n");
      out.write("              <input type=\"password\" placeholder=\"Password\" name=\"pass\" required/>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" class=\"btn\" value=\"Sign up\" />\n");
      out.write("            <p class=\"social-text\">Or Sign up with social platforms</p>\n");
      out.write("            <div class=\"social-media\">\n");
      out.write("              <a href=\"https://touch.facebook.com/login/\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-twitter\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-google\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"social-icon\">\n");
      out.write("                <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"panels-container\">\n");
      out.write("        <div class=\"panel left-panel\">\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>New here ?</h3>\n");
      out.write("            <p>\n");
      out.write("              Stay Home, Stay safe Join with HealthCare and manage your \n");
      out.write("              hospital services on mobile\n");
      out.write("            </p>\n");
      out.write("            <button class=\"btn transparent\" id=\"sign-up-btn\">\n");
      out.write("              Sign up\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <img src=\"image/log.png\" class=\"image\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel right-panel\">\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>One of us ?</h3>\n");
      out.write("            <p>\n");
      out.write("              Distance mean so little when life means so much ... \n");
      out.write("              stay at home to be safe \n");
      out.write("            </p>\n");
      out.write("            <button class=\"btn transparent\" id=\"sign-in-btn\">\n");
      out.write("              Sign in\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <img src=\"image/register.png\" class=\"image\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      <script src=\"jquery/reg.js\" type=\"text/javascript\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
