package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Register_restaurant extends DRIVER{
	@Test(priority=1)
	public void register_my_restaurant() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/header[1]/div/a[2]/p")).click();
		Thread.sleep(3000);
		//scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[4]/button"));
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		Thread.sleep(1000);
		
		//get started button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[4]/button")).click();
		Thread.sleep(3000);
		
		//restaurant name
		Thread.sleep(500);
		WebElement scroll1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[1]/span[1]"));
		js.executeScript("arguments[0].scrollIntoView();",scroll1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[1]/span[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[1]/span[2]/input")).sendKeys("gopal var");
		Thread.sleep(1000);
		
		//email and phone
		Thread.sleep(500);
		WebElement scroll2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[1]"));
		js.executeScript("arguments[0].scrollIntoView();",scroll2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input")).sendKeys("1234@gm.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input")).sendKeys("01912345610");
		Thread.sleep(1000);
		
		//address and message
		Thread.sleep(500);
		WebElement scroll3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[4]/span"));
		js.executeScript("arguments[0].scrollIntoView();",scroll3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[4]/textarea")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[4]/textarea")).sendKeys("8/2, lalmatia, dhaka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[5]/textarea")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[5]/textarea")).sendKeys("I want to be your vendor");
		Thread.sleep(1000);
		
		//registration button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/button")).click();
		
		Thread.sleep(3000);
		
		/*String a = driver.findElement(By.xpath("//*[@id=\":rac:\"]/div")).getText();
		String b = driver.findElement(By.xpath("//*[@id=\":rkm:\"]/div")).getText();
		
		if(a.equalsIgnoreCase("\"Restaurant Name\" is not allowed to be empty") || b.equalsIgnoreCase("\"Phone Number\" is not allowed to be empty") == true) {
			System.out.println("Test is failed...!!");
		}else
		{
			System.out.println("Test is passed..!!");
		}*/
	}

}
