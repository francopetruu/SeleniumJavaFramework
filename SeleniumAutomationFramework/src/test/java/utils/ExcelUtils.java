package utils;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public String path;
	public FileInputStream file = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	private static XSSFSheet sheet = null;
	private XSSFCell cell = null;
	private static XSSFRow row = null;

	//class constructor
	public ExcelUtils(String path) {

		try {
			this.path = path;
			file = new FileInputStream(path);
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);
			file.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();	
		}
	}


	//returns row count in a specified sheet
	public int getRowCount(String sheetName) {

		int index = workbook.getSheetIndex(sheetName);

		if(index == -1) {
			return 0;
		} else {
			sheet = workbook.getSheetAt(index);
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows: "+ rowCount);
			return rowCount;
		}

	}

	public int getColumnCount(String sheetName) {

		int index = workbook.getSheetIndex(sheetName);

		if(index == -1) {
			return 0;
		} else {
			sheet = workbook.getSheetAt(index);
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of columns: "+ colCount);
			return colCount;
		}

	}


	//get data in type of variable String
	public String getCellDataString(String sheetName, int rowNum, int colNum) {
		String cellData = null;

		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
		return cellData;
	}

	//get data in type of variable double
	public double getCellDataNumber(int rowNum, int colNum) {

		double cellData = 0;
		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

		return cellData;
	}
}
