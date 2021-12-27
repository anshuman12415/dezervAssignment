package com.dezerv.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.dezerv.utilities.ReadConfig;


public class Baseclass {
	ReadConfig readconf = new ReadConfig();

	public String baseURL = readconf.getApplicationURL();
	public String MobileNumber= readconf.getUsername();
	public String PersonalEmail=readconf.getEmail();
	public String Emprname=readconf.getEname();
	
	public static WebDriver d;
	public static Logger logger;

	// @Parameters("browser")
	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver",readconf.getChromePath());
		d = new ChromeDriver();

		logger = Logger.getLogger("dezerv");
		PropertyConfigurator.configure("Log4j.properties");

	}

	
	  @AfterClass public void teardown()
	  { d.quit();
	  }
	 
	
	public void captureScreen(WebDriver d, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/ScreenShots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
