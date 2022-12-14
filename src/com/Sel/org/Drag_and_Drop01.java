package com.Sel.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source = driver.findElement(By.xpath("//p[normalize-space()='Drag to target']"));
		WebElement destination = driver.findElement(By.id("form:drop_content"));

		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(destination).release().build().perform();
	}
}
