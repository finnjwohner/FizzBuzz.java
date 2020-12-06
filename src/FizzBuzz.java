
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner variable to take user input
		
		// Get the number to count towards in the FizzBuzz
		System.out.println("Number to count towards: ");
		int num = scan.nextInt();
		
		// 'Do' the FizzBuzz
		for(int i = 1; i <= num; i++) {
			String output = "";
			
			// Check if i is a multiple of 3
			if(i % 3 == 0) {
				output += "Fizz";
			}
			
			// Check if i is a multiple of 5
			if(i % 5 == 0) {
				output += "Buzz";
			}
			
			// Check if i isn't a multiple of 3 or 5
			if(output.equals("")) {
				output = Integer.toString(i);
			}
			
			// Print output
			System.out.println(output);
		}
	}

}
