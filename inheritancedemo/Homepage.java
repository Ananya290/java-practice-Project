package inheritancedemo;

public class Homepage  extends Base {
	
	public void homepage() {
		System.out.println("test for the home page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homepage obj = new Homepage();
		obj.openbrowser("chrome");
		login("username", "password");
		obj.homepage();
		obj.logout();

	}

}
