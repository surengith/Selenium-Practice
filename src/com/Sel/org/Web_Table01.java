package com.Sel.org;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Table01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		// All Data
//		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
//
//		for(WebElement data:alldata) {
//			System.out.println(data.getText());
//		}

		// Particular data
		WebElement Particulardata = driver.findElement(By.xpath("//table/tbody/tr[8]/td[5]"));
		System.out.println("Parcticular data: " + Particulardata.getText());

		// RowWise Data

		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[8]/td"));

		for (WebElement rowdata : row) {
			System.out.println("RowWise: " + rowdata.getText());
		}

		// ColumnWise Data

		List<WebElement> Column = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

		for (WebElement columndata : Column) {
			System.out.println("ColumnWise: " + columndata.getText());
		}

		// Dynamic WebTable
		
		

		driver.close();

	}

}
