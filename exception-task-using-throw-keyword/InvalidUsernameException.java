/*
Practice Task 3: Invalid Username Exception
Objective: Throw exception if username is less than 5 characters.

Instructions:

Ask the user for a username.

If username.length() < 5, throw InvalidUsernameException.
*/
import java.util.Scanner;
public class InvalidUsernameException extends Exception
{
		InvalidUsernameException(String name){
			super(name);
		}
}

class Username
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter Your Name : ");
			String name = S.nextLine();
			
			if(name.length() < 5){
					throw new InvalidUsernameException("Username is less that 5 characters");
			}
			else
			{
				
				System.out.println("Userrnam is set ");
				System.out.println("Username : "+name);
			}
		}
		catch(InvalidUsernameException G){
			System.out.println(G.getMessage());
		}
		System.out.println("Normal Flow");
	}
		
}