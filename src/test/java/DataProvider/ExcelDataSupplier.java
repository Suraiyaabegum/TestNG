package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataSupplier {
	
	public static void main(String[] args) throws IOException {
		File excelFile=new File("C:\\\\Testing Files\\\\TestData1.xlsx");
		System.out.println(excelFile.exists());
		FileInputStream fis=new  FileInputStream(excelFile);  // the Raw data is present in the fis
		//XSSFWorkbook  -- New excel(xlsx)
		//HSSFWorkbook  -- Old excel(xls)
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getLastRowNum());
		int noOFRows=sheet.getPhysicalNumberOfRows();
		int noOfColumn=sheet.getRow(0).getLastCellNum();
		System.out.println(noOFRows);
		System.out.println(noOfColumn);
		
		String[][] data = new String[noOFRows-1][noOfColumn];
		
		for(int i=0; i<noOFRows+1;i++) {
			for(int j=0; j<noOfColumn; j++) {
				DataFormatter df= new DataFormatter();
				data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
				
		}
			
		workbook.close();
		fis.close();
		
		for (String[] dataArr : data) {
		System.out.println(Arrays.toString(dataArr));
	}

}
}
