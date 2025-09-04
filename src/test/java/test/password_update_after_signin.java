package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class password_update_after_signin extends DRIVER{
	@Test(priority=1)
	public void signin() throws InterruptedException {
		//signin button click
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/header[2]/div/div/a[2]/button")).click();
		Thread.sleep(2000);
		
		//scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/h4"));
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		Thread.sleep(1000);
		
		//phone number
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input")).sendKeys("01874892188");
		Thread.sleep(1000);
		
		//password      //always taking atleast 6 characters as a password
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input")).sendKeys("123456");
		Thread.sleep(1000);
		
		//signin button click
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/button")).click();
		
		//Account Details
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/main/div/form/h1")).getText();
		
		if(s.equals("Account Details") == true) {
			System.out.println("Sign-in successfull");
		}else {
			System.out.println("Sign-in failed");
		}
		
		
	}
	
	@Test(priority=2)
	public void update_password() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Security")).click();
		
		//password field
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div/form/div[1]/span[2]/input")).click();
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div/form/div[1]/span[2]/input"));
		e1.sendKeys("1234567");
		Thread.sleep(1000);
		
		//create new password        //issue - field taking less than 6 character as a password
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div/form/div[2]/span[2]/input")).click();
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div/form/div[2]/span[2]/input"));
		e2.sendKeys("123456");
		Thread.sleep(1000);
		
		//confirm new password
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div/form/div[3]/span[2]/input")).click();
		WebElement e3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div/form/div[3]/span[2]/input"));
		e3.sendKeys("123456");
		Thread.sleep(1000);
		
		//update button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div/form/button")).click();
		Thread.sleep(1500);
		
		String ss = driver.findElement(By.xpath("/html/body/div[3]")).getText();
		
		if(ss.equalsIgnoreCase("Current password is incorrect") ==true) {
			System.out.println("OOPPS..!! Test failed.. Please enter the correct current password..");
		}else if(ss.equalsIgnoreCase("New password didin't match!")==true) {
			System.out.println("OOPPS..!! Test failed.. Create new password and Confirm new password are not same..");
		}
		
		else {
			System.out.println("Updated password successfully!");
		}
		
	}

}
