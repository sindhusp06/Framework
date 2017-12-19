package AUL;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {
	public static int getCellCount(String path,String sheet)
	{
		int cc=0;
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			cc=wb.getSheet(sheet).getRow(0).getLastCellNum();
			System.out.println(cc);		
		}
		catch(Exception e)
		{
			
		}
		return cc;
	}

	public static String WriteCellvalue(String path,String sheet,int r,int c)
	{
		String s="";
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			wb.getSheet(sheet).getRow(0).getCell(0).setCellValue("SPS");
			wb.getSheet(sheet).getRow(0).createCell(1).setCellValue("Per");	
			wb.getSheet(sheet).createRow(1).createCell(0).setCellValue("233");
			wb.write(new FileOutputStream(path));
			System.out.println("Excel Updated");
				
			
		}
				catch(Exception e)
				{
					
				}
		return s;
	}
	
	public static void main(String[] args) {
		Excel2.getCellCount("./data/Book2.xlsx", "Sheet1");
		Excel2.WriteCellvalue("./data/Book2.xlsx", "Sheet1", 2, 1);
		
	}
}
