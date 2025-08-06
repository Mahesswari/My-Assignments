package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		int number=14641;
		int temp=number;
		int output=0;
		int reminder;
		
		while(number>0)
		{
			reminder=number%10;
			output= (output*10)+reminder;
			number= number/10;
		}
		
		if (temp==output)
		{
			System.out.println("The number is a palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}

}
