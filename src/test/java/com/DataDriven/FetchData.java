package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchData {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Nykaa\\excel\\FaceBook.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Personal");
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(0);
		driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
	    Cell cell2 = row.getCell(1);
	    driver.findElement(By.name("pass")).sendKeys(cell2.getStringCellValue());
	    driver.findElement(By.name("login")).click();
	    wb.close();
	}

}
