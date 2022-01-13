package coding1;
   import java.util.Scanner;

public class Check_Vowel {

	public static void main(String[] args) {
	
	 char ch;
	   System.out.print("Enter an alphabet: ");
	   Scanner input = new Scanner (System.in);
	          ch = input.next().charAt(0);
	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
	{
		System.out.print("Alphabet is Vowel");
	}
	else {
         System.out.print("Alphabet is Consonant");	
		
         }
     }
}