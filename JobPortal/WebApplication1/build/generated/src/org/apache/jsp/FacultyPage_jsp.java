package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FacultyPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Faculty</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h3>Faculty</h3>\n");
      out.write("  <ul class=\"list-inline\">\n");
      out.write("    <li><a href=\"settings.jsp\" style=\"text-align: right;\">Settings</a></li>\n");
      out.write("    <li><a href=\"Logout.jsp\" style=\"text-align: right;\">Logout</a></li>\n");
      out.write("  </ul>\n");
      out.write("  \n");
      out.write("   <div class=\"panel-group\" id=\"accordion\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse1\">Applied Students</a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse1\" class=\"panel-collapse collapse in\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse2\">Post A Job</a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse2\" class=\"panel-collapse collapse\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("           <form action=\"addjob.jsp\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"positionname\">Position Name:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"positionname\" name=\"positionname\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"location\">Location:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"location\" name=\"location\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"department\">Department :</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"department\" name=\"department\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label for=\"requirements\">requirements :</label>\n");
      out.write("    <textarea class=\"form-control\" rows=\"5\" id=\"requirements\" name=\"requirements\"></textarea>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"details\">Contact details :</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"phoneno\">Phone no :</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"phoneno\" name=\"phoneno\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"facultyid\">Faculty ID :</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"facultyid\" name=\"facultyid\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"phoneno\">Mail ID</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"mail\" name=\"mail\">\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <input type=\"submit\" class=\"form-button\" id=\"submit\" value=\"POST\">\n");
      out.write("  </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
