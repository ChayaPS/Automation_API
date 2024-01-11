package LoginTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.driverInstantiation.DriverManager;
import com.qa.driverInstantiation.DriverManagerFactory;
import com.qa.driverInstantiation.DriverType;
import com.qa.setup.BaseClass;

public class ValidCredentialsLoginTest {

	DriverManager driverManager;
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
	driver=BaseClass.init("CHROME");
	}


	@Test
	public void verifyBStackDemoAddToCart() {
	driver.get("https://bstackdemo.com/");
	List<WebElement> addToCartBtns = driver.findElements(By.cssSelector("div.shelf-item__buy-btn"));
	addToCartBtns.get(0).click();
	WebElement chkoutbtn = driver.findElement(By.cssSelector("div.buy-btn"));
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	Assert.assertTrue(chkoutbtn.isDisplayed());
	}

	@Test
	public void verifyBStackDemoTitle() {
	driver.get("https://bstackdemo.com/");
	Assert.assertEquals(driver.getTitle(), "StackDemo");
	}

	@Test
	public void verifyBStackDemoLogo() {
	driver.get("https://bstackdemo.com/");
	WebElement logo = driver.findElement(By.cssSelector(" a.Navbar_logo__26S5Y"));
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Assert.assertTrue(logo.isDisplayed());
	}

	@AfterTest
	public void afterMethod() {
	driver.quit();
	}
}
