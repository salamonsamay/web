package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.JSP_DB;
import db.ProblemDb;
import db.UserDb;
import my_class.User;

/**
 * Servlet implementation class My_Servlet
 */
@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogInServlet() {
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
     
		response.setHeader("Cache-Control","no-cache,no-store,must revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires", "0");
		
		try{
///////////////the data from the user//////////////////////////////////////////
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			JSP_DB.getConnection();
/////////////////////////////////////////////////////////////////////////////////
			
//////////// confirm email and Password///////////////////////////////////////////
			if(UserDb.check(email, password)){
				HttpSession session=request.getSession();
				session.setAttribute("vaild", true);	
				System.out.println("log in");
				response.sendRedirect("my-web.jsp");
			}
			
////////////otherwise///////////////////////////////////////////////////////////////			
			else{
				response.sendRedirect("log-in.html");
			}
/////////////////////////////////////////////////////////////////////////////////////				



		}
		
////////if the email are duplicate or another exception/////////////////////////////	
		catch(Exception e){
			e.printStackTrace();
			PrintWriter out=response.getWriter();
			out.print("<h1>eror</h1>");
			response.sendRedirect("log-in.html");
		
		}
///////////////////////////////////////////////////////////////////////////////////////




	}

}
