package com.Sel.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		// Auto Notification Disable
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notification");

		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();

		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");

		// Total number of products
		List<WebElement> products = driver.findElements(By.xpath("//li[@class='product-base']"));
		System.out.println("Number of producst :" + products.size());

		// Minimum Price
		List<Integer> allprices = new ArrayList<Integer>();
		List<WebElement> minprice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));

		for (WebElement mprice : minprice) {
			String text = mprice.getText().replace("Rs. ", "");
			int num = Integer.parseInt(text);
			System.out.println(num);
			allprices.add(num);
		}
		Integer min = Collections.min(allprices);
		System.out.println("Minimum Price: " + min);

		// Minimum Price of Product Name
		WebElement minproname = driver.findElement(
				By.xpath("//span[text()='" + min + "']//ancestor::div[@class='product-productMetaInfo']/h3"));
		System.out.println(minproname.getText());
		
		driver.close();

	}

}
