package com.yugandhar.synechron.pratice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class APIforPython {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.seleniumhq.org/download/");

		driver.findElement(By.xpath("//td[text()='Python']//..//td/a[text()='API docs']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("https://seleniumhq.github.io/selenium/docs/api/py/index.html"))
		{System.out.println("Url Matches");
		}
		else {
			System.out.println("Url Not matched");}

	}


}


