package Assignment1;

public class Perfect_num {
//sum of factors (except num) is equal to number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=387;
		int s=0;
		s = isPerfect(number);  
		//compares sum with the number  
		if(s==number)  
		System.out.println(number+" is a perfect number");  
		else  
		System.out.println(number+" is not a perfect number"); 
		
		 
	}

	private static int isPerfect(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		 for(int i=1; i <= num/2; i++)  
		 {  
		 if(num % i == 0)  
		 {  
		 //calculates the sum of factors  
		 sum=sum + i; 
		 }
		 }
		 return sum;
	}

}
