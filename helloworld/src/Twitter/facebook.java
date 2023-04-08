package Twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException{
	
	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://www.facebook.com/");
	driver.get("https://www.facebook.com/signup");
	Thread.sleep(3000);
	
	//driver.manage().window().maximize();
	//Thread.sleep(3000);
	
	//driver.manage().window().minimize();
	//Thread.sleep(3000);
	
	//driver.manage().window().maximize();
	//Thread.sleep(3000);
	
	//driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("shehzadiansari02@gmail.com");
	//driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]")).sendKeys("shehzadi12345678");
	//driver.findElement(By.xpath("//button[@name='login']")).click();
	
	//driver.findElement(By.xpath("(//a[contains(@class,'51sy')])[1]")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Papa ki");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pari");
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[3]")).sendKeys("p6409431@gmail.com");
	driver.findElement(By.xpath("(//input[contains(@name,'reg')])[3]")).sendKeys("melebabunethanathaya");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("(//span[text()='Sign in with Google'])[1]")).click();
	
	}
}
