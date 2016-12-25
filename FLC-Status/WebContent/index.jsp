<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Foreign Labor Condition</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href="css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
      <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/smoothness/jquery-ui.css">
    
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
                    <a class="navbar-brand"><i class="fa fa-square-o "></i>&nbsp;Foreign Labor Condition : H1B </a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="signup.jsp">Register</a></li>
                        <li><a href="userLogin.jsp">Login</a></li>
                    </ul>
                </div>

            </div>
        </div>
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <a href="index.html"><i class="fa fa-desktop "></i>Dashboard</a>
                    </li>
                </ul>

            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h2>Dashboard - H1B Status</h2>
                    </div>
                </div>

                <div class="row">
                    <label></label>
                    </div>
                <div class="row">
                    <label></label>
                    </div>
            <form action="SearchResultController" method="post">
                <div class="row">
                    <div class="col-md-4">
                        <div class="form-group">
                            <input type="search" id="search" name="Company" placeholder="Seach by Employer Name" class="form-control" />
                        </div>
                    </div>
                     <div class="col-md-4">
                        <div class="form-group">
                            <input name="Job Title" placeholder="Search by Job Title" class="form-control" />
                        </div>
                    </div>
                     <div class="col-md-4">
                        <div class="form-group">
                            <input name="City" placeholder="Seach by City" class="form-control" />
                        </div>
                    </div>
                    <div class="row">
                            <div class="col-md-4">
                            <input type="hidden" name="action" value="search" >
                   <button type="submit" class="btn btn-info">Search</button>
                                </div>
                        </div>

                      <!-- table  -->

               <div class="row">

                        <div class="form-group">

                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Employer </th>
                                    <th>Job Title</th>
                                    <th>Location</th>
                                    <th>Base Salary</th>
                                    <th>Case Status</th>
                                </tr>
                            </thead>
                           
                            <tbody>
                             <c:forEach var="product" items="${products}">
                                <tr>
                                <td><c:out value="${product.employerName}"/></td>
                                 <td><c:out value="${product.jobTitle}"/></td>
                                <td><c:out value="${product.location}"/></td>
                                <td>${product.baseSal}</td>
                                <td>${product.status}</td>
                                
                                </tr>
                            </c:forEach>      
                            </tbody>
                        </table>
                    </div>

                   <!-- table ends -->

            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
        </form>
    </div>
    <!-- /. WRAPPER  -->
    </div>
    </div>
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="js/jquery.metisMenu.js"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="js/custom.js"></script>
    <script src="js/jquery-ui.js"></script>
     <script src="js/autocompleter.js"></script>
</body>
</html>
