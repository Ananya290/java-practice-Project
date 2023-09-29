package exceptionpackage;

public class Finaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =9;
		int j = 0;
		try {
		System.out.println ("result is " +i/j);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {

				System.out.println ("result is " +i+j);
				System.out.println ("result is " +(i-j));
				System.out.println ("result is " +i*j);

			}
			
		}
		
		
	

}
