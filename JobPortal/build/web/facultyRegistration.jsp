<%-- 
    Document   : facultyRegistration
    Created on : Nov 13, 2017, 2:29:13 PM
    Author     : pavan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
  <title>Faculty Registration</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.html">JOB Portal</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="index.html">Login</a></li>
      <li><a href="studentreg.html">Student Registration</a></li>
      <li class="active"><a href="facultyreg.html">Faculty Registration</a></li>
    </ul>
  </div>
</nav> 
    <%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
    String username=request.getParameter("username");
    String facultyid=request.getParameter("facultyid");
    String authenticationid=request.getParameter("authenticationid");
    String phonenumber=request.getParameter("phonenumber");
    String email=request.getParameter("email");
    String department=request.getParameter("department");
    String role="Faculty";
    String password=request.getParameter("password");
    String repassword=request.getParameter("reenter_password");
    if(password.equals(repassword)){
    if(authenticationid.equals("abcdef123")){
       // session.setAttribute("userid", username);
        Class.forName("com.mysql.jdbc.Driver"); 
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tse","root","PAVAN"); 
        Statement st= con.createStatement(); 
        st.executeUpdate("insert into faculty(id,name,department,phone,email) values ('"+facultyid+"','"+phonenumber+"','"+email+"','"+username+"','"+department+"')");
        st.executeUpdate("insert into login(id,password,role,name) values ('"+facultyid+"','"+password+"','"+role+"','"+username+"')");
    }
    else{
        response.sendRedirect("http://localhost:8080/WebApplication1/ErrorPage.html");
    }
    }
    else{
        response.sendRedirect("http://localhost:8080/WebApplication1/ErrorPage.html");
    }
%>
    
    <h3>Hi <%= request.getParameter("username")%>, your registration is successful </h3>
    <h3> You can login with your username and password</h3>
    </body>
</html>
