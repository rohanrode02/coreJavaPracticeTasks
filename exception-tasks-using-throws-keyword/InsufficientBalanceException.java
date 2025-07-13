/*
Practice Task 2: Insufficient Balance in Bank Account
Objective: Create a custom exception when withdrawal exceeds balance.

Instructions:

Set a balance amount (e.g., 5000).

Ask the user to enter withdrawal amount.

If withdrawal > balance, throw InsufficientBalanceException.
*/

import java.util.Scanner;
public class InsufficientBalanceException extends Exception
{	
		InsufficientBalanceException(String massage){
			super(massage);
		}
}
class Account
{
	public static void main(String agrs[]){
		Scanner S = new Scanner(System.in);
		double balance = 5000;
		
		try
		{
			System.out.print("Enter Withdrawal amount. : ");
			String amount = S.nextLine();
			
			try
			{
					int Withdrawal = Integer.parseInt(amount);
					if(Withdrawal > balance)
					{
							throw new InsufficientBalanceException("insufficient Balaance Exception");
					}
					else
					{
						balance=balance-Withdrawal;
						System.out.println("you withdra "+Withdrawal+" Rs. in Your Account");
					}
					
			}
			catch(InsufficientBalanceException I)
			{
				System.out.println(I.getMessage());
			}
		
		}
		catch(NumberFormatException N){
			System.out.println("Enter valid Numerical Value");
		}
		System.out.println("Current Balance : "+balance);
	}
}
		
