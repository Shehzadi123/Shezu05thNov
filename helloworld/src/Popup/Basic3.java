package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic3 {
	public static void main(String []args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("yes");
		a.accept();
		Thread.sleep(3000);
		driver.close();
	
		
	}

}
