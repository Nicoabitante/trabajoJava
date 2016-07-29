package dao;

public class UserDAO {
	
	
	public boolean login(String user, String password){
		if (user.equals("nico") && password.equals("nico")){
			return true;
		}
		else{
			return false;
		}
	} 
	public boolean admin(String user, String password){
		if (user.equals("nico") && password.equals("nico")){
			return true;
		}
		else{
			return false;
		}
	}
}
