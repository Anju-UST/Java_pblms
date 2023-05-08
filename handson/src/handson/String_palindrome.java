package handson;

import java.util.Scanner;

public class String_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String string = sc.next();    
        boolean flag = true;    
            
    
        string = string.toLowerCase();    
            
        for(int i = 0; i < string.length()/2; i++){   
        	// malayalam -- checking till mid (l=2     9-2-1=6    2nd l in 6th position
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("palindrome");    
        else    
            System.out.println("not a palindrome");    

	}

}
