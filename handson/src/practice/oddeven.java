package practice;

import java.util.Scanner;

public class oddeven {

	
		// TODO Auto-generated method stub
		public static void calculate() {
			  
			 Scanner sc = new Scanner(System.in); 
			 int[] a = new int[10];

			 System.out.println("Enter the array elements : "); 
			 for (int i = 0; i <a.length; i++) 
			 { a[i] = sc.nextInt(); } 
			 int j=0,k=0; 
			 int[] even =new int[10];
			 int[] odd =new int[10]; 
			 for (int i = 0; i < a.length; i++) 
			 { 
				 if(a[i]%2==0) 
				 {
				 even[j]=a[i]; 
				 j++; 
				} 
			 else { 
				 odd[k]=a[i]; k++; 
				 } 
			 }
				 
			System.out.println("Even Array Elements : "); 
			for(int i=0;i<j;i++) 
			{
			 System.out.println(even[i]);
			 } 
			
			System.out.println("Odd Array Elements : ");
			 for(int i=0;i<k;i++) { 
				 System.out.println(odd[i]); 
				 } 
			 int pos=a.length; 
			 int d[]=new int[pos]; 
			 System.out.println("Merged Array");
			 
			 for(int i=0;i<j;i++) { 
				 d[i]=even[i]; 
				 } 
			 int m=j; int p=0; 
			 for(int i=m;i<a.length;i++) { 
				 p=i-j; 
				 d[i]=odd[p];
			 }
			 
			 
			 for(int i=0;i<d.length;i++) { 
				 System.out.print(d[i]); 
				 System.out.print(" ");
			 
			 }

	}

}
