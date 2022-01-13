package coding1;

public class GCD {

	public static void main(String[] args) {
		int x = 20, y = 16, gcd = 1;
		
		for(int i=1;i<=x && i<=y; i++)
		{
			if(x%i==0 && y%i==0)
			gcd = i;
		}
		System.out.println("gcd of x and y is: " +gcd);
		
	}

}
