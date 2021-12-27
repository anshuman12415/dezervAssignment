package com.dezerv.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dezerv.pageObjects.InvitePage;

public class ApplyforaccessTC_01 extends Baseclass {

	@Test
	public void Applyforaccess() throws IOException {
		d.get(baseURL);
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		logger.info("url opened");

		InvitePage ip = new InvitePage(d);
		ip.whatsappNumber(MobileNumber);
		logger.info("Entered number");
		ip.pEmail(PersonalEmail);
		logger.info("Entered Email id");
		ip.EmployerName(Emprname);
		logger.info("Entered EmployerName");
		ip.clicksubmit();
		/*
		 * ip.selectAg(); ip.neinvest(); ip.dropamount(); ip.retire();
		 * ip.clicksubmit2();
		 */

		if (d.getTitle().equals("dezerv.-Apply for invite")) {
			Assert.assertTrue(true);
		} else {
			captureScreen(d, "ApplyforaccessTC_01");
			Assert.assertTrue(false);
		}

	}

}
