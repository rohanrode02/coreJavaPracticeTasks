/*
Practice Task 5: Product Quantity Check
Objective: Create exception if ordered quantity exceeds available stock.

Instructions:

Assume stock = 50.

If user enters quantity > 50, throw OutOfStockException.
*/
import java.util.Scanner;
public class OutOfStockException extends Exception
{
	OutOfStockException(String msg){
		super(msg);
	}
}

class Stock
{
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
	
		int Bat_stock = 50;
		
		try
		{
			System.out.println("How many Bat you want : ");
			String s = S.nextLine();
			
			try
			{
					int stock = Integer.parseInt(s);
					
					if(stock > Bat_stock){
						throw new OutOfStockException("Bat is Out of Stock");
					}
					else
					{
						Bat_stock=Bat_stock-stock;
					}
			}
			catch(OutOfStockException O)
			{
				System.out.println(O.getMessage());
			}
			
		}
		catch(NumberFormatException N)
		{
			System.out.println("Enter valid Numerical Value");
		}
		System.out.println("Current Stock : "+Bat_stock);
	}
}