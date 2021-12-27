package com.dezerv.testCases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dezerv.pageObjects.InvitePage;
import com.dezerv.utilities.XLUtils;

public class ApplyforaccessDataDrivenTC_02 extends Baseclass {

	@Test(dataProvider="accessData")
	public void accessDDTest(String MobileNumber
, String PersonalEmail
) {
		
		d.get(baseURL);
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		logger.info("url opened");

		
		InvitePage ip= new InvitePage(d);
		ip.whatsappNumber(MobileNumber);
		ip.pEmail(PersonalEmail);
		ip.clicksubmit();
		
		if(isAlertPresent()==true) {
			d.switchTo().alert().accept();
			d.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("access failed");
		}
			else {
				Assert.assertTrue(true);
				logger.warn("access for next page");
				
			}
			
		
	}
		
		public boolean isAlertPresent() {
			try {
				d.switchTo().alert();
				return true;
				
			}catch(NoAlertPresentException e){
			return false;	
			}
		}
		

	@DataProvider(name = "accessData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/dezerv/testData/LoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);// 1 0
			}

		}
		return logindata;
	}

}
