package com.test.utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties pro;
	
	
	public TestBase() {
		
		try {
			FileInputStream fls= new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\dallas\\config\\config.properties");
			
			pro = new Properties();
			pro.load(fls);
		} catch (FileNotFoundException e) {
			System.out.println("Please chewck your code");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Please chewck your code");
			e.printStackTrace();
		}
	}
	public void init() {
		
		String BrowserName = pro.getProperty("Browser");	
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Webdriver2\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			
			
			
		}
		else 
		System.out.println("Browser not found");
			
		}
	
	public static void getURL(String URL) {
		driver.get(pro.getProperty(""));
		
		
	}
			
	}
	

