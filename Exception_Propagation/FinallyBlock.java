/*
✅ Practice Task 5: Finally Block with Propagation
📌 Objective: Create a method that throws NumberFormatException, but has a finally block. Catch exception in the calling method.

🧪 Check: Whether finally runs even if exception is propagated
*/
import java.util.Scanner;
class FinallyBlock{
	int Number=0;
	void method_name(String n)
	{
		Number = Integer.parseInt(n);	
	}
	
	public static void main(String args[])
	{
		FinallyBlock F = new FinallyBlock();
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the number : ");
		String number = S.nextLine();
		try
		{
			F.method_name(number);
		}
		catch(NumberFormatException N)
		{
			System.out.println("Number fromat Exception");
		}
		finally{
			System.out.println("Number : "+F.Number);
			System.out.println();
			System.out.println("fainlayy block execued");
			
		}
	}
}