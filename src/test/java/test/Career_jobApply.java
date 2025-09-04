package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Career_jobApply extends DRIVER{
	@Test(priority=1)
	public void career() throws InterruptedException {
		Thread.sleep(3000);
		//scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement sc = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[7]/h4"));
		js.executeScript("arguments[0].scrollIntoView();",sc);
		Thread.sleep(2000);
		
		//career button click
		driver.findElement(By.linkText("Career")).click();
		Thread.sleep(3000);
		
		//scroll
		WebElement sc1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[2]"));
		js.executeScript("arguments[0].scrollIntoView();",sc1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div[3]/div[2]/div/div/div[1]/a/h6")).click();
		Thread.sleep(2000);
		//apply now button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/main/div/aside/a/button")).click();
		Thread.sleep(2000);
		
		String e = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/h4")).getText();
		
		if(e.equalsIgnoreCase("welcome") == true) {
			System.out.println("Test passed and successfully came to sign in page...");
		}else {
			System.out.println("Test failed...");
		}
	}
	
	@Test(priority=2)
	public void signin() throws InterruptedException {
		Thread.sleep(1000);

		// scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/h4"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/span[2]/input"))
				.sendKeys("01874892188");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/span[2]/input"))
				.sendKeys("123456");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/button")).click();
		Thread.sleep(2000);
		
		//html/body/div[3]/div/div
		//html/body/div[3]/div
		
		//get welcome message from successful signin
		String s = driver.findElement(By.xpath("/html/body/div[3]/div")).getText();
		System.out.println("Message capture from notification : "+s);

		if (s.equalsIgnoreCase("welcome!!") == true)
		{
			System.out.println("Test passed and successfully signed in...");

		} else {
			System.out.println("Test failed... Sorry!!");
		}

	}
	
	@Test(priority=3)
	public void Form_Fillup() throws InterruptedException, FindFailed {
		Thread.sleep(1000);
		
		//scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/h1[1]"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(1000);
		
		//firstname_field
		driver.findElement(By.name("Firstname")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Firstname")).sendKeys("Sagor");
		Thread.sleep(500);
		
		//lastname
		driver.findElement(By.name("Lastname")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Lastname")).sendKeys("Saha");
		Thread.sleep(500);
		
		//email
		driver.findElement(By.name("Email")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Email")).sendKeys("sagor@gmail.com");
		Thread.sleep(500);
		
		//phone number
		driver.findElement(By.name("Phone")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Phone")).sendKeys("01874892188");
		Thread.sleep(500);
		
		//address
		driver.findElement(By.name("PresentAddress")).click();
		Thread.sleep(500);
		driver.findElement(By.name("PresentAddress")).sendKeys("lalmatia, Dhaka");
		Thread.sleep(500);
		
		//study status
		driver.findElement(By.name("country")).click();
		Thread.sleep(500);
		driver.findElement(By.name("country")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		driver.findElement(By.name("country")).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		//university name
		driver.findElement(By.name("UniversityName")).click();
		Thread.sleep(500);
		driver.findElement(By.name("UniversityName")).sendKeys("BUBT");
		Thread.sleep(1000);
		
		//scroll
		WebElement sc1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[2]/div[1]"));
		js.executeScript("arguments[0].scrollIntoView();", sc1);
		Thread.sleep(1500);
		
		//upload cv
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/div[2]/div[1]/div")).click();
		
		String imagefiles = "C:\\Users\\User\\Desktop\\sikuli\\";
		String pdfpath = "C:\\Users\\User\\Desktop\\sikuli\\file\\";
		
		Screen s = new Screen();
		
		Pattern inputTextBox = new Pattern(imagefiles + "f.png");
		Pattern openButton = new Pattern(imagefiles + "o.png");
		
		Thread.sleep(2000);
		
		s.wait(inputTextBox, 20);
		s.type(inputTextBox,pdfpath + "qa.pdf");
		s.click(openButton);
		
		Thread.sleep(2000);
		
		//upload cover letter
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/div[3]/div[2]/div[2]/div/div")).click();
		
		String imagefiles2 = "C:\\Users\\User\\Desktop\\sikuli\\";
		String pdfpath2 = "C:\\Users\\User\\Desktop\\sikuli\\file\\";
		
		Screen s2 = new Screen();
		
		Pattern inputTextBox2 = new Pattern(imagefiles2 + "f.png");
		Pattern openButton2 = new Pattern(imagefiles2 + "o.png");
		
		Thread.sleep(2000);
		
		s2.wait(inputTextBox2, 20);
		s2.type(inputTextBox2,pdfpath2 + "api.pdf");
		s2.click(openButton2);
		
		Thread.sleep(1500);
		
		//submit button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/form/button")).click();
		Thread.sleep(4000);
		
		String st = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/h2")).getText();
		
		if(st.equalsIgnoreCase("congratulation") == true) {
			System.out.println("Test passed and successfully submitted form...");
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/a/button")).click();
		} else {
			System.out.println("Test failed... Sorry error occured.!!");
		}
		
	}

}
