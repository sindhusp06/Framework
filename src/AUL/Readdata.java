package AUL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		String path="./data/Book1.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				String s = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
				System.out.println(s);
			}
			System.out.println();
		}

	}
}
