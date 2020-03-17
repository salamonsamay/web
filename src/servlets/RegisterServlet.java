package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import db.JSP_DB;
import db.UserDb;
import my_class.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSP_DB.getConnection();
		request.setCharacterEncoding("UTF-8");
		
		/////// the input value////////////////////////////
		String first_name=request.getParameter("first_name");
		String last_name=request.getParameter("last_name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String password2=request.getParameter("password2");
		////////////////////////////////////////////////////
		
		//checking if the password are the same/////////////
		if(!password.equals(password2)){
			response.sendRedirect("register.html");
		}
		////////////////////////////////////////////////////
		/// insert the data of the user in data base/////////////////////
		try {
			UserDb.insert(first_name, last_name, email,password);
			response.sendRedirect("log-in.html");
		} catch (SQLException e) {
			String s=e.toString();
			String s2="java.sql.SQLIntegrityConstraintViolationException: Duplicate entry 'f@gmail.com' for key 'PRIMARY'";
			if(s.equals(s2)){
				response.setCharacterEncoding("UTF-8");
				PrintWriter out=response.getWriter();
			
				out.print("<h1>this mail is  already exist</h1>");
			}else System.out.println("--write another exeption in registerServlet class--");

		}

	}

}
