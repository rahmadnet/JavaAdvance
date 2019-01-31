import java.util.Scanner;

class Main { 
	public static void main(String args[]) 
	{ 

		Scanner s = new Scanner(System.in); 

		System.out.print("Enter value of a: "); 
		int a = s.nextInt(); 

		System.out.print("Enter value of b: "); 
		int b = s.nextInt(); 

		if (a == b) 
			System.out.println("Both Values are Equal"); 
		else
			System.out.printf("%c's value is Greater\n", 
							Math.check(a, b)); 
	} 
} 
