<%-- 
    Document   : signup
    Created on : Nov 20, 2016, 7:04:29 PM
    Author     : monik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
          <link href="css/bootstrap.css" rel="stylesheet" />
    <link href="ss/font-awesome.css" rel="stylesheet" />
    <link href="css/custom.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
         <link rel="stylesheet" href="css/style.css">
         <link rel="stylesheet" href="css/style1.css">
    </head>

    <body>
    <div id="wrapper">
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="adjust-nav">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand">&nbsp;Foreign Labor Condition : H1B </a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="userLogin.jsp">Login</a></li>
                        <li><a href="index.jsp">Home</a></li>
                    </ul>
                </div>

            </div>
        </div>
               <div  class="pen-title"> <h1>Create your account to login</h1></div>
   
    <div class="login-page">
   <p>${message}</p>
  <div class="form1">
    <form class="login-form" action="H1bServlet" method="post">
      <input type="text" name="company_name" placeholder="Company Name"/>
       <input type="text" name="username" placeholder="Username"/>
      <input type="password" name="password" placeholder="Password"/>
      <input type="password" name="cnfpassword" placeholder="Confirm Password"/>
      <input type="hidden" name="action" value="signup"/>
      <input type="submit" value="Create Account"/>
    </form>
    </div>
      </div>
        </div>
</body>
</html>
 