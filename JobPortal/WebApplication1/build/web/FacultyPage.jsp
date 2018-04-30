<%-- 
    Document   : FacultyPage
    Created on : Dec 3, 2017, 12:05:27 AM
    Author     : pavan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
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
  
   <div class="panel-group" id="accordion">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Applied Students</a>
        </h4>
      </div>
      <div id="collapse1" class="panel-collapse collapse in">
        <div class="panel-body">
            <%@ page import ="java.sql.*" %>
    <%@ page import ="javax.sql.*" %>
    <%
        Class.forName("com.mysql.jdbc.Driver"); 
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tse","root","PAVAN"); 
        Statement st= con.createStatement();
        Statement st2=con.createStatement();
        String r=session.getAttribute("userid").toString();
        ResultSet rs=st.executeQuery("select studentid,jobname from appliedstudents where facultyid ='"+r+"' ");
        while(rs.next()){
            ResultSet rs2=st2.executeQuery("select id,name,email,phone,gpa,department from student where id='"+rs.getString(1)+"'");
            while(rs.next()){
                out.println("STUDENT ID : "+rs2.getString(1));
                out.println("STUDENT NAME : "+rs2.getString(2));
                out.println("STUDENT Email : "+rs2.getString(3));
                out.println("STUDENT Phone : "+rs2.getString(4));
                out.println("STUDENT GPA : "+rs2.getFloat(5));
                out.println("STUDENT Department : "+rs2.getString(6));
                out.println("\n");
            }
        }
        %>
        </div>
      </div>
    </div>
       
     <div class="panel-group" id="accordion">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Posted Jobs</a>
        </h4>
      </div>
      <div id="collapse2" class="panel-collapse collapse in">
        <div class="panel-body">
            <%@ page import ="java.sql.*" %>
    <%@ page import ="javax.sql.*" %>
    <%
        Class.forName("com.mysql.jdbc.Driver"); 
        java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/tse","root","PAVAN"); 
        Statement st1= con1.createStatement();
        ResultSet rs1=st1.executeQuery("select positionname,location from jobdetails where facultyid='"+r+"' "); 
        int i=0;
        while(rs1.next()){
              String s=rs1.getString(1);
              
             out.println("JOB is applied by "+i+" : "+s);
        }
        %>
        </div>
      </div>
    </div>
       
       
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Post a job</a>
        </h4>
      </div>
      <div id="collapse3" class="panel-collapse collapse">
        <div class="panel-body">
           <form action="addjob.jsp">
    <div class="form-group">
      <label for="positionname">Position Name:</label>
      <input type="text" class="form-control" id="positionname" name="positionname">
    </div>
    <div class="form-group">
      <label for="location">Location:</label>
      <input type="text" class="form-control" id="location" name="location">
    </div>
    <div class="form-group">
      <label for="department">Department :</label>
      <input type="text" class="form-control" id="department" name="department">
    </div>
    <div class="form-group">
    <label for="requirements">requirements :</label>
    <textarea class="form-control" rows="5" id="requirements" name="requirements"></textarea>
    </div>
    <div class="form-group">
      <label for="details">Contact details :</label>
    </div>
    <div class="form-group">
      <label for="phoneno">Phone no :</label>
      <input type="text" class="form-control" id="phoneno" name="phoneno">
    </div>
    <div class="form-group">
      <label for="facultyid">Faculty ID :</label>
      <input type="text" class="form-control" id="facultyid" name="facultyid">
    </div>
    <div class="form-group">
      <label for="phoneno">Mail ID</label>
      <input type="email" class="form-control" id="mail" name="mail">
    </div>
    <br>
    <input type="submit" class="form-button" id="submit" value="POST">
  </form>
        </div>
      </div>
    </div>
  
</div>
</body>
</html>