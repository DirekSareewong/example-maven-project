package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Practice17();
	}
	
	private static void Practice01(){
		System.out.println("Hello\nDirek Sareewong");
	}
	
	private static void Practice02(){
		int a = 19;
		int b = 33;
		System.out.println(a+b);
	}
	
	private static void Practice03(){
		int a = 10;
		int b = 30;
		System.out.println(b/a);
	}
	
	private static void Practice04(){
		System.out.println(-5+8*6);
		System.out.println((55+9)%9);
		System.out.println(20+-3*5/8);
		System.out.println(5+15/3*2-8%3);
	}
	
	private static void Practice05(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number: ");
		int numberFirst = input.nextInt();
		System.out.print("Input second number: ");
		int numberSecond = input.nextInt();
		System.out.println(numberFirst + " x " + 
			numberSecond + " = " + numberFirst*numberSecond);
		input.close();
	}

	private static void Practice06(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number: ");
		int numberFirst = input.nextInt();
		System.out.print("Input second number: ");
		int numberSecond = input.nextInt();
		
		System.out.println(numberFirst+" + "+numberSecond+" = "+(numberFirst+numberSecond));
		System.out.println(numberFirst+" - "+numberSecond+" = "+(numberFirst-numberSecond));
		System.out.println(numberFirst+" x "+numberSecond+" = "+(numberFirst*numberSecond));
		System.out.println(numberFirst+" / "+numberSecond+" = "+(numberFirst/numberSecond));
		System.out.println(numberFirst+" mod "+numberSecond+" = "+(numberFirst%numberSecond));
		input.close();
	}
	
	private static void Practice07(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int a = input.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.println(a+" x "+i+" = "+a*i);
		}
	}
	
	private static void PrePractice17(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		int restValue = number/2;
		List<Integer> digit = new ArrayList<Integer>();
		digit.add(number%2);

		while(restValue >= 1){
			digit.add(restValue%2);
			restValue = restValue/2;

		}
		
		for(int a = 0; a<digit.size(); a++){
			System.out.print(digit.get(digit.size()-a-1));
		}
	}
	
	private static void Practice17(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input first binary: ");
		int numberFirst = input.nextInt();
		System.out.print("Input second binary: ");
		int numberSecond = input.nextInt();
		int[] digit = new int[20];
		int i = 0;
		int remainder = 0;
		
		while( numberFirst != 0 || numberSecond != 0){
			//sum of last digits and remainder of the last operation
			//% 2 will get the last digit
			digit[i++] = (int) (numberFirst%10 + numberSecond%10 + remainder)%2;
			//this will get to see if its over the digit, so it will save in remainder
			//for the next operation
			remainder = (int) (numberFirst%10 + numberSecond%10 + remainder)/2;
			
			numberFirst = numberFirst/10;
			numberSecond /= 10;
		}
		
		//if the last one isnt 0, then the first digit is also 1
		if(remainder != 0)
			digit[i++]=remainder;
		
		while(i >=0){
			System.out.print(digit[i--]);
		}
		
	}
}
