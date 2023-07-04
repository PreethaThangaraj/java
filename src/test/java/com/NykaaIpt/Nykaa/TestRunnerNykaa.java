package com.NykaaIpt.Nykaa;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestRunnerNykaa {
	static WebDriver driver;
	static Actions a;
	public static void getUrl() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.nykaa.com/");
	}
	
    public static void loginId() throws InterruptedException {
    	//CLICK SIGN IN BUTTON
    WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign in']"));
    signIn.click();
    WebElement mobile = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
    mobile.click();
   // driver.findElement(By.xpath("(//button[@kind='secondary'])[1]")).click();
    Thread.sleep(10000);
    //enter login id using mobile number
    WebElement id1 = driver.findElement(By.xpath("//input[@name='emailMobile']"));
    WebDriverWait wait = new WebDriverWait (driver,30);
    wait.until(ExpectedConditions.visibilityOf(id1));
    id1.sendKeys("6382199843");
    //click proceed button
    WebElement submit = driver.findElement(By.id("submitVerification"));
    submit.click();
    //enter otp
    Thread.sleep(30000);
    //click verification
    WebElement verify = driver.findElement(By.xpath("//button[text()='verify']"));
    verify.click();
    
    }
    
	public static void searchProduct() throws InterruptedException {
    a=new Actions(driver);
    Thread.sleep(10000);
    //CLICK THE TYPES OF PRODUCT WE WANT
    WebElement babyproduct = driver.findElement(By.xpath("//a[text()='mom & baby']"));
    //WAIT IS USED HERE
    WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOf(babyproduct));
    //MOVE THE ELEMENT FROM ONE TO ANOTHER WITHIN SAME BLOCK
    a.moveToElement(babyproduct).build().perform();
    WebElement babypowder = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
    a.click(babypowder).build().perform();
    Set<String> windowHandles = driver.getWindowHandles();
    for (String string : windowHandles) {
		String title = driver.switchTo().window(string).getTitle();
		System.out.println(title);
	} 
    }
	public static void selectProduct() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		//CHOOSE THE BRAND OF BABY POWDER ITS OPEN IN NEW WINDOW SO WINDOWHANDLING IS USED HERE
		driver.findElement(By.xpath("//img[@alt='Himalaya Baby Powder']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		for (String string1 : windowHandles1) {
			String title1 = driver.switchTo().window(string1).getTitle();
			System.out.println(title1);
		}
	}
	public static void productEntry() {
		//CHANGE THE QUANTITY SIZE USING DRAGDOWN SELECTBYINDEX
		WebElement quantity = driver.findElement(By.xpath("//select[@title='SIZE']"));
	    Select s = new Select(quantity);
	    s.selectByIndex(1);
	    //CLICK ADD TO CARD BUTTON
	    driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
	}
	public static void openAddToCard() throws InterruptedException {
		//OPEN THE ADDTOCARD FOR VERFICATION
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		Thread.sleep(10000);
		WebElement frame1 = driver.findElement(By.cssSelector("iframe[src='/mobileCartIframe?ptype=customIframeCart']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://adn-static1.nykaa.com/media/wysiwyg/Payments/down.svg']")).click();
		driver.findElement(By.xpath("//p[text()='Select Quantity']")).click();
		Thread.sleep(3000);
		WebElement selectThree = driver.findElement(By.xpath("(//div[@class='css-bfwsku'])[3]"));
		WebDriverWait wait= (new WebDriverWait (driver,30));
		wait.until(ExpectedConditions.elementToBeClickable(selectThree));
		selectThree.click();
		//click proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	}
	public static void addressDetail() throws InterruptedException {
		Thread.sleep(3000);
		WebElement address = driver.findElement(By.xpath("//button[@class='css-n7wnfc e8tshxd0']"));
		address.click();
	}
	public static void cardDetail() throws InterruptedException {
		Thread.sleep(3000);
		WebElement cardNum = driver.findElement(By.xpath("//input[@label='Card Number']"));
		cardNum.click();
		cardNum.sendKeys("4000056655665556");
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("//input[@label='Expiry (MM/YY)']"));
		date.click();
		date.sendKeys("08/26");
		Thread.sleep(2000);
		WebElement cvvNum = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		cvvNum.click();
		cvvNum.sendKeys("257");
	//	Thread.sleep(3000);
		
		WebElement pay = driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
	//	WebDriverWait wait= (new WebDriverWait (driver,30));
	//	wait.until(ExpectedConditions.elementToBeClickable(pay));
		pay.click();
		WebElement confirmation = driver.findElement(By.xpath("//button[text()='Pay without securing card']"));
		confirmation.click();
		Thread.sleep(10000);
	}
	public static void screenShot() throws IOException, InterruptedException {
	//	WebElement backArrow = driver.findElement(By.xpath("//i[text()='arrow_backward']"));
	//	backArrow.click();
		
	//	WebElement idConfirm = driver.findElement(By.id("confirm-secondary"));
	//	idConfirm.click();*/
	//	Thread.sleep(10000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\PaymentStatus.png");
		FileHandler.copy(src, des);
		
		Thread.sleep(2000);
		
		WebElement close = driver.findElement(By.xpath("//button[text()='Close']"));
		WebDriverWait wait= (new WebDriverWait (driver,30));
		wait.until(ExpectedConditions.elementToBeClickable(close));
		close.click();
		
	}
	public static void clearData() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)"); 
		Thread.sleep(2000);
		WebElement clickBag = driver.findElement(By.xpath("(//div[@class='css-1qlrij7 e87w9870'])[9]"));
		clickBag.click();
		Thread.sleep(5000);
		WebElement clickEdit = driver.findElement(By.xpath("//p[text()='Edit']"));
		clickEdit.click();
		Thread.sleep(5000);
//		WebElement enterFrame = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
//		driver.switchTo().frame(enterFrame);

		WebElement clickElement = driver.findElement(By.xpath("(//span[@class='css-175whwo ehes2bo0'])[2]"));
		WebDriverWait wait= (new WebDriverWait (driver,30));
		wait.until(ExpectedConditions.elementToBeClickable(clickElement)).click();
		WebElement clickRemove = driver.findElement(By.xpath("//button[text()='Remove']"));
		WebDriverWait wait1= (new WebDriverWait (driver,30));
		wait1.until(ExpectedConditions.elementToBeClickable(clickRemove));
		clickRemove.click();
		System.out.println("The End");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		getUrl();
		loginId();
		searchProduct();
		selectProduct();
		productEntry();
		openAddToCard();
		addressDetail();
		cardDetail();
		screenShot();
		clearData();
	}


}
