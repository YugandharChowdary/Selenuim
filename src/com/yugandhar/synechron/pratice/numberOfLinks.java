package com.yugandhar.synechron.pratice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class numberOfLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);

		WebElement searchtext = driver.findElement(By.xpath("//input[@type='text']"));

		searchtext.click();
		searchtext.sendKeys("Selenium");

		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@name='btnK']")).click();

		List<WebElement> List = driver.findElements(By.xpath("//a"));
		int iSize = List.size();

		System.out.println(iSize);
	}



}
