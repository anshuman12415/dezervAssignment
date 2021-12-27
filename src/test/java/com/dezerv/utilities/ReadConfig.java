package com.dezerv.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("./configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is =" + e.getMessage());

		}

	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username = pro.getProperty("MobileNumber");
		return username;
	}

	public String getEmail() {
		String pemail = pro.getProperty("PersonalEmail");
		return pemail;
	}
	public String getEname() {
		String ename = pro.getProperty("Emprname");
		return ename;
	}

	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	/*
	 * public String getIEPath() { String iepath = pro.getProperty("iepath"); return
	 * iepath; }
	 * 
	 * public String getFirefoxPath() { String firefoxpath =
	 * pro.getProperty("firefoxpath"); return firefoxpath; }
	 */

}
