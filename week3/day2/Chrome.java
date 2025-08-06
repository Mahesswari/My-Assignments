package week3.day2;

public class Chrome extends Browser
{
    public void openincognito() 
    {
      System.out.println("Opened the Incognito page");
	}
    public void clearCache() 
    {
        System.out.println("cleared cache");
	}
    public static void main(String[] args) 
    {
		Chrome chromeobj = new Chrome();
		chromeobj.openURL();
		chromeobj.closeBrowser();
		chromeobj.navigateback();
		chromeobj.openincognito();
		chromeobj.clearCache();
	}
}
