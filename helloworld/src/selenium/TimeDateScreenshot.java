package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeDateScreenshot {
	public static void main(String []args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String Time = new SimpleDateFormat("MM-dd-yyyy-hh-mm-ss").format(new Date());
		File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\Smash-PC\\Music\\velocity\\SeleniumScreenshot"+Time+".jpg");
		FileHandler.copy(a, path);
	}

}
