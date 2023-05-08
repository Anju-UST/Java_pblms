package handson;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter query");
		int q=sc.nextInt();
		int j=0;
		while(j<q) {
		System.out.println("enter size");
		int n=sc.nextInt();
		System.out.println("enter leap");
		int leap=sc.nextInt();
		int garr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			garr[i]=sc.nextInt();
		}
		System.out.println("elements are");
		for(int i=0;i<n;i++) {
			System.out.println(garr[i]);
		}
		int i=0;
		
		while( i <n) {
			if(i==0 || garr[i+1]==0) 
			{	
				i=i+1;
				
				 if(i+leap>=n) 	
				{
					  System.out.println("yes");
					  break;
				}
				else if(garr[i+leap]==0) {
						System.out.println("yes");
						break;
					}
					else {
						System.out.println("no");
						break;
					}
			}
			else {
				if(garr[i-1]==0) {
				i=i-1;
				}
			}
		}
		j++;
	}

}
}
