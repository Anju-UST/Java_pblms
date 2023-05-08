package Assignment1;

public class Sum_of_Digits {
//sum of digits of a number - 387
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=387;
		int digit=0;
		int sum=0;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("sum of digits of a number:"+sum);

	}

}
