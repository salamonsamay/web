package db;

import java.sql.Connection;
import java.sql.DriverManager;




public class JSP_DB {

	public static Connection con=null;
	static String url ="jdbc:mysql://localhost/jsp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String  userName="root";
	static String password_="123456";
	static String driver="com.mysql.cj.jdbc.Driver";
	
	
	public static Connection getConnection() {
        
         if(con!=null){
        	 System.out.println("already connected");
        	 return con;
         }
        	
		
	//	Connection con=null;
		try {
			//	String url="jdbc:mysql://localhost:3306/mydb";
			
			Class.forName(driver).newInstance();
			con= DriverManager.getConnection(url,userName,password_);

			System.out.println("connected.......");
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		return con;
	

	}
	
	public static void main(String args[]){
		System.out.println(9);
	
	}
	
	
	
	    
	  
	   
	    
	    
	
}
