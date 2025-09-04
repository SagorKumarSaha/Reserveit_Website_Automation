package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Reservation_without_signin_payment_success extends DRIVER {
	@Test(priority =1, description = "In this case, without sign in i am making a "
			+ "reservation and Reservation payment is succesful")
	public void reservation() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/header[2]/div/div/span/button")).click();
		
		/*//datepick
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[2]/form/div[1]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[4]/td[2]/div")).click();
		
		//timepick
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[2]/form/div[2]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div[1]/div/ul[1]/li[12]/div")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div[1]/div/ul[2]/li[1]/div")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div[1]/div/ul[3]/li[1]/div")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div[2]/ul/li[2]/button")).click();
		
		//guestpick
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[2]/form/div[3]/div")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div/ul/li[10]")).click();
		*/
		
		//restaurantname
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[4]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[4]/div/input")).sendKeys("kfc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[4]/button")).click();
		Thread.sleep(2000);
		
		//selectrestaurant
		driver.findElement(By.partialLinkText("KFC test updates")).click();
		
		//checkin
		
		//1st way for wait beacause the element need some time for visibility.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		//scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/div[2]/div[1]"));
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/div[2]/div[1]/div/div/div[1]/div/div/input")).click();
		//for choosing 4 june
		//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/div[1]/div/button[1]")).click();
		Thread.sleep(2000);
		WebElement e2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/div[1]/div/button[1]")));
		e2.click();
		
		//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/div")).click();
		Thread.sleep(2000);
		WebElement e3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/div")));
		e3.click();
		//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[3]/div")).click();
		Thread.sleep(2000);
		WebElement e4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[3]/div")));
		e4.click();
		Thread.sleep(2000);
		
		//party size
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/div[2]/div[1]/div/div/div[2]/div/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/div[2]/div[1]/div/div/div[2]/div/div[2]/input")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/div[2]/div[1]/div/div/div[2]/div/div[2]/input")).sendKeys("20");
		Thread.sleep(3000);
		
		//Find a time button click
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/div[2]/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		WebElement e5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/div[2]/div[1]/div/div/div[3]/button[8]")));
		e5.click();
		Thread.sleep(3000);
		
	}
	@Test(priority=2)
	public void signin() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input")).sendKeys("01768161994");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/button")).click();
	}
	
	@Test(priority=3)
	public void reservation_confirm() throws InterruptedException {
		Thread.sleep(2000);
		// scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[2]/img"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"rc_select_2\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"rc_select_2\"]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"rc_select_2\"]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"rc_select_2\"]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"rc_select_2\"]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"rc_select_2\"]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/form/div[2]/textarea")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/form/div[2]/textarea")).sendKeys("I want best");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/form/div[5]/p/span[1]/label/span/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/form/button")).click();
		Thread.sleep(2000);
	}
	@Test(priority=4)
	public void payment() throws InterruptedException {
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/app-root/app-transaction/div/div[1]/div[1]/div/div[1]/app-tab-nav/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu2\"]/ul/li[1]/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sections\"]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[1]/form[1]/input[5]")).click();
		Thread.sleep(2000);
		
		String ti = driver.getTitle();
		
		if(ti.equals("Reserveit Blogs - Restaurant Reservation Platform Bangladesh")==true) {
			System.out.println("Test passed");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[2]/a/button")).click();
		}else {
			System.out.println("Test failed");
		}
	}

}
