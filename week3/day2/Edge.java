package week3.day2;

public class Edge extends Chrome {
	public void takesnap() 
	{
		System.out.println("Taken snaps");
	}
     public void clearcookies() 
     {
    	 System.out.println("Cleared the cookies");
	}
	public static void main(String[] args) {
		Edge edopt = new Edge();
		edopt.openincognito();
		edopt.openURL();
		edopt.clearCache();
		edopt.closeBrowser();
		edopt.navigateback();
		edopt.takesnap();

	}

}
