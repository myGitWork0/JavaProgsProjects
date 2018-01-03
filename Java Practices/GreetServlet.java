import javax.servlet.*;
import java.io.*;
public class GreetServlet extends GenericServlet
{
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
     {
       String  name= req.getParameter("t1");
        String mesg="hello  "+name+ " welcome" ;
         res.setContentType("text/html");
         PrintWriter out=res.getWriter();
         out.println("<HTML>");
         out.println("<BODY BGCOLOR=red>");
         out.println("<H1>" +mesg+ "</H1>");
         out.println("</BODY>");
         out.println("</HTML>");
         out.close();
      }
}
