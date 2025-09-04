package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PouplarInTown_NewToReserveit extends DRIVER{
	
	@Test(priority=1)
	public void popular_in_town() throws InterruptedException {
		Thread.sleep(1500);
		//scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement sc = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[4]/h4"));
		js.executeScript("arguments[0].scrollIntoView();", sc);
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[4]/div[1]/div[1]/a/span")).click();
		Thread.sleep(2000);
		
		List<WebElement> list =  driver.findElements(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div/li"));
		System.out.println(list.size());
		
		for(WebElement e:list) {
			String value = e.getText();
			System.out.println(value);
		}
		
		if(list.size()==20) {
			System.out.println("Test passed...");
		}else {
			System.out.println("Test failed...");
		}
		
		
	}

}
