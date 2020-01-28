package com.cucumber.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {
	public static WebDriver driver;
	private static final Logger log = Logger.getLogger(TestBase.class.getName());
	Properties or = new Properties();

	public TestBase() {
		PageFactory.initElements(driver, this);
	}

	public void loadData() {
		try {
			File file = new File(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\cucumber\\config\\config.properties");
			FileInputStream fis = new FileInputStream(file);
			or.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void selectBrowser(String browser) {
		PropertyConfigurator.configure("log4j.properties");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			log.info(browser + " browser is initialized");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.info(browser + " browser is initialized");
		}

	}

	public void enterURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		log.info("Launched URL " + url);
	}

	public void clickOperation(WebElement element) {
		try {
			element.click();
			log.info("Click Operation is performed on webElement :" + element);
		} catch (Exception e) {
			System.out.println("Message :" + e.getMessage());
			log.info("Click Operation is not performed on webElement :" + element);
			e.printStackTrace();
		}
	}

	public void sendKeysOperation(WebElement element, String text) {
		try {
			element.sendKeys(text);
			log.info("Send Keys Operation is performed on webElement :" + element);
		} catch (Exception e) {
			System.out.println("Message :" + e.getMessage());
			log.info("Send Keys Operation is not performed on webElement :" + element);
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		driver.quit();
		log.info("Browser is closed");
	}
}