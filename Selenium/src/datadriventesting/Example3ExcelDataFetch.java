package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3ExcelDataFetch {

	public static void main(String[] args) throws Throwable {
		// Give the path
		FileInputStream fis = new FileInputStream("./Data/ExcelData1.xlsx");
		// Take control to workbook
		Workbook wb = WorkbookFactory.create(fis);
		// Take control to sheet
		Sheet sheet = wb.getSheet("Sheet1");
		// Take control to row
		Row row = sheet.getRow(1);
		// Take control to cell
		Cell cell = row.getCell(1);
		// Fetch the data
		//String data = cell.getStringCellValue();
		double data = cell.getNumericCellValue();
		
		System.out.println(data);

	}

}
