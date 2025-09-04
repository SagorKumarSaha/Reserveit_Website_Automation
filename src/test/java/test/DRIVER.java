package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


public class DRIVER {

	public  WebDriver driver;
	public static WebElement element;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev.next.reserveitbd.com/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	//@AfterSuite
	/*public void close() {
		driver.close();
	}*/
	
}