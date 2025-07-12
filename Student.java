/*
Create a simple Java console application to manage student records including name, marks, grade calculation, and display summary.

📋 Requirements:
Create a Student class with the following:

String name

int rollNumber

int[] marks (for 3 subjects)

char grade

Methods: inputDetails(), calculateGrade(), displayDetails()

In the main() method:

Ask the user for the number of students

Create an array of Student objects

For each student:

Accept input (name, roll number, marks)

Calculate total marks and assign grade based on average:

>=90 → A

80–89 → B

70–79 → C

<70 → D

Display all student details
-----------------------------------------------------------
Enter number of students: 2

Enter details for Student 1:
Name: Bhushan
Roll No: 101
Marks (3 subjects): 85 90 80
Grade: B

Enter details for Student 2:
Name: Rutuja
Roll No: 102
Marks (3 subjects): 95 92 93
Grade: A

--- Student Summary ---
Name: Bhushan | Roll No: 101 | Grade: B
Name: Rutuja | Roll No: 102 | Grade: A
*/

import java.util.Scanner;
public class Student{

	String name;
	int rollNumber;
	int marks[]=new int[3];
	char grade;

	 void inputDetails(Scanner S){
		
		System.out.print("Name :  ");
		name=S.nextLine();

		S.nextLine();

		System.out.print("Roll No :  ");
		rollNumber=S.nextInt();

		System.out.print("Marks (3 subjects):  ");
		for(int j = 0; j<marks.length; j++){

			marks[j]=S.nextInt();
				
		}

		System.out.println();

		
	}

	void calculateGrade(){

		int totalMark=0;
		for(int i=0; i<marks.length; i++){

			totalMark=totalMark+marks[i];
			
		}
		
		double percentage =(totalMark*100.0)/300;

			if(percentage>=90){

				grade = 'A';
			}
			else if(percentage >=80 && percentage <=89){

				grade = 'B';
			}
			else if(percentage >=70 && percentage <=79){

				grade = 'C';
			}
			else{

				grade = 'D';
			}
	}

	void displayDetails(){
		System.out.println("Name: " + name +" | Roll No: " + rollNumber+" | Grade: "+grade);
		System.out.println("--------------------------------------------------");
	}


	
	public static void main(String args[]){

		Scanner S = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int Number = S.nextInt();

		
		Student[] std = new Student[Number];
		
		for(int i=0; i<std.length; i++){
			System.out.println("Enter details for Student "+(i+1)+" : ");

			std[i] = new Student();
			std[i].inputDetails(S);
			std[i].calculateGrade();
		}
			
		for(int i=0; i<std.length; i++){
			std[i].displayDetails();
		}

	}

}

