package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) 
	{
		//Initial value =-5
		//loop the value till 5
		//Adding it by 1
		for(int i=-5;i<=5;i++)
		{
			if(i>=0)
			{
				//If the number is positive the print statement is printed
				System.out.println("The number is positive: "+i);
			}
			else
			{
				//If the number is negative the print statement is printed
				System.out.println("The number is negative: "+i);
			}
		}
	}

}
