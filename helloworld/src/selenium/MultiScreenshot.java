package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultiScreenshot {
	public static void main(String []args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		for(int i=1;i<=10;i++) {
		File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File tostore = new File("C:\\Users\\Smash-PC\\Music\\velocity\\SeleniumScreensho"+i+".jpg");
		FileHandler.copy(a, tostore);
		
			
		}
	
	}

}
