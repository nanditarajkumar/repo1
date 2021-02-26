import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public void loadurl(WebDriver driver ,String url) {
		driver.get(url);
	}
	public void maximize(WebDriver element) {
		driver.manage().window().maximize();

	}
	public void click(WebElement element) {
		element.click();
   }
	public String getattribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;
		}
	public void type(WebElement element,String name) {
		element.sendKeys(name);
	}
	public void dropdownvisibletext(WebElement element,String name) {
    Select select=new Select(element);
    select.selectByVisibleText(name);
    }
	public void dropdownvalue(WebElement element,String name) {
	    Select select=new Select(element);
	    select.selectByValue(name);
	    }
	public void dropdownindex(WebElement element,int no) {
	    Select select=new Select(element);
	    select.selectByIndex(no);;
	    }
	public void excelwrite(String sheetname,String fileloc,int rowNo,int cellno,String data) throws IOException {
		File file=new File(fileloc);
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet(sheetname);
		Row r = s.createRow(rowNo);
		Cell c = r.createCell(cellno);
		OutputStream stream=new FileOutputStream(file);
		w.write(stream);
		}
	public void excelupdate(String sheetname,String fileloc,int rowNo,int cellno,String data) throws IOException {
		File file=new File(fileloc);
		FileInputStream stream1 =new FileInputStream(fileloc);
		Workbook w=new XSSFWorkbook();
		Sheet s =w.getSheet(sheetname);
		Row r = s.createRow(rowNo);
		Cell c = r.createCell(cellno);
		OutputStream stream=new FileOutputStream(file);
		w.write(stream);
		}

}
