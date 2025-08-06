package week3.day2;

public class Overloading {
	
	public void reportStep(String msg,String status) 
	{
         System.out.println(msg+" "+status); 
	}
	
	public void reportStep(String msg,String status,boolean snap)
	{
		System.out.println(msg+" "+status+ " "+snap);
	}
	public void takesnap() {
		System.out.println("The snap is taken");

	}
	public static void main(String[] args) {
		Overloading report = new Overloading();
		report.reportStep("Sucessfully", "Passed");
		report.reportStep("Sucessfully", "Passed", false);
	}

	

	
		
	}

	


