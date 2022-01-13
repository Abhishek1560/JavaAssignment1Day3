package coding1;
 import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
	int a,b,c,largest,temp;
	 Scanner input = new Scanner (System.in);
	 
	 System.out.print("Enter the first number: ");
	 a = input.nextInt();
	 System.out.print("Enter the second number: ");
	 b = input.nextInt();
	 System.out.print("Enter the third number: ");
	 c = input.nextInt();
	 
	 temp= a>b?a:b;                //Ternary Operator
	 largest= c>temp?c:temp;       //variable_name = (expression) ? value if true:value if false  
 
     System.out.println("The largest number is: " +largest);
	 
	}

}
