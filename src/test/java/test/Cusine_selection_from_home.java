package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Cusine_selection_from_home extends DRIVER{
	@Test(priority=1)
	public void home_cusine() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/h4"));
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/div/div/div[1]/div[7]/button")).click();
		Thread.sleep(4000);
		
	}
	
	@Test(priority=2)
	public void check_cusine_list() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/div[2]/div/h5[3]"));
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/div[2]/div/div[5]/div/div[7]/label/span[1]/input"));
		
		if(a.isSelected()== true) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
	}

}
