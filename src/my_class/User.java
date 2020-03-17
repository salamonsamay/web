package my_class;

public class User {

	private String first_name,last_name, userName,email,password;

	public User(String userName,String email,String password ){
		setUserName(userName);
		setEmail(email);
        setPassword(password);
	}
	
	public User(String first_name,String last_name,String email,String password){
		setFirst_name(first_name);
		setLast_name(last_name);
		setEmail(email);
        setPassword(password);
	}


	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUserName() {
		return userName;
	}
    
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
