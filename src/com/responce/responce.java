package com.responce;

import java.io.IOException;
import com.db.dbCreate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class responce
 */
@WebServlet("/responce")
public class responce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public responce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("sName");
		String index = request.getParameter("indexNo");
		String email = request.getParameter("eNo");
		int telno = Integer.parseInt(request.getParameter("mNo"));
		
		request.setAttribute("index",index);
		request.setAttribute("fname",name);
		request.setAttribute("email",email);
		request.setAttribute("mobNo",telno);
		
		dbCreate jdbcExample = new dbCreate();
		jdbcExample.createTable();
		jdbcExample.insertdata(index, name,email,telno);
		
		request.getRequestDispatcher("dbInsert.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
