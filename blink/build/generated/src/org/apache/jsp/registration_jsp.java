package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/reg.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"jquery/reg.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div ng-controller=\"DemoCtrl\" ng-cloak=\"\" class=\"md-inline-form\" ng-app=\"MyApp\" layout=\"column\" layout-sm=\"row\" layout-align=\"center center\" layout-align-sm=\"start start\" layout-fill>\n");
      out.write("\t<md-content id=\"SignupContent\" class=\"md-whiteframe-10dp\" flex-sm>\n");
      out.write("\t\t<md-toolbar flex id=\"materialToolbar\">\n");
      out.write("\t\t\t<div class=\"md-toolbar-tools\"> <span flex=\"\"></span> <span class=\"md-headline\" align=\"center\">Material Design Sign Up Form</span> <span flex=\"\"></span> </div>\n");
      out.write("\t\t</md-toolbar>\n");
      out.write("\t\t<div layout-padding=\"\">\n");
      out.write("\t\t\t<div></div>\n");
      out.write("\t\t\t<form name=\"userForm\" method=\"POST\" action=\"\" ng-submit=\"user.submit(userForm.$valid)\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"action\" value=\"signup\" />\n");
      out.write("\t\t\t\t<div layout=\"row\" layout-sm=\"column\">\n");
      out.write("\t\t\t\t\t<md-input-container flex-gt-sm=\"\">\n");
      out.write("\t\t\t\t\t\t<label>First name</label>\n");
      out.write("\t\t\t\t\t\t<input ng-model=\"user.first_name\" name=\"first_name\" required type=\"text\" ng-pattern=\"/^[a-zA-Z'. -]+$/\" placeholder=\"Your First Name\">\n");
      out.write("\t\t\t\t\t\t<div ng-if=\"userForm.first_name.$dirty\" ng-messages=\"userForm.first_name.$error\" role=\"alert\">\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"required\" class=\"my-message\">First Name is Required.</div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"pattern\" class=\"my-message\">Enter correct First Name.</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</md-input-container>\n");
      out.write("\t\t\t\t\t<md-input-container flex-gt-sm=\"\">\n");
      out.write("\t\t\t\t\t\t<label>Last Name</label>\n");
      out.write("\t\t\t\t\t\t<input ng-model=\"user.last_name\" name=\"last_name\" required type=\"text\" ng-pattern=\"/^[a-zA-Z'. -]+$/\" placeholder=\"Your Last Name\">\n");
      out.write("\t\t\t\t\t\t<div ng-if=\"userForm.last_name.$dirty\" ng-messages=\"userForm.last_name.$error\" role=\"alert\">\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"required\" class=\"my-message\">Last Name is Required.</div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"pattern\" class=\"my-message\">Enter correct Last Name.</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</md-input-container>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div layout=\"row\" layout-sm=\"column\">\n");
      out.write("\t\t\t\t\t<p style=\"font-size: 12px; margin-left: 3px; margin-top: 18px;\">Gender: </p>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"gender\" value=\"{{user.gender}}\" />\n");
      out.write("\t\t\t\t\t<md-radio-group style=\"margin: 12px 0 19px;\" ng-model=\"user.gender\" required>\n");
      out.write("\t\t\t\t\t\t<md-radio-button value=\"Male\" class=\"md-primary\">Male</md-radio-button>\n");
      out.write("\t\t\t\t\t\t<md-radio-button value=\"Female\">Female</md-radio-button>\n");
      out.write("\t\t\t\t\t</md-radio-group>\n");
      out.write("\t\t\t\t\t<md-input-container flex-gt-sm=\"60\">\n");
      out.write("\t\t\t\t\t\t<label>Age</label>\n");
      out.write("\t\t\t\t\t\t<input required type=\"number\" step=\"any\" name=\"age\" ng-model=\"user.age\" min=\"13\" max=\"100\" placeholder=\"20\" />\n");
      out.write("\t\t\t\t\t\t<div ng-if=\"userForm.age.$dirty\" ng-messages=\"userForm.age.$error\" role=\"alert\" multiple>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"required\">Age is Required.</div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"min\">Only Above 13 years Old are allowed.</div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"max\">Sorry {{userForm.age.$viewValue}} years old are not Allowed.</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</md-input-container>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div layout=\"row\" layout-sm=\"column\">\n");
      out.write("\t\t\t\t\t<md-input-container flex-gt-sm=\"\">\n");
      out.write("\t\t\t\t\t\t<label>Email</label>\n");
      out.write("\t\t\t\t\t\t<input required type=\"email\" name=\"email\" ng-model=\"user.email\" ng-pattern=\"/^[_a-z0-9-+]+(\\.[_a-z0-9-+]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$/\" placeholder=\"someone@example.com\" />\n");
      out.write("\t\t\t\t\t\t<div ng-if=\"userForm.email.$dirty\" ng-messages=\"userForm.email.$error\" role=\"alert\">\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"required\" class=\"my-message\">Email Address is Required.</div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"pattern\" class=\"my-message\">Enter Correct Email Address. </div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"email\" class=\"my-message\">Enter Correct Email Address. </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</md-input-container>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div layout=\"row\" layout-sm=\"column\">\n");
      out.write("\t\t\t\t\t<md-input-container flex-gt-sm=\"\">\n");
      out.write("\t\t\t\t\t\t<label>New Password</label>\n");
      out.write("\t\t\t\t\t\t<input name=\"password\" ng-model=\"user.password\" type=\"password\" minlength=\"8\" maxlength=\"100\" ng-pattern=\"/(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}/\" required placeholder=\"********\">\n");
      out.write("\t\t\t\t\t\t<div ng-if=\"userForm.password.$dirty\" ng-messages=\"userForm.password.$error\" role=\"alert\" multiple>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"required\">Password is Required.</div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"pattern\">Password should contain at least one number, one lowercase and one uppercase character.</div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"minlength\">Password should be greater than 8 letters.</div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"maxlength\">Password Can't be more than 100 letters.</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</md-input-container>\n");
      out.write("\t\t\t\t\t<md-input-container flex-gt-sm=\"\">\n");
      out.write("\t\t\t\t\t\t<label>Confirm Password</label>\n");
      out.write("\t\t\t\t\t\t<input name=\"confmPassword\" ng-model=\"user.confmPassword\" type=\"password\" minlength=\"8\" maxlength=\"100\" ng-pattern=\"/(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}/\" required compare-to=\"user.password\" placeholder=\"********\">\n");
      out.write("\t\t\t\t\t\t<div ng-if=\"userForm.confmPassword.$dirty\" ng-messages=\"userForm.confmPassword.$error\" role=\"alert\">\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"required\">Confirm Password is Required.</div>\n");
      out.write("\t\t\t\t\t\t\t<div ng-message=\"compareTo\">Password Doesn't Match.</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</md-input-container>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<md-button class=\"md-raised md-primary\" style=\"width:100%; margin: 0px 0px;\" type=\"submit\" ng-disabled=\"userForm.$invalid\" name=\"submit\">Submit</md-button>\n");
      out.write("\t\t\t\t<md-button class=\"md-raised md-primary\" ng-href=\"https://codepen.io/faizanrupani/pen/QjzMJp\" target=\"_blank\" style=\"width:100%; margin: 15px 0px 0px 0px;\">Code Pen Login Form</md-button>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</md-content>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
