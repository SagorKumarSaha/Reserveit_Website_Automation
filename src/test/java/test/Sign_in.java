package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Sign_in extends DRIVER {
	
	@Test(priority=1)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/header[2]/div/div/a[2]/button")).click();
		Thread.sleep(1000);
		
		// scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/h4"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(1000);
		
		//phone number
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input")).sendKeys("01874892188");
		Thread.sleep(500);
		
		//password
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input")).sendKeys("123456");
		Thread.sleep(500);
		
		//signin button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/button")).click();
		Thread.sleep(2000);
		
		String s = driver.findElement(By.xpath("/html/body/div[3]/div")).getText();
		System.out.println("Message capture from notification : "+s);

		if (s.equalsIgnoreCase("welcome!!") == true)
		{
			System.out.println("Test passed and successfully signed in...");

		} else {
			System.out.println("Test failed... Sorry!!");
		}
	}
	
	

}
