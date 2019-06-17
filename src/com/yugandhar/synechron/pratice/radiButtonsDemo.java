package com.yugandhar.synechron.pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiButtonsDemo {

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
		driver.findElement(By.xpath("//li[@class='dropdown']//a[contains(text(),'Input Forms')]")).click();
		//Click on 'Radio Buttons Demo'
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[text()='Radio Buttons Demo']")).click();

		//Radio Button Demo, select 'Male' radio button
		driver.findElement(By.xpath("//label[@class='radio-inline']//input[@value='Male' and @name='optradio']")).click();

		//Click on 'Get Check Value' button
		driver.findElement(By.id("buttoncheck")).click();
		String male = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
		System.out.println(male);
		//Verify correct radio button selection
		if(male.contains("Male")) {
			System.out.println("Male radio button selected");
		}
		else {
			System.out.println("Male radio button NOT selected");
		}

		//Group Radio Buttons Demo,select 'Sex'
		WebElement maleRadio = driver.findElement(By.xpath("//label[@class='radio-inline']//input[@name='gender' and @value='Male']"));
		maleRadio.click();
		System.out.println("maleRadio");

		//Group Radio Buttons Demo,select 'Age group'
		driver.findElement(By.xpath("//label[@class='radio-inline']//input[@value='0 - 5']")).click();
		//Click on 'Get Values' button
		driver.findElement(By.xpath("//button[text()='Get values']")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class='groupradiobutton' and text()='Sex : Male']")).getText());


	}


}



