package com.yugandhar.synechron.pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectDropdownList {

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
		//Click 'Select Dropdown List'
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[text()='Select Dropdown List']")).click();
		//Select a day
		String day = "Tuesday";

		WebElement webele = driver.findElement(By.id("select-demo"));
		Select selDay = new Select(webele);
		selDay.selectByValue(day);
		//Verify
		String weekDay = driver.findElement(By.xpath("//p[@class='selected-value']")).getText();
		System.out.println(weekDay);
		if(weekDay.contains(day)){
			System.out.println(day+ " Selected and Pass");
		}
		else 
		{
			System.out.println(day+ " Selected and Fail");
		}

		//Multi Select List Demo
		String city = "Pennsylvania";

		WebElement webele1 = driver.findElement(By.id("multi-select"));
		Select multiSele = new Select(webele1);
		multiSele.selectByVisibleText(city);
		//Click on 'First Selected'
		driver.findElement(By.id("printMe")).click();
		//Validation 
		if(multiSele.equals(city)) {
			System.out.println(city+ " City slected and Pass");
		}
		else {System.out.println(city+ " City slected and Fail ");

		}	

	}

}
