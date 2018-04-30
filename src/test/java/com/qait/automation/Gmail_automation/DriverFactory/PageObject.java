package com.qait.automation.Gmail_automation.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageObject {

	protected static WebDriver driver;
	protected static final String url = "https://myaccount.google.com/intro";
	
	protected static void initDriver(){
		System.setProperty("webdriver.chrome.driver","src//test//resources//drivers//chromedriver_2.37.exe");
		if(driver==null){
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		}
	}
	
	protected void logMessage(String message) {
		System.out.println(message);
	}
	
	protected static WebElement elementByXpath(String xpath){
		return driver.findElement(By.xpath(xpath));
	}
	
	protected static void clickByXpath(String xpath){
		elementByXpath(xpath).click();
	}

	protected static void sendKeysByXpath(String xpath, String content){
		elementByXpath(xpath).sendKeys(content);
	}
	
	protected static String getTextByXpath(String xpath){
		return elementByXpath(xpath).getText();
	}
	
	protected static void hoverAndClick(WebElement elementToHover, WebElement elementToClick){
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
	}

}
