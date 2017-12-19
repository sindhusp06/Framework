package AUL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Copy_NewExcel {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		String path="./data/Book1.xlsx";
		String path1="./data/Book2.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		wb.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("Sindhu");
		wb.getSheet("Sheet1").getRow(0).createCell(1).setCellValue("Priyan");
		wb.getSheet("Sheet1").createRow(1).createCell(0).setCellValue("Perumal");
		wb.write(new FileOutputStream(path1));
		System.out.println("PASS");
		
		
	}

}
