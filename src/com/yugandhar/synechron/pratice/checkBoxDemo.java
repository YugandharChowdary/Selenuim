package com.yugandhar.synechron.pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxDemo {

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
		//Click on 'Checkbox Demo'
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[text()='Checkbox Demo']")).click();
		//Click on 'CheckAll' button
		WebElement checkAll = driver.findElement(By.id("check1"));
		checkAll.click();
		//Click on 'Uncheck All' button
		String uncheckAll = driver.findElement(By.id("check1")).getAttribute("value");
		System.out.println(uncheckAll);
		

		if(uncheckAll.equals("Uncheck All")){
			System.out.println("Displaed Uncheck All and Pass"); } else{
				System.out.println("Not displaed Uncheck All and Fail"); }

		//Un-check any one check box
		driver.findElement(By.xpath("//label[text()='Option 1']")).click();
		//Verify button un-check
		String uncheck = driver.findElement(By.id("check1")).getAttribute("value");
		if(uncheck.equals("Check All")) {
			System.out.println("UncheckAll button changed to 'Check All'");
		}
		else {
			System.out.println("UncheckAll button NOT changed to 'Check All'");
		}
	}



}


