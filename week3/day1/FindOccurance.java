package week3.day1;

public class FindOccurance {

	public static void main(String[] args) {
		String input="TestLeaf";
		char letter='e';
		int count=0;
		
		char[] charArray = input.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]==letter)
			{
				count++;
			}
		}
		System.out.println(count);
					
	}

}
