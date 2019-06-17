package com.yugandhar.synechron.pratice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

public class AjaxFormSubmit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		//Click on 'InputForms'
		driver.findElement(By.xpath("//li[@class='dropdown']//a[contains(text(),'Input Forms')]")).click();
		//Click on 'AjaxFormSubmit'
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li/a[text()='Ajax Form Submit']")).click();
		//Enter 'Name'
		driver.findElement(By.id("title")).sendKeys("Practice Selenium");
		//Enter 'Comments'
		driver.findElement(By.id("description")).sendKeys("Practice Selenium by Yugandhar");
		//Click 'Submit' button
		driver.findElement(By.id("btn-submit")).click();

		//After submit 'Capture message'
		WebDriverWait wait = new WebDriverWait(driver, 5000);				
		WebElement outPut = driver.findElement(By.id("submit-control"));
		wait.until(ExpectedConditions.textToBePresentInElement(outPut, "Form submited Successfully!"));
		String outPut1 = driver.findElement(By.id("submit-control")).getText();
		System.out.println(outPut1);

		if(outPut1.contains("Successfully!")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
