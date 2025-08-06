package week1.day2;

public class IsPrime {

	public static void main(String[] args) 
	{
         int number=9;

         //the number should not divisible by any other number other than 1 and 9
         for(int i=2;i<number;i++)
         {
        	 if(number %i==0)
        	 { 
        		continue;// skips the not prime number
        	 }
        	 
         }
        System.out.println("Prime number: "+number);
	}

	}
