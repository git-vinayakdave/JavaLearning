package javaLearning.Assignments;

import java.util.Scanner;

public class Scanner_1 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s1.nextInt();
		System.out.println("age : "+age);
		s1.close();
          
	}

}
