package com.Sel.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		myntra();

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--disable-notifications");
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().getCookies();

//		driver.get("https://www.google.com/");
//
//		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
//		search.sendKeys("Java");
//		Thread.sleep(1000);
//
//		// Dynamic xpath for Google suggestion list
//		List<WebElement> list = driver
//				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
//		System.out.println(list.size());
//
//		for (WebElement alldata : list) {
//			System.out.println(alldata.getText());
//			if (alldata.getText().contains("java download")) {
//				alldata.click();
//				break;
//			}
//
//		}
//
//		WebElement searchsugg = driver.findElement(By.xpath("//div[@data-sgrd='true']/child::div[3]"));
//		System.out.println(searchsugg.getText());
//		searchsugg.click();
//		
//		WebElement print = driver.findElement(By.xpath("//div/b[text()='Download and Install']"));
//		System.out.println(print.getText());
//		
//
//		driver.get("https://www.amazon.in/");
//
//		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
//		search.sendKeys("toys");
//		Thread.sleep(1000);
//
//		List<WebElement> dropdowntext = driver
//				.findElements(By.xpath("//div[contains(@class,'autocomplete-results-container')]/child::div"));
//		System.out.println(dropdowntext.size());
//		
//		for (WebElement element : dropdowntext) {
//			System.out.println(element.getText());
//			if (element.getText().contains("toys for 3 year old boy")) {
//				element.click();
//				break;
//			}
//
//		}

//		driver.get("https://www.myntra.com/men-tshirts");
//
//		// List of Product
//		List<WebElement> listofproducts = driver
//				.findElements(By.xpath("//ul[@class='results-base']/li[@class='product-base']"));
//		System.out.println("List of T.Shirt: " + listofproducts.size());
//
//		// List of Product Prices
//		List<Integer> allprices = new ArrayList<Integer>();
//		List<WebElement> max = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
//
//		for (WebElement maxprice : max) {
//			String text = maxprice.getText().replace("Rs. ", "");
//			int parseInt = Integer.parseInt(text);
//			System.out.println(parseInt);
//			allprices.add(parseInt);
//		}
//		
//		//Maximum Price
//		Integer max2 = Collections.max(allprices);
//		System.out.println("Maximum Price: " + max2);
//		
//		
//		//Maximum Price of Product Name
//		
//		WebElement maxproductname = driver.findElement(By.xpath("//span[text()='"+max2+"']//ancestor::div[@class='product-productMetaInfo']/child::h3"));
//		
//		System.out.println(maxproductname.getText());
//
//		Thread.sleep(3000);
//		driver.close();	

//*****************************************************************************************************************//
		// People also ask

//		for (WebElement alldata: list) {
//			System.out.println(alldata.getSize());
//		}

		/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 * 
		 * driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		 * 
		 * //*[@id="customers"]/tbody/tr[3] //*[@id="customers"]/tbody/tr[6]
		 * 
		 * List<WebElement> thirdrows =
		 * driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")); for
		 * (WebElement rrows : thirdrows ) { System.out.println(rrows.getText()); }
		 */

	}

	public static void myntra() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/men-jeans");
		
		
		List<WebElement> numofproducts = driver.findElements(By.xpath("//ul/li[@class='product-base']"));
		System.out.println("Number of product: "+numofproducts.size());
		
		List<Integer> minproduct = new ArrayList<Integer>();
		List<WebElement> productprice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		
		for(WebElement allprice:productprice) {
			String text = allprice.getText().replace("Rs. ", "");
			int parseInt = Integer.parseInt(text);
			System.out.println(parseInt);
			minproduct.add(parseInt);
		}
		
		Integer min = Collections.min(minproduct);
		System.out.println("Minimum product price: "+min);
		
		WebElement minproductname = driver.findElement(By.xpath("//span[text()='"+min+"']/ancestor::div[@class='product-productMetaInfo']/h3"));
		System.out.println("Minimum Product Name: "+minproductname.getText());
	
		driver.close();
	}
	

}
