package com.yugandhar.synechron.pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailLoginAndLogut {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//Java code
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		//Launch 'Gmail' WebPage
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		//Maximize screen
		driver.manage().window().maximize();

		//Enter UserName
		driver.findElement(By.id("identifierId")).sendKeys("gopijavvaji250");

		//Click on 'Next' button
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(4000);

		//Enter Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gopi143@123");
		js.executeScript("document.getElementById('password').value='gopi143@123'");
		
		
		//Click on 'Next' button
		WebElement button =driver.findElement(By.xpath("//div[@id='passwordNext']//span"));		
		js.executeScript("arguments[0].click()", button);
		
		js.executeScript("document.getElementById('password').value='gopi143@123'");
		Thread.sleep(5000);
		//Login Verification 
		String title = driver.getTitle();

		if (title.contains("gopijavvaji250")) 

		{ System.out.println("Loggedin Sucessfully");

		}else 
		{ System.out.println("Login failed"); }


		//Logout
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//span[@class='gb_xa gbii']")).click();		
		driver.findElement(By.xpath("//a[@class='gb_0 gb_Lf gb_Sf gb_se gb_kb']")).click();

		driver.close();
	}

}
