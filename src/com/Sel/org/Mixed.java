package com.Sel.org;

import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Mixed {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surendhar\\eclipse-workspace\\Selenium Practice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

//		driver.get("https://www.myntra.com/");
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("Myntra URL " + currentUrl);
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);

//		driver.navigate().to("https://www.amazon.in/");
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles);

//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//
//		String title = driver.getTitle();
//		System.out.println("Amazon " + title);
//
//		String currentUrl2 = driver.getCurrentUrl();
//		System.out.println("Amazon " + currentUrl2);
//
//		driver.navigate().back();

//		driver.get("https://www.amazon.in/");

//		WebElement searchbox = driver
//				.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
//		searchbox.sendKeys("Mens");

//		driver.navigate().forward();

//		WebElement searchbox1 = driver.findElement(By.xpath("//input[@name = 'field-keywords']"));
//		searchbox1.clear();
//		searchbox1.sendKeys("Mobile Phones");
//		
//		Dimension size = searchbox1.getSize();
//		System.out.println(size);
//		
//		String tagName = searchbox1.getTagName();
//		System.out.println(tagName);
//	
//		boolean displayed = searchbox1.isDisplayed();
//		System.out.println("Displayed: " + displayed);
//
//		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
//		click.click();

//		driver.navigate().to("https://demo.nopcommerce.com/");

		// findElements() -- Return Single Web Element

		// 1
//		WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//		searchbox.sendKeys("xyz");

		// 2
//		WebElement footer = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
//		System.out.println(footer.getText());

		// 3 NoSuchException Example
		// WebElement seatchbutton =
		// driver.findElement(By.xpath("//button[normalize-space()='login']"));

		// findElements() -- Returns Multiple Web Elements

		// 1
//		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
//		System.out.println("Number of elements captured: " + links.size());
//
//		for (WebElement text : links) {
//			System.out.println(text.getText());
//		}

		// 2
//		List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println(logo.size());

		// 3 Exception will not throws in WebElements it will throws number 0 in console
//		List<WebElement> title = driver.findElements(By.xpath("//img[contains(title,'Electronic')]"));
//		System.out.println(title.size());

//		driver.navigate().to("https://admin-demo.nopcommerce.com/login");
//
//		// gettextVsgetAttributeVale
//		// clear and sendkeys
//		WebElement emailinputbox = driver.findElement(By.id("Email"));
//		emailinputbox.clear();
//		emailinputbox.sendKeys("adm123@gmail.com");
//
//		WebElement passwordinputbox = driver.findElement(By.id("Password"));
//		passwordinputbox.clear();
//		passwordinputbox.sendKeys("123456");
//
//		// capturing text form inputbox
//
//		System.out.println("Result from getAttribute menthod: " + emailinputbox.getAttribute("value"));
//
//		System.out.println("Result from getAttribute menthod: " + emailinputbox.getText());

//		driver.get("https://www.opencart.com/index.php?route=account/register");
//
//		WebElement dropDown = driver.findElement(By.xpath("//select[@id='input-country']"));
//		Select dp = new Select(dropDown);
//
//		dp.selectByVisibleText("Australia");
//		dp.selectByValue("21");
//		dp.selectByIndex(107);
//
//		List<WebElement> allSelectedOptions = dp.getAllSelectedOptions();
//		for (WebElement opt : allSelectedOptions) {
//			String text = opt.getText();
//			System.out.println(text);
//		}

//		List<WebElement> alloptions = dp.getOptions();
//		for (WebElement option : alloptions)
//		{
//			if (option.getText().equals("Mexico"))
//			{
//				option.click(); break;
//			}
//		}

//		driver.get("https://www.hdfcbank.com/");
//
//		// Product Type
//
//		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
//
//		List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
//		System.out.println("Number of options :" + productTypes.size());
//		
//		for (WebElement ptype : productTypes) {
//			if (ptype.getText().equals("Health Insurance")) {
//				ptype.click();
//				break;
//			}
//		}
//
//		// Select the Product
//
//		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
//
//		List<WebElement> selectProducts = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
//		System.out.println("Number of Products :" + selectProducts.size());
//
//		for (WebElement sltPro : selectProducts) {
//			if (sltPro.getText().equals("Super Top-up Insurance")) {
//				sltPro.click();
//				break;
//			}
//		}

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class='_6ltg']//a[@role='button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Surendhar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9443352021");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Suren");
		WebElement male = driver
				.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Male']]"));
		male.isSelected();

		System.out.println("Is Selected before: " + male.isSelected());

		if (!male.isSelected()) {
			male.click();
		}

		System.out.println("Is Selected after: " + male.isSelected());

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select dayreg = new Select(day);
		Select monthreg = new Select(month);
		Select yearreg = new Select(year);

		List<WebElement> options = dayreg.getOptions();
		List<WebElement> options1 = monthreg.getOptions();
		List<WebElement> options2 = yearreg.getOptions();

		for (WebElement opt : options) {
			if (opt.getText().equals("5")) {
				opt.click();
				break;
			}
		}

		for (WebElement opt : options1) {
			if (opt.getText().equals("Jun")) {
				opt.click();
				break;
			}
		}

		for (WebElement opt : options2) {
			if (opt.getText().equals("2003")) {
				opt.click();
				break;
			}
		}

		selectRadioButton(driver, "Male");
		selectRadioButton(driver, "Female");
		selectRadioButton(driver, "Custom");
	
		
		Thread.sleep(3000);
		driver.close();

	}

	public static void selectRadioButton(WebDriver driver, String Value) {

		WebElement male = driver
				.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='"+Value+"']]"));
		male.isSelected();

		System.out.println("Is Selected before: " + male.isSelected());

		if (!male.isSelected()) {
			male.click();
		}

		System.out.println("Is Selected after: " + male.isSelected());

	}

}
