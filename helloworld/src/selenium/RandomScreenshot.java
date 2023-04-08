package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomScreenshot {
	public static void main(String []args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		for(int i=0;i<=10;i++) {
			String Random = RandomString.make(3);
			File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File path = new File("C:\\Users\\Smash-PC\\Music\\velocity\\SeleniumScreensho"+Random+".jpg");
			FileHandler.copy(a, path);
			
		}
	}
}
