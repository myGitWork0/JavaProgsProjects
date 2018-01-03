<%-- 
    Document   : addjob.jsp
    Created on : Dec 5, 2017, 8:49:07 PM
    Author     : pavan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
        Class.forName("com.mysql.jdbc.Driver"); 
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tse","root","PAVAN"); 
        Statement st= con.createStatement(); 
        String positionname=request.getParameter("positionname");
        String location=request.getParameter("location");
        String department=request.getParameter("department");
        String requirements=request.getParameter("requirements");
        String phoneno=request.getParameter("phoneno");
        String facultyid=request.getParameter("facultyid");
        String mail=request.getParameter("mail");
        st.executeUpdate("insert into jobdetails values ('"+positionname+"','"+location+"','"+department+"','"+requirements+"','"+phoneno+"','"+facultyid+"','"+mail+"')");
        response.sendRedirect("http://localhost:8080/WebApplication1/FacultyPage.jsp");
    %>
    </body>
</html>
