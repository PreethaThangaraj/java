package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Nykaa\\excel\\WriteData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		Sheet sheet = wb.createSheet("Sheet4");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Fruits");
		
		wb.getSheet("Sheet4").getRow(0).createCell(1).setCellValue("Colour");
		wb.getSheet("Sheet4").createRow(1).createCell(0).setCellValue("Apple");
		wb.getSheet("Sheet4").getRow(1).createCell(1).setCellValue("Red");
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();

	}

}
