import java.util.Scanner;

public class AreaPerimeterExercise {

	public static void main(String[] args) {
		
		// declare variables
		double length = 0;
		double width = 0;
		double height = 0;
		char answer = 'y';
		
		// open scanner
		Scanner scnr = new Scanner(System.in);
		
		// output welcome message
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		while (answer == 'y')
		{	
			// get user input for length
			System.out.println("Enter length:");
			length = scnr.nextDouble(); 
			
			// get user input for width
			System.out.println("Enter width: ");
			width = scnr.nextDouble();
			
			// get user input for height
			System.out.println("Enter height: ");
			height = scnr.nextDouble();
		
			// calculate area
			double area = length * width;
			
			// calculate perimeter
			double perimeter = 2 * ( length + width);
			
			// calculate volume
			double volume = length * width * height;
			
			// output area and perimeter and volume
			System.out.println("The area of the classroom is " + area + ".");
			System.out.println("The perimeter of the classroom is " + perimeter + ".");
			System.out.println("The volume of the classroom is " + volume + ".");
	
			System.out.println("Continue? (y/n): ");
			answer = scnr.next().charAt(0);
		}
		// output goodbye message
		System.out.println("Thank you for using the Grand Circus Room Detail Generator!");
		
		// close the scanner
		scnr.close();
		
	}

}
