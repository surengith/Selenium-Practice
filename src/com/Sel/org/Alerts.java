package com.Sel.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Alert window with ok button

		driver.findElement(By.xpath("//button[@onClick='jsAlert()']")).click();

		driver.switchTo().alert().accept();

		// Alert window with ok & Cancel button

		driver.findElement(By.xpath("//button[@onClick='jsConfirm()']")).click();

		driver.switchTo().alert().accept(); // We need to hide accept method to execute the dismiss method
		driver.switchTo().alert().dismiss();

		// Alert window with input box and capture the text from alert

		driver.findElement(By.xpath("//button[@onClick='jsPrompt()']")).click();
		Alert alertwindow = driver.switchTo().alert();
		System.out.println("The message displayed on alert: " + alertwindow.getText());
		alertwindow.sendKeys("Welcome");
		alertwindow.accept();

	}

}
