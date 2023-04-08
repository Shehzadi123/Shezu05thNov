package RoyalEnfield;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateElement {
	public static void main(String []args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/");
		driver.findElement(By.xpath("//a[@class='icon-close']")).click();
		Actions act = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//a[@title='Shop the Look']"));
		act.moveToElement(a).perform();
		WebElement b = driver.findElement(By.xpath("//a[text()='Accessories']"));
		act.click(b).perform();
	}

}
