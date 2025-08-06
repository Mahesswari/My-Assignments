package week3.day2;

public class Safari extends Edge
{
	public void rederMode() 
	{
		System.out.println("The Redeable mode is on");
	}

	public static void main(String[] args) 
	{
		Safari obj = new Safari();
		obj.clearCache();
		obj.clearcookies();
		obj.openincognito();
		obj.navigateback();
		obj.openURL();
		obj.rederMode();
		obj.closeBrowser();

	}

}
