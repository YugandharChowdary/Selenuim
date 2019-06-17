package com.yugandhar.synechron.pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleFormDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		//Launch web page
		driver.get("https://www.seleniumeasy.com/test/");
		//Display full screen
		driver.manage().window().maximize();
		//Wait 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Click on 'Input Forms'
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		//Click on 'Simple Form Demo'
		driver.findElement(By.xpath("//ul//li[@style='display: list-item;']//a[text()='Simple Form Demo']")).click();
		//Single Input Field Enter Message
		driver.findElement(By.id("user-message")).sendKeys("Hello Synechron");
		driver.findElement(By.xpath("//div//button[text()='Show Message']")).click();

		//Verify Input Message
		String yourMessge = driver.findElement(By.id("display")).getText();
		System.out.println(yourMessge);
		if(yourMessge.contentEquals("Hello Synechron")) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}

		//Two Input Field Enter Message
		driver.findElement(By.id("sum1")).sendKeys("9");
		driver.findElement(By.id("sum2")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Get Total']")).click();

		//Verify Input Message
		String getTotal = driver.findElement(By.id("displayvalue")).getText();
		System.out.println(getTotal);
		if(getTotal.contentEquals("18"))
		{
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");

		}
	}
}



