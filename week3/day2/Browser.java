package week3.day2;

public class Browser {
	String browserName= "www.facebook.com";
	float browserversion=2.0f;
	public void openURL() 
	{
         System.out.println("Browser name:"+ browserName);  
         System.out.println("Browser version:"+ browserversion);
	}
    public void closeBrowser() 
	{
         System.out.println("Close the browser");        
	}
	public void navigateback() 
	{
		System.out.println("Navigate the page back");
	}
	
	public static void main(String[] args) {
		Browser browseropt =new Browser();
		browseropt.openURL();
		browseropt.closeBrowser();
		browseropt.navigateback();	
		
	}
}
