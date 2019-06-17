package com.yugandhar.synechron.pratice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickOnAPI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Get url
		driver.get("https://www.seleniumhq.org/download/");

		//Click on API url
		driver.findElement(By.xpath("//tr[td[text()='Python']]//a[text()='API docs']")).click();

		//get currentURL
		String url = (driver.getCurrentUrl());
		System.out.println(url);

		if(url.contentEquals("https://seleniumhq.github.io/selenium/docs/api/py/index.html")) {
			System.out.println("URL Matches & Pass...");}

		else {
			System.out.println("Url NOT matched..."); }		

	}


}


