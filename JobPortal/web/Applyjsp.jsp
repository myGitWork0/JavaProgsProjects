<%-- 
    Document   : Applyjsp
    Created on : Dec 5, 2017, 10:57:27 PM
    Author     : pavan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
        Class.forName("com.mysql.jdbc.Driver"); 
        java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/tse","root","PAVAN"); 
        Statement st1= con1.createStatement();
        String student=session.getAttribute("userid").toString();
        String faculty=request.getParameter("facultyid");
        String name=request.getParameter("value");
        st1.executeUpdate("insert into appliedstudents values ('"+student+"','"+faculty+"','"+name+"')");
        response.sendRedirect("http://localhost:8080/WebApplication1/StudentPage.jsp");
       %>
    </body>
</html>
