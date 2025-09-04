package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class locationSlect_verify_restaurant extends DRIVER{
	
	@Test(priority=1)
	public void location_selection() throws InterruptedException {
		
		Thread.sleep(1500);
		//scroll to locations
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement sc = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[7]"));
		js.executeScript("arguments[0].scrollIntoView();", sc);
		Thread.sleep(1500);
		
		//dhaka chattogram Mohammadpur Nearby button click
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[7]/ul/li[1]/span")).click();
		Thread.sleep(1000);
		
		//select sub location
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[7]/div[2]/div/a[6]/h6")).click();
		Thread.sleep(2000);//*[@id="__next"]/div/div/div/div/div[2]/div[3]/div[2]/li
		//*[@id="__next"]/div/div/div/div/div[2]/div[3]/div[2]/li/div[2]/a/h5
		
	}
	
	@Test(priority=2)
	public void verify_info() {
		
		String w = driver.getCurrentUrl();
		String s = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/div[3]/div[2]/li/div[2]/a/h5")).getText();
		
		
		List<WebElement> list =  driver.findElements(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/div[3]/div[2]/li"));
		System.out.println(list.size());
		
		for(WebElement e:list) {
			String value = e.getText();
			System.out.println(value);
		}
		
		
		if(w.contains("location=gulshan%2Cdhaka") && s.equalsIgnoreCase("BFC21") == true) {
			System.out.println("Test passed ...");

		} else {
			System.out.println("Test failed... Sorry!!");
		}
	}

}
