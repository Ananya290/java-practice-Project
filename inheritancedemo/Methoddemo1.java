package inheritancedemo;

public class Methoddemo1 {
	
	int sum1 = 50;
	String str3 = "Ananya";
	
	public int sum() 
	
	// public datatype methodname()
	{
		int a=10;
		int b=20;
		int sum= a+b;
		return sum;
	}
	
	public String concatmethod() {
		String s1 ="ananya";
		String s2 ="shukla";
		String s3 = s1+s2;
		return s3;
	}
	public void printsum() {
		System.out.println(sum1);
		System.out.println(str3);
		// no return statement
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methoddemo1 obj =new Methoddemo1();
		obj.printsum();
		System.out.println(obj.sum());
		System.out.println(obj.concatmethod());
		

	}

}
