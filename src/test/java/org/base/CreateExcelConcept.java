package org.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelConcept {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\PracticeExcel\\Excel\\Ganesh1.xlsx");

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Ganes");
		Row row = sheet.createRow(2);
		Cell cell = row.createCell(3);
		cell.setCellValue("API");
		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);
		workbook.close();
		output.close();
		
		
	}
}
