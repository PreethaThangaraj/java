package com.NykaaIpt.NykaaPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;

public class LoginPageImplementation extends NykaaBaseClass implements LoginPage{
	
	public LoginPageImplementation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = signIn_btn_xpath)
    private WebElement signIn_btn; 
	
	@FindBy(xpath=signInWithMobile_xpath)
	private WebElement signWithMobile;
	
	@FindBy(xpath=loginWithMobile_xpath)
	private WebElement loginMobile;
	
	@FindBy(id=submitMobileNum_id)
	private WebElement enterSubmit_btn;
	
	@FindBy(xpath=verifyButton_xpath)
	private WebElement enterVerify_btn;
	
	public WebElement getSignIn_btn() {
		return signIn_btn;
	}
	public void setSignIn_btn(WebElement signIn_btn) {
		this.signIn_btn = signIn_btn;
	}
	public WebElement getSignWithMobile() {
		return signWithMobile;
	}
	public void setSignWithMobile(WebElement signWithMobile) {
		this.signWithMobile = signWithMobile;
	}
	public WebElement getLoginMobile() {
		return loginMobile;
	}
	public void setLoginMobile(WebElement loginMobile) {
		this.loginMobile = loginMobile;
	}
	public WebElement getEnterSubmit_btn() {
		return enterSubmit_btn;
	}
	public void setEnterSubmit_btn(WebElement enterSubmit_btn) {
		this.enterSubmit_btn = enterSubmit_btn;
	}
	public WebElement getEnterVerify_btn() {
		return enterVerify_btn;
	}
	public void setEnterVerify_btn(WebElement enterVerify_btn) {
		this.enterVerify_btn = enterVerify_btn;
	}
	
	public static void main(String[] args) {
		

	}

}
