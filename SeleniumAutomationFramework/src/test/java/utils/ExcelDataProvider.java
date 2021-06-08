package utils;

import org.testng.annotations.DataProvider;

/* This class will help to create a two dimensional object in order to use it with the
 * @DataProvider annotation from TestNG. The excel file path and the excel Sheet Name can
 * be read from a .properties file or the testNG.xml file. Now is hardcoded.
 */

public class ExcelDataProvider {
	
	public static String path = System.getProperty("user.dir")+"/excel/data.xlsx";
	public static String excelSheetName = "Sheet1";
	
	
	@DataProvider(name= "test1data")
	public Object[][] getData() {
		
		Object data[][] = testData(path, excelSheetName);
		return data;
	}
	
	public Object[][] testData(String excelPath, String sheetName) {
		
		//Create an ExcelUtils object
		ExcelUtils excel = new ExcelUtils(excelPath);
		
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		
		//Create a two dimensional object to save data; rowCount-1 because of the header
		Object data[][] = new Object[rowCount-1][colCount];
		
		//loop starts in i=1 because row(0) is the header
		for(int i=1; i<rowCount; i++) {
			
			//loop starts in j=0 for the first column
			for(int j=0; j<colCount; j++) {
				
				String cellData = excel.getCellDataString(sheetName, i, j);
				System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		
		return data;
	}

}
