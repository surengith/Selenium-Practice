package com.Sel.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathGoogleSearchBoxDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Testing");

		List<WebElement> suggestionlist = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		System.out.println("Total number of suggestion size:==> " + suggestionlist.size());

		for (int i = 0; i < suggestionlist.size(); i++) {
			System.out.println(suggestionlist.get(i).getText());
			if (suggestionlist.get(i).getText().contains("testing jobs in chennai")) {
				suggestionlist.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
	}
}
