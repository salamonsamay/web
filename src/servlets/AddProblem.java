package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.JSP_DB;
import db.ProblemDb;
import my_class.Problem;

/**
 * Servlet implementation class AddProblem
 */
@WebServlet("/AddProblem")
public class AddProblem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProblem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSP_DB.getConnection();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int solved_by=Integer.parseInt(request.getParameter("solved_by"));
		String  des=request.getParameter("des");
		String  ans=request.getParameter("ans");
		Problem problem=new Problem(id,name, solved_by, des, ans);
		try {
			ProblemDb.insert(problem);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("eror in class AddProblem");
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
