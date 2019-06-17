package com.yugandhar.synechron.pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JQuerySelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Click on 'Input Forms'
		driver.findElement(By.xpath("//li[@class='dropdown']//a[contains(text(),'Input Forms')]")).click();
		//Select JQuery Select Dropdown
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[text()='JQuery Select dropdown']")).click();

		//Drop Down with Search box,select 'Country'
		int country = 5;
		WebElement webEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select selectCountry = new Select(webEle);
		selectCountry.selectByIndex(country);

		System.out.println(country);

		//Select Multiple Values,select 'State'

		WebElement webEle1 = driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']"));
		Select selectState = new Select(webEle1);
		System.out.println(webEle1.getSize());




	}

}
