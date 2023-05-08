package handson;

import java.util.Scanner;
//sum of elements of array
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int n= sc.nextInt();
		int arr[]=new int[n];
		
//		 for(int i=0; i<n; i++)  
//		 {  
//	   
//			 arr[i]=sc.nextInt();} 
		
		// int [] arr = new int [] {1, 2, 3, 4, 5};
	        int sum = 0;  
	        
	        for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
	        }  
	        System.out.println("Sum : " + sum);

	}

}
