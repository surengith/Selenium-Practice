package com.Sel.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
	
		driver.findElement(By.xpath("//a[contains(text(),'Create Ne')]")).click();
		
		Robot robo = new Robot();
		Thread.sleep(3000);
		
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		
		
		
		
		
	}
}
