package inheritancedemo;

public class Methoddemo2 {

	public void login(String username,String password) {
		System.out.println("enter username " +username);
		System.out.println("enter password " +password);
		System.out.println("sign in");
	}
	public void compose(String welcome) {
		System.out.println("write an email "+welcome);
	}
	public void logout() {
	
		System.out.println("logout");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methoddemo2 obj = new  Methoddemo2();
		 
		 obj.login("ananya","annaya@123");
		 obj.compose("hello all");
		 obj.logout();

	}

}
