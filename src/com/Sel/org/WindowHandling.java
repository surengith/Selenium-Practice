package com.Sel.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

		driver.get("https://nxtgenaiacademy.com/multiplewindows/");

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Thread.sleep(3000);

		driver.findElement(By.id("button1")).click();
	
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		
		String parentid = it.next();
		String childid = it.next();
		
		System.out.println("Parent Window ID: "+parentid);
		System.out.println("Child Window ID: "+childid);
		
		driver.quit();

	}

}
