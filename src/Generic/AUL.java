package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AUL {
	
	//Loading the file and getting the value
	public static String getproperty(String path,String Key) throws FileNotFoundException, IOException
	
	{
		String v=" ";
		try
		{
	Properties p=new Properties();
	p.load(new FileInputStream(path));
	 v=p.getProperty(Key);
	}
	catch(Exception e)
	{
		
	}
	return v;

}
	/*public static void main(String[] args) throws FileNotFoundException, IOException {
		String s = AUL.getproperty("./Settings.properties", "URL");
		System.out.println(s);*/
	
	//Screenshot of Photo
	public static void getPhoto(WebDriver driver,String path,String testName)
	{
		String datetime=new Date().toString().replaceAll(":", "_");
		TakesScreenshot t=(TakesScreenshot) driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		String destFile=path+testName+datetime+".png";
		System.out.println("Photo is :"+destFile);
		try
		{
			FileUtils.copyFile(srcFile, new File(destFile));
		}
		catch(Exception e)
		{
			
		}
	}
}
