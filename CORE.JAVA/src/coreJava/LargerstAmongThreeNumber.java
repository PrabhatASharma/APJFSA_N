package coreJava;

import java.util.Scanner;

public class LargerstAmongThreeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Scanner class for user input
		System.out.println("Enter three numbers: ");
		int num1=sc.nextInt();//number1 user input
		int num2=sc.nextInt();//number2 user input
		int num3=sc.nextInt();//number3 user input

		if (num1 >= num2 && num1 >= num3) //comparing num1 with num2 and num3 by using logical And operator
		{
			System.out.println("num1 is greater: " + num1);
		} else if (num2 >= num1 && num2 >= num3) //comparing num2 with num1 and num3
		{
			System.out.println("num2 is greater: " + num2);
		} else {
			System.out.println("num3 is greater: " + num3);
		}

	}

}
/*output:Enter three numbers: 
43
67
87
num3 is greater: 87
 */