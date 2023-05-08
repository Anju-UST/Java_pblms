package Assignment1;

public class Disarium_no {
//sum of its digit raised to the power of their respective positions is equal to the number itself.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=387,  sum = 0, rem = 0, n;  
        int len = calculateLength(num);  
           
        n = num;    
        while(num > 0){  
            rem = num%10;  
            sum = sum + (int)Math.pow(rem,len);  //length of number and last digit
            num = num/10;  //3+64+343=410
            len--;  
        }  
          
        //Checks whether the sum is equal to the number , then disarium  
        if(sum == n)  
            System.out.println("disarium");  
        else
        	System.out.println("sum="+sum);
        	System.out.println(n + " is not a disarium number");  
    }  
		
	public static int calculateLength(int n){  
        int length = 0;  
        while(n != 0){  
            length = length + 1;  
            n = n/10;  
        }  
        return length;  
    }  

}
