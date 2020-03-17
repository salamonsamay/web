package db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import my_class.User;





public class UserDb {

	public static void insert(String user_name,String email ,String password){
		String sql="INSERT INTO web_user(USER_NAME,EMAIL,PASSWORD_)"
				+ "VALUES(?,?,?)";

		try {
			PreparedStatement p=JSP_DB.con.prepareStatement(sql);
			p.setString(1, user_name);
			p.setString(2, email);
			p.setString(3, password);
			p.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    public static boolean insert(String firt_name,String last_name,String email,String password) throws SQLException{
		String sql="INSERT INTO user_(FIRST_NAME,LAST_NAME,EMAIL,PASSWORD_)"
				+ "VALUES(?,?,?,?)";

	
			PreparedStatement prep_state=JSP_DB.con.prepareStatement(sql);
			prep_state.setString(1, firt_name);
			prep_state.setString(2, last_name);
			prep_state.setString(3, email);
			prep_state.setString(4, password);
			prep_state.execute();
			 return true;
	
    }
	public static void insert(User user){

		insert(user.getUserName(),user.getEmail(),user.getPassword());
	}
    
	public static boolean check(String email,String password) throws SQLException{
		String sql="SELECT PASSWORD_ FROM USER_ WHERE email=?";

		PreparedStatement psStatement=JSP_DB.con.prepareStatement(sql);
		psStatement.setString(1, email);
		ResultSet rs=psStatement.executeQuery();
		rs.next();

		String pass=rs.getString(1);
		if(pass.equals(password)){
			return true;
		}
		return false;
	}

	public static void main(String args[]){
		User user=new User("סלומון", "סמאי", "salamon.salamon0@gmail.com", "098656117");
		JSP_DB.getConnection();
		try {
			UserDb.insert(user.getFirst_name(), user.getLast_name(),
					user.getEmail(), user.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(3);

	}






}
