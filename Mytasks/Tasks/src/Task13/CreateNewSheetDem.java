package Task13;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateNewSheetDem {

	public static void main(String[] args) throws IOException {
		
		//Creation of new Blank workbook 
		XSSFWorkbook wb=new XSSFWorkbook();
		//Creating new Blank worksheet
		XSSFSheet sh=wb.createSheet("Sheet1");
		
		//creates an excel file at the specified location  
		String filepath=".\\datafiles\\EmployeeSheet.xlsx";
		// Write the workbook in file system
		FileOutputStream fos=new FileOutputStream(filepath);
		wb.write(fos);
		// Closing file output connections 
		fos.close();
		System.out.println("Sheet1 created Successfully!");
	}

}

/*
CreateEmployeeData.xlsx Written Successfully!

And a new Excel sheet will be created in the particular folder */