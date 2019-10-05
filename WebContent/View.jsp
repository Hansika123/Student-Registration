<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Registration</title>
</head>
<body>
<div >
            <form  role="form" action="result.jsp" method="POST">
                <h2>Enter indexNo</h2>
                <div >
                    <label for="indexNo" >Index No</label>
                    <div class="col-sm-9">
                        <input type="text" placeholder="Index Number"  autofocus name="indexNo">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <button type="submit">Submit</button>
                    </div>
                </div>
            </form> <!-- /form -->
        </div> <!-- ./container -->

</body>
</html>