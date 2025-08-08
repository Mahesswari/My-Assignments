package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		//to Launch the browser
		ChromeDriver drive= new ChromeDriver();
		
		//Implicit wait to load all the elements
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//To open the url and maximize the window
		drive.get("https://en-gb.facebook.com/");
		drive.manage().window().maximize();
		
		// To Create a new account
		drive.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//To type first name
		drive.findElement(By.name("firstname")).sendKeys("Mahesswari");
		
		//To type Surname name
		drive.findElement(By.name("lastname")).sendKeys("Janarthanan");
		
		//To select the Date of birth
		WebElement element = drive.findElement(By.id("day"));
		
		Select day =new Select(element);
		day.selectByValue("11");
		
		//Month
		WebElement element1 = drive.findElement(By.id("month"));
		
		Select month =new Select(element1);
		month.selectByVisibleText("Jun");
		
		//Year
		WebElement element2 = drive.findElement(By.id("year"));
		
		Select year =new Select(element2);
		year.selectByVisibleText("1997");
		
		//Select the radio button for gender
		drive.findElement(By.xpath("//input[@id='sex' and @value='1']")).click();
		//drive.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		//drive.findElement(By.xpath("//label[text()='Female']/input")).click();
		
		//Mobile or email id
		drive.findElement(By.name("reg_email__")).sendKeys("maggi11.jana@gmail.com");
		
		//New password
		drive.findElement(By.id("password_step_input")).sendKeys("Augg@2025");
		
		//submit
		drive.findElement(By.name("websubmit")).click();
		
		
		
		
	}

}
