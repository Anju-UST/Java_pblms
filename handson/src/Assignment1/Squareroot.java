package Assignment1;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=387;
		System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
	} 
	
	public static double squareRoot(int number) {
		double temp;

		double sr = number / 2;//193

		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2; //193+2=195/2=97
											//193-97=96  2)temp=97 sr=97+3=100/2=50 3)t=50 sr=50+7=57/2=28
		} while ((temp - sr) != 0);

		return sr;
	    }

}
