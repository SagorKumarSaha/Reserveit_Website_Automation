package test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class all_social_links extends DRIVER{
	
	@Test(priority=1)
	public void social_links() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/footer/header"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(1500);
		
		//facebook button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/footer/header/div[1]/div[1]/div[1]/div/a[1]/button")).click();
		Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // because button click opens new window but system is still in 
		//parent window. So we have to shift in child window every time to get page's information.
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Reserveit BD | Facebook") == true) {
			System.out.println("Facebook url works fine...");
		}else {
			System.out.println("Facebook url giving error...");
		}
		
		driver.switchTo().window(tabs.get(0)); // switching to parent window
		Thread.sleep(2000);
		
		//linkedin button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/footer/header/div[1]/div[1]/div[1]/div/a[2]/button")).click();
		Thread.sleep(2000);
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(2));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		
		if(driver.getTitle().equalsIgnoreCase("Reserveit BD | LinkedIn") == true) {
			System.out.println("Linkedin url works fine...");
		}else {
			System.out.println("Linkedin url giving error...");
		}
		
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		
		
		// instagram button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/footer/header/div[1]/div[1]/div[1]/div/a[3]/button")).click();
		Thread.sleep(2000);
		ArrayList<String> tab1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(3));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase("Reserveit (@reserveitbd) • Instagram photos and videos") == true) {
			System.out.println("Instagram url works fine...");
		} else {
			System.out.println("Instagram url giving error...");
		}

		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		
		
		// playstore button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/footer/header/div[1]/div[1]/div[4]/div/a[1]/div/img")).click();
		Thread.sleep(2000);
		ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(4));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase("Reserveit - Apps on Google Play") == true) {
			System.out.println("PlayStore url works fine...");
		} else {
			System.out.println("PlayStore url giving error...");
		}

		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		
		
		// AppleStore button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/footer/header/div[1]/div[1]/div[4]/div/a[2]/div/img")).click();
		Thread.sleep(2000);
		ArrayList<String> tab3 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab3.get(5));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase("‎\r\n"
				+ "      ‎Reserveit BD on the App Store\r\n"
				+ "    ") == true) {
			System.out.println("AppleStore url works fine...");
		} else {
			System.out.println("AppleStore url giving error...");
		}

		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		
	}

}
