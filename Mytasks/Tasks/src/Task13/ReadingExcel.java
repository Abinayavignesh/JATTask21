package Task13;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		// Specify the location of the Excel Sheet
		File src=new File("D:\\Files\\Demo.xlsx");
		
		//Load the Excel File
		FileInputStream fis=new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//Load Worksheet
		XSSFSheet sh=wb.getSheet("Demosheet");
		
		// Print the name of the loaded sheet
		System.out.println(sh.getSheetName());
		
		//Print the Username from the ExcelSheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		//Print the P2 from ExcelSheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		
		//Print the total number of rows
		System.out.println("Total Rows :"+ sh.getPhysicalNumberOfRows());
		
		//Print the total number of columns
		System.out.println("Total Columns :"+ sh.getRow(0).getPhysicalNumberOfCells());
		
		int rows=sh.getLastRowNum()+1;
		System.out.println("Totol Rows :" +rows);
		
		int columns=sh.getRow(0).getLastCellNum();
		System.out.println("Total columns :" +columns);
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
	}

}

/* Output
Demosheet
UserName
p2
Total Rows :6
Total Columns :2
Total Rows :6
Total columns :2
UserName
Password
user 1
p1
user 2
p2
user 3
p3
user 4
p4
user 5
p5
*/