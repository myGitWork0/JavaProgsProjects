package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class StudentPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
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
      out.write("  <h1> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h1>\n");
      out.write("  <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse2\">Show jobs</a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse2\" class=\"panel-collapse collapse\">\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("              ");

                    Class.forName("com.mysql.jdbc.Driver"); 
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tse","root","PAVAN"); 
                    Statement st= con.createStatement();
                    ResultSet rs=st.executeQuery("select * from jobdetails ");
                    while(rs.next()){
                        String position=rs.getString(1);
                        
                        out.print("POSITION NAME: "+position);
                        out.print("LOCATION : "+rs.getString(2));
                        out.print("DEPARTMENT NAME: "+rs.getString(3));
                        out.print("REQUIREMENTS are : "+rs.getString(4));
                        out.print("PHONE NUM: "+rs.getString(5));
                        String f=rs.getString(6);
                        out.print("FACULTY MAIL: "+rs.getString(7));
                        
      out.write("\n");
      out.write("                            <a href=\"http://localhost:8080/WebApplication1/Applyjsp.jsp?value=");
      out.print( position );
      out.write("&facultyid=");
      out.print( f );
      out.write("\" ><input type=\"button\" class=\"btn btn-info\" value=\"Apply\" name=\"Apply\"></a>\n");
      out.write("                        ");

                    }
                    
              
      out.write("\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">\n");
      out.write("          <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse2\">Applied Jobs</a>\n");
      out.write("        </h4>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"collapse2\" class=\"panel-collapse collapse\">\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("              ");

                   Class.forName("com.mysql.jdbc.Driver"); 
                   java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/tse","root","PAVAN"); 
                    Statement st1= con1.createStatement();
                    String r=session.getAttribute("userid").toString();
                    ResultSet rs1=st1.executeQuery("select jobname from appliedstudents where studentid ='"+r+"' ");
                    while(rs1.next()){
                        out.println("JOB NAME : "+rs1.getString(1));
                    }
              
      out.write("\n");
      out.write("           </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
