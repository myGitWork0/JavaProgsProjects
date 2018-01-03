<%-- 
    Document   : Logout
    Created on : Dec 5, 2017, 4:40:36 PM
    Author     : pavan
--%>

<html lang="en">
<head>
  <title>Job Portal</title>
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
      <li class="active"><a href="#">Logout</a></li>
      <li><a href="studentreg.html">Student Registration</a></li>
      <li><a href="facultyreg.html">Faculty Registration</a></li>
    </ul>
  </div>
</nav>    
        <% session.invalidate(); %>
        <p>You have been successfully logout</p>
    </body>
</html>
