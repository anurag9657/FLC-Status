<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="utility.DBUtility"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Case</title>
         <link href="css/bootstrap.css" rel="stylesheet" />
    <link href="css/font-awesome.css" rel="stylesheet" />
    <link href="css/custom.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
         <link rel="stylesheet" href="css/style.css">
                  <link rel="stylesheet" href="css/style1.css">
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

            </div>
        </div>
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <a href="index.jsp"><i class="fa fa-desktop "></i>Dashboard</a>
                    </li>
                    <li>
                        <a href="index.jsp"><i class="fa fa-desktop "></i>Employers</a>
                    </li>

                </ul>

            </div>

        </nav>
             <div id="page-wrapper">
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h2>Add New Case Details ></h2>
                    </div>
                </div>
  <div class="form">  
  <form action="UpdateCaseServlet" method="post" onsubmit='checkit()'>
   <div class="form-group col-md-6">
    <label for="fname">Employer Name:</label>
    <input type="text" id="ename" name="employerName" required>
  </div>
  <div class="form-group col-md-6">
    <label for="lname">Case No:</label>
    <input type="text" id="caseno" name="caseNo" required>
</div>
    <div class="form-group col-md-6">
    <label for="lsdate">Job Title:</label>
    <input type="text" id="jobtitle" name="jobTitle" required>
</div>
 <div class="form-group col-md-6">
    <label for="workCity">Work City:</label>
    <input type="text" id="workcity" name="workCity" required>
</div>
 <div class="form-group col-md-6">
    <label for="workState">Work State:</label>
    <input type="text" id="workstate" name="workState" required>
</div>
<div class="form-group col-md-6">
    <label for="baseSalary">Base Salary:</label>
    <input type="text" id="basesalary" name="baseSalary" required>
</div>
<%
								Connection conn = DBUtility.getConnection();
								PreparedStatement pst = conn.prepareStatement("select wage_source from case_details where wage_source='S' or wage_source='O' or wage_source='C'");
								ResultSet rs = pst.executeQuery();
							%>
<div class="form-group col-md-4">
    <label for="wageSource">Wage Source:</label>
    <select class="form-control" id="wagesource" name="wageSource" required>
    <option value="S">S</option>
  <option value="O">O</option>
  <option value="C">C</option>
  </select>
</div>
<div class="form-group col-md-4">
    <label for="program">Program:</label>
    <select class="form-control" id="program" name="program" required>
   <option value="R">R</option>
  <option value="A">A</option>
  <option value="C">C</option>
  <option value="S">S</option>
  </select>
</div>
<div class="form-group col-md-4">
    <label for="withdrawn">Withdrawn:</label>
    <select class="form-control" id="withdrawn" name="withdrawn" required>
    <option value="Y">Y</option>
  <option value="N">N</option>
   </select>
</div>

<div class="form-group col-md-2">
   <button type="submit" class="btn btn-block btn-primary btn-lg">Update</button>
</div>
      <div class="form-group col-md-2">
								<button type="reset" class="btn btn-block btn-danger btn-lg">Reset</button>
							</div>
  </form>
  </div>
</div>
  </div>
</div>
 <script src="js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="js/jquery.metisMenu.js"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="js/custom.js"></script>
    <script src="js/jquery-ui.js"></script>
    <script>
    function checkit(){
        $.post( "ajax/test.jsp",
            $('#form').serialize(),
            function( data ) {
            if(data == "success"){
                alert("success");
            }
        });
    }
</script>
</body>
</html>