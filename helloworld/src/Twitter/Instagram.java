package Twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("mrkhiladi");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("123456789");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		
		
	}
}
