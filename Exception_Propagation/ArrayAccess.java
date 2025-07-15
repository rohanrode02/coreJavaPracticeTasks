/*
✅ Practice Task 2: Array Access Out of Bound
📌 Objective: Create a method accessArray() which throws ArrayIndexOutOfBoundsException. Propagate it to main() where it is caught.

🧪 Hint: Access an index that does not exist.
*/
class ArrayAccess
{
	int array[] = {1, 2, 3, 4, 5};
	void accessArray()
	{
		for(int i=0; i<6; i++)
		{
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String args[]){
		
		ArrayAccess A = new ArrayAccess();
		
		try
		{
			A.accessArray();
		}
		catch(ArrayIndexOutOfBoundsException B)
		{
			System.out.print("Arrya Index Out of Bound Exception");
		}	
	}
}