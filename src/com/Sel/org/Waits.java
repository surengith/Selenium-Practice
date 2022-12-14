package com.Sel.org;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait mywait = new WebDriverWait(driver, 20);
		mywait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return driver.findElement(locator);

	}

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // ImplicitlyWait
		// WebDriverWait mywait = new WebDriverWait(driver, 20); // ExplicitlyWait

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		// driver.findElement(By.xpath("//h3[text()='Selenium']")).click();

		By elementlocator = By.xpath("//h3[text()='Selenium']");
		waitForElementPresent(driver, elementlocator, 20).click();

		Thread.sleep(2000);
		driver.close();

	}

}
