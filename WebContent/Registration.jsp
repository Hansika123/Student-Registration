<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Registration</title>
</head>
<body>
<div>
            <form  role="form" action="responce" method="POST" required>
                <h2>Registration Form</h2>
                <div >
                    <label for="indexNo">Index No</label>
                    <div >
                        <input type="text" placeholder="Index Number"  autofocus name="indexNo" required>
                    </div>
                </div>                
                <div >
                    <label for="firstName">Student Name</label>
                    <div >
                        <input type="text" placeholder="Full Name"  autofocus name="sName" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="mobileNo" >Mobile Number</label>
                    <div class="col-sm-9">
                        <input type="number" placeholder="Mobile Number"  name = "mNo" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <div class="col-sm-9">
                        <input type="email"  placeholder="Email"  name = "eNo" required>
                    </div>
                </div>
                <div class="form-group">
                    <div >
                        <button type="submit" >Submit</button>
                    </div>
                </div>
            </form> <!-- /form -->
            <a href="View.jsp"><h3>Search student</h3></a>
        </div> <!-- ./container -->

</body>
</html>