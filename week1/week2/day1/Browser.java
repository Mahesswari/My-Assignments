package week2.day1;

public class Browser {
	
	public String launchBrowser()
	{
		
		return "Chrome is launched sucessfully";
		
		
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args)
	{
		Browser ViewBrowser = new Browser();
		String launchBrowser = ViewBrowser.launchBrowser();
		System.out.println(launchBrowser);
		
		ViewBrowser.loadUrl();
		
	}
	

}
