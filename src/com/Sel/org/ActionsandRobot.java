package com.Sel.org;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsandRobot {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		// Auto Notification Disable
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notification");

		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();

		// Wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		// Action Syntax
		Actions act = new Actions(driver);

		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		act.click(gmail).perform();

		WebElement createac = driver
				.findElement(By.xpath("//div[@class='header__aside']//descendant::span[@class='laptop-desktop-only']"));
		act.click(createac).perform();

		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\gmail.png");
		FileUtils.copyFile(source, destination);

		driver.close();
		
	}

}
