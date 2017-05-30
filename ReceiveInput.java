
	
	import java.util.Scanner;

	public class ReceiveInput
	{

	public static void main (String[] args)
	{

		System.out.println("Enter a value for name of stuff");
		Scanner receiveinput = new Scanner(System.in);
		String myName =  receiveinput.next();
		System.out.println(myName);		
	}
	}
