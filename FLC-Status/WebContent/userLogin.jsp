
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
                        <li><a href="signup.jsp">Register</a></li>
                        <li><a href="index.jsp">Home</a></li>
                    </ul>
                </div>

            </div>
        </div>
               <div  class="pen-title"> <h1>Please login to see company details</h1></div>
   
    <div class="login-page">
      <p>${message}</p>
<div class="form1">
 
    <form class="login-form" action="H1bServlet" method="post">
    
      <input type="text" name="username" placeholder="username"/>
      <input type="password" name="password" placeholder="password"/>
        <input type="hidden" name="action" value="login"/>
      <input type="submit" value="Login"/>
    </form>
  </div>
</div>
</div>  
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js">
    
    </script>
    
    </body>
</html>
