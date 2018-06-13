package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPOI {

	public static void main(String[] args) throws IOException {
		// Script to read data from Excel by using Apache POI api's
		
		FileInputStream fis=new FileInputStream("D:\\TestData\\TestDataOne.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		int rowMax=sh.getLastRowNum();
		int colMax=sh.getRow(0).getLastCellNum();
		System.out.println("No of Rows is : "+rowMax);
		System.out.println("No of Colums is : "+colMax);
		
		String cellData;
		
		for(int i=0;i<rowMax;i++){
			for(int j=0;j<colMax;j++){
				cellData=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(cellData);
				System.out.print(" ");
			}
			System.out.println("");
			
			
				
		}
		

	}

}
