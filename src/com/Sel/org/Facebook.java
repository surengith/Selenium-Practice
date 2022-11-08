package com.Sel.org;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		// How to disable browser notification
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");

		// Driver Method
		WebDriver driver = new ChromeDriver(op);

		// Browser Handling
		driver.manage().window().maximize();

		// Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Surendhar");
		driver.findElement(By.name("lastname")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("9443352021");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("abc@123$");

		// Drop Down using Select Class
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByVisibleText("30");

		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Sep");

		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1993");

		WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
		boolean selected = male.isSelected();

		System.out.println(selected);
		male.click();

		boolean selected2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println(selected2);

		// Screenshot

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\fb.png");
		FileUtils.copyFile(source, destination);

		Thread.sleep(2000);
		driver.close();
	}

}
