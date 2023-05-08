package Assignment1;

public class Prime {
//check whether prime
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=387;
		boolean flag = false;
	    for (int i = 2; i <= n/ 2; ++i) {
	     
	      if (n% i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
			System.out.println("prime");
		else
			System.out.println("not prime");
			

	}

}
