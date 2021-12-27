package com.dezerv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvitePage {
	WebDriver ldriver;

	public InvitePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//input[@placeholder='+91']")
	@CacheLookup
	WebElement enterwhatsappMobileNo;

	@FindBy(xpath = "//input[@placeholder='you@billionaire.xyz']")
	@CacheLookup
	WebElement txtpersonalemail;

	@FindBy(xpath = "//input[@placeholder='As per LinkedIn']")
	@CacheLookup
	WebElement txtEmployerName;

	@FindBy(xpath = "//button[@class='commonButton']")
	@CacheLookup
	WebElement submit;

	
	/*
	 * @FindBy(xpath=
	 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]")
	 * 
	 * @CacheLookup WebElement selectAge;
	 * 
	 * @FindBy(xpath="//button[normalize-space()='Never invested']")
	 * 
	 * @CacheLookup WebElement neverinvest;
	 * 
	 * @FindBy(xpath="//button[normalize-space()='-10% drop']")
	 * 
	 * @CacheLookup WebElement dropten;
	 * 
	 * @FindBy(xpath="//button[normalize-space()='Retirement']")
	 * 
	 * @CacheLookup WebElement retirement;
	 * 
	 * 
	 * @FindBy(xpath="//button[@class='commonButton']")
	 * 
	 * @CacheLookup WebElement submit2;
	 */

	public void whatsappNumber(String umobilenum) {

		enterwhatsappMobileNo.sendKeys(umobilenum);

	}

	public void pEmail(String uemail) {

		txtpersonalemail.sendKeys(uemail);

	}

	public void EmployerName(String ename) {

		txtEmployerName.sendKeys(ename);

	}

	public void clicksubmit() {

		submit.submit();
	}
	
	/*
	 * public void selectAg() {
	 * 
	 * selectAge.click(); }
	 * 
	 * public void neinvest() {
	 * 
	 * neverinvest.click(); }
	 * 
	 * public void dropamount() {
	 * 
	 * dropten.click(); }
	 * 
	 * public void retire() {
	 * 
	 * retirement.submit(); }
	 * 
	 * public void clicksubmit2() {
	 * 
	 * submit2.submit(); }
	 */

}
