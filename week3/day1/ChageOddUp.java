package week3.day1;

public class ChageOddUp {

	public static void main(String[] args) 
	{
		String test = "changeme";
		char[] testArray = test.toCharArray();
		for(int i=testArray.length-1;i>=0;i--)
		{
			if(i % 2 ==1)
			{
				testArray[i]= Character.toUpperCase(testArray[i]);				
			}
			else
			{
				testArray[i]= testArray[i];			
			}
			 						
		}	
		System.out.println(new String(testArray));
		
	}

}
