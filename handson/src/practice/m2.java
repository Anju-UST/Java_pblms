package practice;

import java.io.*;
import java.util.Scanner;
public class m2{
	public static void main (String[] args) {
//		System.out.println("GfG!");

 // Scanner sc = new Scanner(System.in);
 // int n=sc.nextInt();
 int n=6;
  int m=n-1;
  
  int a[]={1,2,3,4,5,6};
  if(n%2==0){
      int e1=(m-1)/2;
      int e2=(m+1)/2;
      System.out.println(a[e1]+","+a[e2]);
  }
  else{
      System.out.println(a[m/2]);
  }
	}
}
	
	