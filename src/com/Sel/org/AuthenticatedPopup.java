package com.Sel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenticatedPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-notification");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Syntax
		// https://admin:admin@the-internet.herokuapp.com/basic_auth
		// https://user:password@URL
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
