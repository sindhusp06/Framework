package AUL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Compare_Excel {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		String path="./data/Book1.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				
				String s1=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
				//System.out.println(s1);
				
				String s2=wb.getSheet("Sheet2").getRow(i).getCell(j).toString();
				
				System.out.println(s1 +"   " +s2);
			}
			System.out.println();
		}
		
	}

}
