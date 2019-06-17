package com.yugandhar.synechron.pratice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Launch 'Gmail' WebPage
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		System.out.println(driver.getTitle());

	}

}
