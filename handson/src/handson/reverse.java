package handson;

import java.util.Scanner;
//reverse number
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("number:");
		int number =sc.nextInt(); 
				int reverse = 0;
				
		while(number != 0)   
		{  
		int rem = number % 10;  
		reverse = reverse * 10 + rem;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  

	

}
