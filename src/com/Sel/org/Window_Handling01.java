package com.Sel.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling01 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/men-tshirts");

		// Mobile Page
		WebElement tshirt1 = driver
				.findElement(By.xpath("//div[@class='product-productMetaInfo']/h4[text()='Pure Cotton T-shirt']"));
		tshirt1.click();
		Thread.sleep(2000);

		String parentid = driver.getWindowHandle();
		
		driver.switchTo().window(parentid);

		WebElement tshirt2 = driver
				.findElement(By.xpath("//img[contains(@title,'H&M Men Green Solid Regular Fit Round-neck T-shirt')]"));
		tshirt2.click();

		driver.switchTo().window(parentid);

		WebElement tshirt3 = driver
				.findElement(By.xpath("//div[@class='product-productMetaInfo']/h4[text()='Pure Cotton T-shirt']"));
		tshirt3.click();

		driver.switchTo().window(parentid);

		WebElement tshirt4 = driver
				.findElement(By.xpath("//div[@class='product-productMetaInfo']/h4[text()='Pure Cotton T-shirt']"));
		tshirt4.click();

		driver.switchTo().window(parentid);

		String actualtitle = "Buy H&M Men Green Solid Regular Fit Round Neck T Shirt - Tshirts for Men from H&M at Rs. 399. Style ID: 16590968";
		Set<String> allwindowsid = driver.getWindowHandles();

		for (String allid1 : allwindowsid) {
			String title = driver.switchTo().window(allid1).getTitle();
			System.out.println(title);
			if (driver.switchTo().window(allid1).getTitle().contains(actualtitle)) {
				break;
			}
		}
	}
}