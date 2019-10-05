

<%@ page language="java" import="java.sql.*" %>


    <%
		String driver = "com.mysql.jdbc.Driver";
		Class.forName(driver).newInstance();


		Connection con=null;
		ResultSet rst=null;
		
		Statement stmt=null;

    try{	
		con=DriverManager.getConnection("jdbc:mysql://localhost/student_registration","root","");
		stmt=con.createStatement();
	}catch(Exception e){
			System.out.println(e.getMessage());
		  }
    String indexNo=request.getParameter("indexNo");

    
try{
	  rst=stmt.executeQuery("select * from students where indexNo = '" + indexNo+"'");
}catch(Exception e){
	%> <h2>Index no is invalid</h2>><%
} 
      %>


	  
<html>
<head>

<title>view</title>
</head>
   <body>
   <center><h2>Student Details</h2>
   <table border="1" cellspacing="5" cellpadding="5" >
      <thead >
	  <tr><td>no</td><td>index</td><td>name</td><td>Tel</td><td>email</td></tr>
	  </thead>
	  <tbody>
	  <%
          int no=1;

			while(rst.next()){
	  
      %>

            <tr><td><%=no%></td><td><%=rst.getString("indexNo")%></td><td><%=rst.getString("name")%></td><td><%=rst.getString("telNo")%></td><td><%=rst.getString("email")%></td></tr>

	  <%    
		    no++;
			}
      
             rst.close();
			 stmt.close();
			 con.close();
            
	      
			
		%>
		</tbody>
   </table>
   </center>
<a href="View.jsp">Search again</a>
<a href="Registration.jsp">Home</a>
   </body>
</html>



