package inheritancedemo;

public class Methodsdemo {
	
	public void login() {
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("sign in");
	}
	public void compose() {
		System.out.println("write an email");
	}
	public void logout() {
	
		System.out.println("logout");
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Methodsdemo obj = new  Methodsdemo();
		 
		 obj.login();
		 obj.compose();
		 obj.logout();

	}

}
