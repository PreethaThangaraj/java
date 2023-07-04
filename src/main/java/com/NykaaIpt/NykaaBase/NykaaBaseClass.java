package com.NykaaIpt.NykaaBase;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class NykaaBaseClass {
	public static WebDriver driver;
	static Actions a;
	static JavascriptExecutor  js;
public static void getDriver(String browser) {
	if(browser.equalsIgnoreCase("Chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	if(browser.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
	if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
}
	public static void browserLaunch(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}
	public static void elementToBeClick(WebElement element) {
		element.click();
	}
	public static void inputToElement(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void screenShot(String name) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\User\\eclipse-workspace\\Nykaa\\screenshot\\"+name+".png");
		FileHandler.copy(src, des);
	}
	public static void dragdrop(WebElement element,String option,String value) {
		Select s = new Select(element);
		if(option.equalsIgnoreCase("value")) {
		s.selectByValue(value);
		}else if(option.equalsIgnoreCase("text")) {
		s.selectByVisibleText(value);
		}else if(option.equals("index")) {
			int index = Integer.parseInt(value);
		s.selectByIndex(index);
		}
	}
	public static void frame(String option,String value) {
		if(option.equalsIgnoreCase("index")) {
			int indexValue = Integer.parseInt(value);
		driver.switchTo().frame(indexValue);
		}else if(option.equalsIgnoreCase("idORName")) {
		driver.switchTo().frame(value);
		}
	}
	public static void frameUsingElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void rightClickMouse(WebElement element) {
		a= new Actions(driver);
		a.contextClick(element).build().perform();
	}
	public static void mouseHover(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	public static void dragDrop(WebElement src,WebElement dest) {
		a= new Actions(driver);
		a.dragAndDrop(src, dest).build().perform();
	}
	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	}
	public static void explicitWait(WebElement element,int sec,String condition) {
		WebDriverWait wait = new WebDriverWait(driver,sec);
		if(condition.equalsIgnoreCase("visibility")) {
		wait.until(ExpectedConditions.visibilityOf(element));
		}else if(condition.equalsIgnoreCase("clickable")) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	}
	public static void alertMethods(WebElement element,String option) {
		element.click();
		if(option.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();
		}else if(option.equalsIgnoreCase("dismiss")) {
	    driver.switchTo().alert().dismiss();
		}
	}
	public static void sendkeysAlert(WebElement element,String text) {
		element.click();
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}
	public static void javascriptScroll(String xValue,String yValue) {
		js = (JavascriptExecutor)driver;
		js.executeScript("Window.scrollBy("+xValue+","+yValue+")");
	}
	public static void javascriptClickValue(String id,String value) {
		js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById("+id+").value("+value+");");
	
	}
	public static void javascriptClickElement(String id,String element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById("+id+").click("+element+");");
	}
	public static void clickUsingJSE(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	public static void scrollIntoViewJSE(WebElement element) {
	    js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	public static void switchWindow(int index) {
		Set<String> all_tab_id = driver.getWindowHandles();
		List<String> tab_id_list = new LinkedList<String>(all_tab_id);
		
		driver.switchTo().window(tab_id_list.get(index));
		
	}
}
