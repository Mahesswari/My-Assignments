package week3.day2;


public class Overridding extends Overloading{
	
	public void reportStep(String msg,String status,boolean snap)
	{
		super.takesnap();
		System.out.println(msg+"  "+status+ " "+snap);
	}
	public static void main(String[] args) {
		Overridding over = new Overridding();
		over.reportStep("Message", "Failed", false);
		over.reportStep("Messsage", "Sent");
		over.takesnap();
	}

}
