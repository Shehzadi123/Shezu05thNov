package ExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	public static void main(String []args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Smash-PC\\Music\\velocity\\exceldataForSelenium.xlsx");
		 //String a = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(a);
		//int b = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		//System.out.println(b);
		
		//short c = WorkbookFactory.create(file).getSheet("Sheet1").getRow(7).getLastCellNum();
		//System.out.println(c);
		
		//double d = WorkbookFactory.create(file).getSheet("Sheet1").getRow(20).getCell(6).getNumericCellValue();
		//System.out.println(d);
		
		//Sheet e = WorkbookFactory.create(file).getSheet("Sheet1");
				//int f = e.getLastRowNum();
		//for(int i=0;i<=f;i++) {
			//String g = e.getRow(i).getCell(10).getStringCellValue();
			//System.out.println(g);
		//}
		
		Sheet h = WorkbookFactory.create(file).getSheet("Sheet1");
		short i = h.getRow(14).getLastCellNum();
		for(int j=0;j<=i;j++) {
			String k = h.getRow(14).getCell(j).getStringCellValue();
			System.out.print(k +" ");
		}
	}

}
