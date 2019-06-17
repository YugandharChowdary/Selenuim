package com.yugandhar.synechron.pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormSubmit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Launch web page
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		//Wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Click on 'Input Forms'
		driver.findElement(By.xpath("//li[@class='dropdown']//a[contains(text(),'Input Forms')]")).click();
		//Click on 'Input Form Submit'
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[text()='Input Form Submit']")).click();
		//Enter 'First Name'
		driver.findElement(By.name("first_name")).sendKeys("Yugandhar");
		//Enter 'Last Name'
		driver.findElement(By.name("last_name")).sendKeys("Chowdary");
		//Enter 'E-Mail'
		driver.findElement(By.name("email")).sendKeys("yugandharchowdary4@gmail.com");
		//Enter 'Phone Number'
		driver.findElement(By.name("phone")).sendKeys("7911908342");
		//Enter 'Address'
		driver.findElement(By.name("address")).sendKeys("12/109, 2'nd Floor,Marathahalli");
		//Enter 'City'
		driver.findElement(By.name("city")).sendKeys("Bangalore");
		//Select 'State'from list box
		WebElement	elemet = driver.findElement(By.name("state"));
		Select select = new Select(elemet);
		select.selectByVisibleText("District of Columbia");
		//Enter 'Zip Code'
		driver.findElement(By.name("zip")).sendKeys("12345");
		//Enter 'Website or domain name'
		driver.findElement(By.name("website")).sendKeys("Retail");
		//Select 'Yes' radio button
		driver.findElement(By.xpath("//input[@value='yes']")).click();
		//Enter 'Project Description'
		driver.findElement(By.name("comment")).sendKeys("Selenium Pratice");
		//Click on 'Send' button
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();



	}

}
