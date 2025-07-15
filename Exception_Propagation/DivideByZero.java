/*
Practice Task 1: Divide by Zero (Basic Propagation)
📌 Objective: Create 3 methods. The innermost method should throw ArithmeticException. Catch it in main().

🧪 Expected Exception: ArithmeticException
*/

class DivideByZero
{
	void method_3()
	{
		int D = 23/0;
	}
	
	void method_2()
	{
		method_3();
	}
	
	void method_1()
	{
		method_2();
	}
	public static void main(String agrs[]){
	
		DivideByZero D = new DivideByZero();
		
		try
		{
			D.method_1();
		}
		catch(ArithmeticException A){
			System.out.println("Exception : Dinominator is Zero");
		}
		System.out.println("Normal Flow");
	}
}