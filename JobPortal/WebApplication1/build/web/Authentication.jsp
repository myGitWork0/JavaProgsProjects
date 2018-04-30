<%-- 
    Document   : Authentication
    Created on : Nov 12, 2017, 6:10:09 PM
    Author     : pavan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logging</title>
    </head>
    <body>
        <%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
String userid=request.getParameter("usr"); 
//session.putValue("userid",userid);
session.setAttribute("userid", userid);
String pwd=request.getParameter("pwd"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tse","root","PAVAN"); 
Statement st= con.createStatement(); 
ResultSet rs=st.executeQuery("select * from login where id='"+userid+"' "); 
if(rs.next()) 
{ 
if(rs.getString(3).equals(pwd)) 
{   
    session.putValue("pwd",pwd);
    out.println("welcome"+userid);
    if(rs.getString(4).equalsIgnoreCase("student"))
        response.sendRedirect("http://localhost:8080/WebApplication1/StudentPage.jsp");
    else
        response.sendRedirect("http://localhost:8080/WebApplication1/FacultyPage.jsp");
} 
else 
{ 
    out.println("Invalid password try again"); 
    response.sendRedirect("http://localhost:8080/WebApplication1/");
} 
} 
else{
    response.sendRedirect("http://localhost:8080/WebApplication1/");
} 
%>
    </body>
</html>
