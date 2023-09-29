package exceptionpackage;

public class Constructordemo {
	
	public Constructordemo(){
		System.out.println("this is default");
	}
	public Constructordemo(int a){
		System.out.println("thishas one input" +a);
	}
	public Constructordemo(int a, int b){
		System.out.println("this is two input" +a +b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructordemo obj = new Constructordemo();
		Constructordemo obj1 = new Constructordemo(10);
		Constructordemo obj2 = new Constructordemo(10, 20);

	}

}
