package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mysql.cj.Session;

import db.ProblemDb;
import my_class.Problem;

/**
 * Servlet implementation class CheackServlet
 */
@WebServlet("/CheckServlet")
public class  CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ans=request.getParameter("ans").toString();
		
		HttpSession session2=request.getSession();
		if(session2.getAttribute("vaild")==null){
			response.sendRedirect("problem-page.jsp");
        	return;
		}
		
		Problem problem=(Problem)session2.getAttribute("problem");
		System.out.println("-------"+problem.getAnswer());
		System.out.println(ans);
		
        if(problem.getAnswer().equals(ans)){
        	session2.setAttribute("answer", 1);
        	RequestDispatcher rs=request.getRequestDispatcher("problem-page.jsp");
        	rs.forward(request, response);
        }
        else{
        	session2.setAttribute("answer", 0);
  
        	RequestDispatcher rs=request.getRequestDispatcher("problem-page.jsp");
        	rs.forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
