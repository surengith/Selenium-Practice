package com.Sel.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrame_01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

//		driver.switchTo().frame("singleframe");
//
//		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
//		text.click();
//		text.sendKeys("Welcome");
//		driver.switchTo().defaultContent();
//
//		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
//
//		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//		driver.switchTo().frame(outerframe);
//		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//		driver.switchTo().frame(innerframe);
//		
//		WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
//		text1.click();
//		text1.sendKeys("Hello");
//		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.id("frm3"));
		driver.switchTo().frame(frame3);

		WebElement frame1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frame1);

		WebElement selenium = driver.findElement(By.id("selectnav1"));
		Select s = new Select(selenium);
		s.selectByVisibleText("-- Automation Testing");
		Thread.sleep(1000);

		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='hub-home']")).click();

//		WebElement frame = driver.findElement(By.id("selectnav1"));
//		Select sct = new Select(frame);
//		sct.selectByVisibleText("-- Core Java");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[@class='hub-home']")).click();
//		Thread.sleep(1000);
//		driver.switchTo().defaultContent();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@class='facebook']")).click();

	}
}
