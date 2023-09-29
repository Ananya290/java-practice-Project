package javapracticeProject;
import java.util.Scanner;
public class PracticeProject {
	

	    // Calculate the area of a square
	    public static double calculateArea(double side) {
	        return side * side;
	    }

	    // Calculate the area of a rectangle
	    public static double calculateArea(double length, double width) {
	        return length * width;
	    }

	    // Calculate the area of a circle
	    public static double calculateArea(double radius, String shape) {
	        if (shape.equalsIgnoreCase("circle")) {
	            return Math.PI * radius * radius;
	        } else {
	            return 0; // Invalid shape
	        }
	    }

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Geometry Calculator");
        System.out.println("1. Calculate the area of a square");
        System.out.println("2. Calculate the area of a rectangle");
        System.out.println("3. Calculate the area of a circle");
        System.out.print("Enter your choice (1/2/3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squareArea = calculateArea(side);
                System.out.println("The area of the square is: " + squareArea);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = calculateArea(length, width);
                System.out.println("The area of the rectangle is: " + rectangleArea);
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = calculateArea(radius, "circle");
                System.out.println("The area of the circle is: " + circleArea);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
		

	}


