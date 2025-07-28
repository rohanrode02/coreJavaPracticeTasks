class Fibonaci{

	public static void main(String args[]){
	
		int a=0, b=1, sum;
		
		for(int i=0; i<=15; i++){
			System.out.print(a+", ");
			
			sum=a+b;
			a=b;
			b=sum;
		}
	}
}

		
		