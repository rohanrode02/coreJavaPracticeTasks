/*
✅ Practice Task 4: Multiple Methods Propagation Chain
📌 Objective: Create 4 methods: methodA() calls methodB(), which calls methodC(), which throws NullPointerException. Catch it in methodA() only.

🧪 Goal: Understand how exception flows back up through multiple calls.
*/

class  MultipleMethod
{
	String S = null;
	void methodA()
	{
		try
		{
			methodB();
		}
		catch(NullPointerException N)
		{
			System.out.println("String is null");
		}
	}
	void methodB()
	{
		methodC();
	}
	void methodC()
	{
		int length = S.length();
	}
	public static void main(String args[])
	{
		MultipleMethod M = new MultipleMethod();
		M.methodA();
		System.out.println("Normal Flow");
	}
}