/*

✅ Practice Task 3: Custom Exception Propagation
📌 Objective: Create a user-defined exception InvalidMarksException. Throw it from one method if marks < 0 or > 100 and catch it in the main() method.
*/
import java.util.Scanner;
public class CustomException extends Exception
{
	CustomException(String massage)
	{
		super(massage);
	}
}
class Custom
{
	int Mark=0;
	void AccesMarks(int m) throws CustomException
	{
		if(m < 0 || m >100){
			throw new CustomException("Invalid Marks Exception");
		}
		else
		{
			Mark=m;
		}
	}
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		Custom C = new Custom();
		
		System.out.print("Enter Mark : ");
		int M = S.nextInt();
		
		try
		{
			C.AccesMarks(M);
		}
		catch(CustomException E)
		{
			System.out.println(E.getMessage());
		}
		System.out.println("Mark : "+C.Mark);
	}
}