package com.capgemini.myntra.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
	
		
		public static WebDriver openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver/geckodriver.exe");
			
		} else if (browserName.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver/chromedriver.exe");
		}
	
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();	
	

	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/login/password?referer=https%3A%2F%2Fwww.myntra.com%2F&mobile=&show=false");
	return driver;
}	

		public static String getExcelData(String path, String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException{
		FileInputStream  fis =  new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
        return data;
}
		
		public static void closeBrowser() {
			driver.close();
		}
}
