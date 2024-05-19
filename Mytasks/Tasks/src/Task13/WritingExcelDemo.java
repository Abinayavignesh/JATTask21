package Task13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelDemo {

	public static void main(String[] args) throws IOException {
		//Creation of new Blank workbook 
		XSSFWorkbook wb=new XSSFWorkbook();
		//Creating new Blank worksheet
		XSSFSheet sh=wb.createSheet("Sheet1");
		// Creating an empty arraylist of Object][] 
		ArrayList<Object[]> empdata=new ArrayList<>();
		
		// Writing data to Object[] 
        // using add() method 		
		empdata.add(new Object[] {"Name","Age","Email"});
		empdata.add(new Object[] {"John Doe","30","john@test.com"});
		empdata.add(new Object[] {"Jane Doe","28","jane@test.com"});
		empdata.add(new Object[] {"Bob Smith","35","jacky@example.com"});
		empdata.add(new Object[] {"Swapnil","37","swapnil@example.com"});
		
		int rownum=0;
		
		for(Object[] emp:empdata) {
			// Creating a new row in the sheet
			XSSFRow row=sh.createRow(rownum++);
			int cellnum=0;
		for(Object value:emp) {
			// This line creates a cell in the next 
            //  column of that row 
		XSSFCell cell=row.createCell(cellnum++);
		if(value instanceof String)
			cell.setCellValue((String) value);
		if(value instanceof Integer)
			cell.setCellValue((Integer) value);
		//if(value instanceof Boolean);
			//cell.setCellValue((Boolean) value);
		}
		}
		// Write the workbook in file system
		String filepath=".\\datafiles\\EmployeeData.xlsx";
		FileOutputStream fos=new FileOutputStream(filepath);
		wb.write(fos);
		// Closing file output connections 
		fos.close();
		System.out.println("Employee.xlsx Written Successfully!");

	}

}
