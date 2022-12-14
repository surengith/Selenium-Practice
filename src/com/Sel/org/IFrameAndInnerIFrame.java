package com.Sel.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IFrameAndInnerIFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-notification");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// iFrame
		// 1st Frame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//ul[@title='Packages']/li/a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();

		// 2nd Frame

		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//div[@class='indexContainer']//ul//li//span[text()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		

		// 3rd Frame

		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//descendant::ul/li/a[text()='Help']")).click();

		// 4th Inner iFrame - Nested iFrame

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

		WebElement outeriframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outeriframe);

		WebElement inneriframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inneriframe);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");

	}

}
