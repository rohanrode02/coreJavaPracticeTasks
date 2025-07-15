/*
Mini-Assignment: Student Exam Result Validator
🎯 Objective:
Build a program that validates marks entered for a student and throws custom exceptions for invalid marks.

✏ Instructions:
Create a class InvalidMarksException.

Accept marks for 3 subjects from the user.

If any mark < 0 or > 100, throw the custom exception.

If all are valid, calculate average and print result.

If average < 35, print "You have failed", else "You have passed".
*/
import java.util.Scanner;
public class InvalidMarksException extends Exception
{
	InvalidMarksException(String msg)
	{
		super(msg);
	}
}

class marks
{
	public static void main(String args[]){
		int marks[] = new int[3];
		double avarage=0;
		int total=0;
		
		Scanner S = new Scanner(System.in);
			
		System.out.println("Enter a Marks : ");
		for(int i=0; i<marks.length; i++)
		{
			try
			{
				System.out.print((i+1)+" Subject : ");
				String mark=S.nextLine();
				try
				{
					int submark = Integer.parseInt(mark);
					if(submark < 0 || submark > 100)
					{
						i--;
						throw new InvalidMarksException("marks must between 0 to 100");
					}
					else
					{
						marks[i]=submark;
					}
				}
				catch(InvalidMarksException I)
				{
					System.out.println(I.getMessage());
				}
			}
			catch(NumberFormatException N)
			{
				i--;
				System.out.println("Enter valid Numerical Value");
			}
		}
			
			for(int i=0; i<marks.length; i++)
			{
				total = total+marks[i];
			}
			
			avarage = total/marks.length;
			
			if(avarage > 35)
			{
				System.out.println("Avrage marks : "+avarage+" | Your are Passed.");
			}
			else
			{
				System.out.println("Avrage marks : "+avarage+" | Your are Fail.");
			}	
	
		System.out.println();
	}
}