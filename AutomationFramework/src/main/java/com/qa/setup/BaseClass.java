package com.qa.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.driverInstantiation.DriverManager;
import com.qa.driverInstantiation.DriverManagerFactory;
import com.qa.driverInstantiation.DriverType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;
	//static String browserName = null;
	 static DriverManager driverManager;


	//static String browserName = "chrome";
	static String url = "http://automationpractice.com/index.php";

	public static WebDriver init(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
			driver=driverManager.getDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
			driver=driverManager.getDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
}
}
