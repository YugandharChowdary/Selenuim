package com.yugandhar.synechron.pratice;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);


		driver.findElements(By.tagName("//iframe"));

		List<WebElement> frameList = null;
		
		int numOfFrames = frameList.size();
				
		
	}

}
