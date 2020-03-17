package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import my_class.Problem;


public class ProblemDb {
     

	public static boolean insert(int problem_id,String problem_name ,
			int solved_by,String description,String answer) throws SQLException{
		String sql="INSERT INTO PROBLEM(PROBLEM_ID,PROBLEM_NAME,SOLVED_BY,DESCRIPTION_,ANSWER)"
				+ "VALUES(?,?,?,?,?)";
		PreparedStatement p;

		p=JSP_DB.con.prepareStatement(sql);
		p.setInt(1, problem_id);
		p.setString(2, problem_name);
		p.setString(4, description);
		p.setInt(3, solved_by);
		p.setString(5, answer);
		p.execute();
		p.close();

		return true;



	}
	public static boolean update_answer(int id,String ans){
		String sql="UPDATE PROBLEM SET ANSWER = ? WHERE PROBLEM_ID=?";
		
		try {
			PreparedStatement statement=JSP_DB.con.prepareStatement(sql);
			statement.setString(1, ans);
			statement.setInt(2, id);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean insert(Problem problem) throws SQLException{
		return insert(problem.getProblem_id(),problem.getProblem_name(),
				problem.getSolved_by(),problem.getDescription(),problem.getAnswer());
	}

	public static Problem getProblem(int i){
		String sql="SELECT * FROM PROBLEM WHERE PROBLEM_ID=?";
		Problem problem=null;
		try {

			PreparedStatement preparedStatement=JSP_DB.con.prepareStatement(sql);
			preparedStatement.setInt(1, i);
			ResultSet rs=preparedStatement.executeQuery();
			rs.next();
			problem=new Problem(rs.getInt(1), rs.getString(2),
					rs.getInt(3), rs.getString(4),rs.getString(5));



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return problem;


	}
	public static ArrayList<Problem> getProblems(){
		ArrayList<Problem> problems=new ArrayList<>();
		String sql="SELECT * FROM PROBLEM";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = JSP_DB.con.prepareStatement(sql);

			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()){
				problems.add(new Problem(rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getString(4),rs.getString(5)));

			}
			return problems;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return problems;

	}

	private static void deleteAll() throws SQLException{
		String sql="DELETE FROM PROBLEM WHERE PROBLEM_ID>-1";
		PreparedStatement preparedStatement=JSP_DB.con.prepareStatement(sql);
		preparedStatement.execute();
	}

	public static boolean delete(int id){
		String sql="DELETE FROM PROBLEM WHERE PROBLEM_ID=?";
		try {
			PreparedStatement pStatement=JSP_DB.con.prepareStatement(sql);
			pStatement.setInt(1, id);
			pStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}


	public static void main(String args[]){
		JSP_DB.getConnection();


		ProblemDb.update_answer(2, "15485863");




	} 

}
