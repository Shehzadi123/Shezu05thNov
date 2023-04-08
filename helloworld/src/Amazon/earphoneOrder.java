package Amazon;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class earphoneOrder {
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pTron pride lite HBE high bass earphones");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		
		  //WebElement a = driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[2]"));
		  //String b = a.getText();
		 // System.out.println(b);
	}

}
