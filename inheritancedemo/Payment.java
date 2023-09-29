package inheritancedemo;

public class Payment extends Homepage {
	
	public void payments() {
		System.out.println("testcase for payment");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment obj = new Payment();
		obj.openbrowser("browser");
		login("username", "password");
		obj.homepage();
		obj.payments();
		obj.logout();
		
		
		
		

	}

}
