package com.NykaaIpt.NykaaPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;

public class EnterCardDetailImp extends NykaaBaseClass implements EnterCardDetail {
public EnterCardDetailImp() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath=cardNum_xpath)
private WebElement enterCardNum;
@FindBy(xpath=date_xpath)
private WebElement enterDate;
@FindBy(xpath=cvvNum_xpath)
private WebElement cvvNum;
@FindBy(xpath=clickPay_xpath)
private WebElement selectPay;
@FindBy(xpath=clickConfirmation_btn_xpath)
private WebElement clickConfirmation;
	public static void main(String[] args) {
		

	}
	public WebElement getEnterCardNum() {
		return enterCardNum;
	}
	public WebElement getEnterDate() {
		return enterDate;
	}
	public WebElement getCvvNum() {
		return cvvNum;
	}
	public WebElement getSelectPay() {
		return selectPay;
	}
	public WebElement getClickConfirmation() {
		return clickConfirmation;
	}

}
