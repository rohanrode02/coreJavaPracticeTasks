/*
Practice Task 4: Temperature Monitor
Objective: Throw exception if temperature is beyond safe range.

Instructions:

Accept temperature from user.

If temperature < 0 or > 100, throw TemperatureOutOfRangeException
*/
import java.util.Scanner;
public class TemperatureOutOfRangeException extends Exception
{
	TemperatureOutOfRangeException(String msg){
		super(msg);
	}
}

class tempMonitor
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		try
		{
			System.out.print("Temperature is : ");
			String t = S.nextLine();
			
			try
			{
				int temp = Integer.parseInt(t);
				
				if(temp > 100 || temp < 0)
				{
					throw new TemperatureOutOfRangeException("Temperature out of Range");
				}
				else
				{
					System.out.println("Temperature is in Range");
				}
			}
			catch(TemperatureOutOfRangeException E)
			{
				System.out.println(E.getMessage());
			}
		}
		catch(NumberFormatException N){
			System.out.println("Enter valid Numerical Value");
		}
		System.out.println("Normal flow");
	}
}