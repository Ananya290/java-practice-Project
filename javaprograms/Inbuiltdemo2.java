package javaprograms;

public class Inbuiltdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title ="learning java with simplilearn";
		
		if(title.contains("simplilearn")) {
			System.out.println("title is valid, pass the test");
		}
		else {
			System.out.println("title is invalid ,test failed");
		}
		
		if (title.equals("learning java with simplilearn")) {
			System.out.println("title is valid ,test case pass");
		}
		else {
			System.out.println("tutle is not valid, test case failed");
		}
		
	String title2 = "practice labs java";
	String result = title2.substring(14);
	 if(result.equals("java"))
	 {
		 System.out.println("correct output");
	 }
	 else {
		 System.out.println("incorrect output");
	 }
	}

}
