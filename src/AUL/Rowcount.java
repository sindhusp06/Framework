package AUL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Rowcount 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		String path="./data/Book1.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		int rc=wb.getSheet("Sheet1").getLastRowNum()+1;
		System.out.println(rc);
		System.out.println("------");
		
		
	}
	

}

	
	



