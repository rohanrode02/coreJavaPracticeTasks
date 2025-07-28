//Write a program of static and non static with method calling

class program{

	void display1(){
	
		System.out.println("Non Static mehtod is called");
	}
	
	static void display2(){
	
		System.out.println("Static mehtod is called");
	}
	
	public static void main(String args[]){
	
		program  obj = new program();
		obj.display1();
		program.display2();
	}
}