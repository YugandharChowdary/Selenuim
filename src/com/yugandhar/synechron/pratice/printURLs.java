package com.yugandhar.synechron.pratice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printURLs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		//Click "Selenium Grid" by Gopi
		WebDriver driver = new ChromeDriver();
		//Display full screen
		driver.manage().window().fullscreen();
		driver.get(" https://www.seleniumhq.org/projects/");
		driver.findElement(By.xpath("//h3//a[text()='Selenium Grid']")).click();
		//get current url
		String cuURL = driver.getCurrentUrl();
		System.out.println(cuURL);
		Thread.sleep(4000);
		driver.navigate().back();


		//Click "Selenium IDE" by Gopi
		driver.get(" https://www.seleniumhq.org/projects/"); //Display full screen
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h3//a[text()='Selenium IDE']")).click(); 
		//get current url 
		String cuURL1 = driver.getCurrentUrl();
		System.out.println(cuURL1); Thread.sleep(4000); driver.navigate().back();

		//Click "Selenium Remote Control"
		driver.get("https://www.seleniumhq.org/projects/"); 
		//Display full screen
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h3/a[text()='Selenium Remote Control']")).click(); 
		//get current url 
		String cuURL2 = driver.getCurrentUrl();
		System.out.println(cuURL2); 
		driver.navigate().back();


	}

}
