package ExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompleteData {
	public static void main(String []args) throws EncryptedDocumentException, IOException  {
		FileInputStream file = new FileInputStream("C:\\Users\\Smash-PC\\Music\\velocity\\exceldataForSelenium.xlsx");
		 Sheet a = WorkbookFactory.create(file).getSheet("Sheet1");
		  for(int i=0;i<=a.getLastRowNum();i++) {
			 for(int j=0;j<=a.getRow(i).getLastCellNum()-1;j++) {
				 String c = a.getRow(i).getCell(j).getStringCellValue();
			 
				 System.out.print(" "+c);
			 }
			 System.out.println();
			 
		  }
		
		
	}

}
