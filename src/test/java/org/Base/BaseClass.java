package org.Base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	
	public static void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void WindowMaximize() 
	{
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String Url)
	{
		driver.get(Url);
		
	}
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;

	}
	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	public static void PassText(String string, WebElement ele)
	{
		ele.sendKeys(string);
	}
	
	public static void CloseEntireBrowser()
	{
		driver.quit();
	}
	
	public static void ClickBtn(WebElement ele)
	{
		ele.click();
	}
	
	public static void ScreenShot(String ImgName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(ImgName);
		FileUtils.copyFile(image, f);
	}
	
	public static void CreateNewExcelFile(int RowNum, int cellNum, String Detail) throws IOException
	{
		File f = new File("C:\\Users\\suriya\\eclipse-workspace\\MavenProject\\Excel\\NewSheet.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newsheet = wb.createSheet("Detail");
		Row newrow = newsheet.createRow(RowNum);
		Cell newcell = newrow.createCell(cellNum);
		newcell.setCellValue(Detail);
		FileOutputStream fis = new FileOutputStream(f);
		wb.write(fis);
	}
	public static void CreateRow(int RowNum, int cellNum, String Detail) throws IOException
	{
		File f = new File("C:\\Users\\suriya\\eclipse-workspace\\MavenProject\\Excel\\NewSheet.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newsheet = wb.getSheet("Detail");
		Row newrow = newsheet.createRow(RowNum);
		Cell newcell = newrow.createCell(cellNum);
		newcell.setCellValue(Detail);
		FileOutputStream fis = new FileOutputStream(f);
		wb.write(fis);
	}
	public static void CreateCell(int RowNum, int cellNum, String Detail) throws IOException
	{
		File f = new File("C:\\Users\\suriya\\eclipse-workspace\\MavenProject\\Excel\\NewSheet.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newsheet = wb.getSheet("Detail");
		Row newrow = newsheet.getRow(RowNum);
		Cell newcell = newrow.createCell(cellNum);
		newcell.setCellValue(Detail);
		FileOutputStream fis = new FileOutputStream(f);
		wb.write(fis);
	}
	
}
