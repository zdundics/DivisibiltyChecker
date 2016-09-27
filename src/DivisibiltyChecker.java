import java.util.Scanner;
public class DivisibiltyChecker {
	public DivisibiltyChecker(){ //constructor 
		
	}
	public static boolean isDivisible(int number, int divisor){ //boolean method for determining true or false if divisible 
	int x = (number % divisor);
	if (x == 0)
		return true;
	
	else
	return false;
	}

	public static boolean isEven(int number){ //boolean method for determining number is even or not 
		int x = number % 2;
		if (x == 0) return true;
		
		else return false;
	}
	public static void main(String [] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number: ");
	
	int number = in.nextInt();
	System.out.println("Enter it's divisor: ");
	int divisor = in.nextInt();
	boolean y = isDivisible(number, divisor);
	
	if (y == true) System.out.println((number) + " is Divisible by " + (divisor));
	else System.out.println((number) + " is not divisble by "+ (divisor));
	boolean w = isEven(number);
	if (w == true) System.out.println((number)+" is Even ");
	else System.out.println((number) +  " is odd ");
	
	
	
	}

}
