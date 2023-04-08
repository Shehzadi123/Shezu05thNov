package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFacebook {
	public static void main(String []args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Smash-PC\\Music\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 System.out.println("Hold screen for 3 sec.");
		 
		 
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(3000);
		 System.out.println("Close tab");
		 
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.amazon.com/");
		 Thread.sleep(3000);
		 driver.close();
		 
}
}
