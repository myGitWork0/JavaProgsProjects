<%-- 
    Document   : StudentPage
    Created on : Dec 2, 2017, 11:28:48 PM
    Author     : pavan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
  <title>Faculty</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h3>Faculty</h3>
  <ul class="list-inline">
    <li><a href="settings.jsp" style="text-align: right;">Settings</a></li>
    <li><a href="Logout.jsp" style="text-align: right;">Logout</a></li>
  </ul>
  <h1> ${userid} </h1>
  <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Show jobs</a>
        </h4>
      </div>
      <div id="collapse2" class="panel-collapse collapse">
          <div class="panel-body">
              <%
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
                        %>
                            <a href="http://localhost:8080/WebApplication1/Applyjsp.jsp?value=<%= position %>&facultyid=<%= f %>" ><input type="button" class="btn btn-info" value="Apply" name="Apply"></a>
                        <%
                    }
                    
              %>
          </div>
      </div>
    </div>
          
          
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Applied Jobs</a>
        </h4>
      </div>
      <div id="collapse2" class="panel-collapse collapse">
          <div class="panel-body">
              <%
                   Class.forName("com.mysql.jdbc.Driver"); 
                   java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/tse","root","PAVAN"); 
                    Statement st1= con1.createStatement();
                    String r=session.getAttribute("userid").toString();
                    ResultSet rs1=st1.executeQuery("select jobname from appliedstudents where studentid ='"+r+"' ");
                    while(rs1.next()){
                        out.println("JOB NAME : "+rs1.getString(1));
                    }
              %>
           </div>
      </div>
    </div>
        
        
        
    </body>
</html>
