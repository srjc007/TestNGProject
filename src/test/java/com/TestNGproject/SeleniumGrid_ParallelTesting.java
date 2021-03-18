package com.TestNGproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumGrid_ParallelTesting {
	
	WebDriver driver;
	String baseURL;
	String nodeURL;
	JavascriptExecutor js;


	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium files\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		nodeURL = "http://localhost:4444/wd/hub";
		//FirefoxOptions options = new FirefoxOptions();
		//options.setBinary(binary)
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeURL), caps);
		
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(baseURL);
		//driver.manage().window().maximize();
		
	}

	@Test
	public void testMethod() throws Exception {
		driver.get(baseURL);
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebElement mouseHoverMain = driver.findElement(By.cssSelector("#mousehover"));
		WebElement mouseHoverSub = driver.findElement(By.xpath("//a[contains(text(),'Top')]"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseHoverMain).perform();
		action.moveToElement(mouseHoverSub).click().perform();

		Thread.sleep(1000);
		// driver.quit();
		
	}

}
