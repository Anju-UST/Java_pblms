package Assignment1;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=387;
		System.out.print("The factors are:: ");
	       findFactor(num);

	}
	public static void findFactor(int n) {
	       for(int i=1; i <= n; i++) {
	           if(n % i == 0)
	               System.out.print(i+"\t");
	       }
	   }
}
