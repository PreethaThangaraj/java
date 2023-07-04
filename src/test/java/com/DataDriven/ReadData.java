package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Nykaa\\excel\\Datadriven.xlsx");
        FileInputStream fis = new FileInputStream(file);
        Workbook wb= new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet("Sheet1");
        Row row = sheet.getRow(4);
        Cell cell = row.getCell(3);
        System.out.println(sheet.getRow(4).getCell(3));
	}

}
