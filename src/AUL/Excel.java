package AUL;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static int getRowCount(String path,String sheet)
	{
		int rc=0;
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			rc=wb.getSheet(sheet).getLastRowNum()+1;
			
		}
		catch(Exception e)
		{
			
		}
		return rc;

	}
	
	public static String getcellvalue(String path,String sheet,int r,int c)
	{
		String v=" ";
		try
		{
			for(int i=0;i<=r;i++)
			{
				for(int j=0;j<=c;j++)
				{

					Workbook wb=WorkbookFactory.create(new FileInputStream(path));
					v=wb.getSheet(sheet).getRow(i).getCell(j).toString();
					System.out.println(v);
				}
				System.out.println();	
			}
		}
		catch(Exception e)
		{
			
		}
		return v;

}
	public static void main(String[] args) {
		int s = Excel.getRowCount("./data/Book1.xlsx","Sheet1" );
		System.out.println("Rowcount");
		System.out.println("----------------");
		System.out.println(s);
		System.out.println("******************");
		System.out.println("Cellvalue");
		System.out.println("-------------------");
		Excel.getcellvalue("./data/Book1.xlsx", "Sheet1", 2, 1);
		//System.out.println(p);
	}
}
