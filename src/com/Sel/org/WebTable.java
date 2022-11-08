package com.Sel.org;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		//*[@id="customers"]/tbody/tr[3]
		//*[@id="customers"]/tbody/tr[6]
		
		 	List<WebElement> thirdrows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		 	for (WebElement rrows : thirdrows ) {
		 		System.out.println(rrows.getText());
		 	}

		 	driver.close();
	}

}
