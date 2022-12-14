package com.Sel.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/SearchHotel.php");

		driver.findElement(By.name("username")).sendKeys("surencrazy");
		driver.findElement(By.name("password")).sendKeys("Suren@123$");
		driver.findElement(By.name("login")).click();

		WebElement location = driver.findElement(By.id("location"));
		selectMultipleDropDown(location, "New York");
		Thread.sleep(1000);
		WebElement hotel = driver.findElement(By.id("hotels"));
		selectMultipleDropDown(hotel, "Hotel Cornice");
		Thread.sleep(1000);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		selectMultipleDropDown(roomtype, "Deluxe");
		Thread.sleep(1000);
		WebElement noofroom = driver.findElement(By.id("room_nos"));
		selectMultipleDropDown(noofroom, "7 - Seven");
		Thread.sleep(1000);
		driver.close();

	}

	public static void selectMultipleDropDown(WebElement element, String value) {

		Select multidropdown = new Select(element);
		List<WebElement> options = multidropdown.getOptions();

		for (WebElement option : options) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}

}
