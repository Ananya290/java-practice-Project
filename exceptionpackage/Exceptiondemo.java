package exceptionpackage;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 9/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
		
		System.out.println(e);
			
		System.out.println("you cannot divide by zero");
			// Different ways to print exception message:
			e.printStackTrace(); // will print exception, description and message and line number(stacktrace)
			System.out.println(e.toString()); // will print exception and description, - no stack trace
		System.out.println(e.getMessage()); // will print only message.
		
		}
		
		
	}

}
