package Assignment;

import java.util.Scanner;

class Student
{
	int Roll;
	String Name;
	float Marks;
	
	public void Input()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the roll number : ");
		Roll=in.nextInt();
		System.out.print("Enter the name : ");
		Name=in.next();
		System.out.print("Enter the marks : ");
		Marks=in.nextFloat();
	}
	
	public void Display() 
	{
		System.out.println("Student Roll number : "+Roll);
		System.out.println("Student Name : "+Name);
		System.out.println("Marks : "+Marks);
	}
	
}

public class Day1Assignment 
{
	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.Input();
		obj.Display();
	}
}
