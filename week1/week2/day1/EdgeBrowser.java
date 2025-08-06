package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args)
	{
		Browser Browsing = new Browser();
		String Chrome = Browsing.launchBrowser();
		System.out.println(Chrome);
		Browsing.loadUrl();

	}

}
