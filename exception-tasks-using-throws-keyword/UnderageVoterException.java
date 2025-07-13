/*
Practice Task 1: Underage Voting Exception
Objective: Create a custom exception for users under 18 trying to vote.

Instructions:

Ask the user to enter age.

If age < 18, throw UnderageVoterException.

Else, print “You are eligible to vote.”
*/
import java.util.Scanner;
public class UnderageVoterException extends Exception{
		UnderageVoterException(String message){
			super(message);
		}
}
class ageLogin {


	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		
		try{
			System.out.print("Enter your age :  ");
			String age = S.nextLine();
			
			try{
				int Age = Integer.parseInt(age);
				
				if(Age < 18){
						throw new UnderageVoterException("You are not eligible to vote.");
				}
				else{
						System.out.println("You are eligible to vote.");
				}
			}
			catch(UnderageVoterException U){
				System.out.println("Exception : "+U.getMessage());
			}
		}
		catch(NumberFormatException N){
			System.out.println("Enter valid Numerical Value");
		}
		System.out.println("Normal Flow");
		
	}
}