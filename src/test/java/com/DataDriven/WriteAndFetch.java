package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteAndFetch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Nykaa\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Nykaa\\excel\\FaceBook.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Personal");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		
	driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
    Cell cell2 = row.getCell(1);
    driver.findElement(By.name("pass")).sendKeys(cell2.getStringCellValue());
    driver.findElement(By.name("login")).click();
    Thread.sleep(2000);
    TakesScreenshot ts = (TakesScreenshot)driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File des = new File("C:\\Users\\User\\eclipse-workspace\\Nykaa\\screenshot\\img.png");
    FileUtils.copyFile(src,des);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@role='button'][1]")).click();
//    Cell cell3 = wb.getSheet("Personal").getRow(2).getCell(0);
//    driver.findElement(By.id("email")).sendKeys(cell3.getStringCellValue());
//    Cell cell4 = wb.getSheet("Personal").getRow(2).getCell(1);
//    driver.findElement(By.name("pass")).sendKeys(cell4.getStringCellValue());
//    driver.findElement(By.name("login")).click();
    wb.close();
	}

}
