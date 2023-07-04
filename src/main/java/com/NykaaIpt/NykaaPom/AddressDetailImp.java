package com.NykaaIpt.NykaaPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;

public class AddressDetailImp extends NykaaBaseClass implements AddressDetail{
public AddressDetailImp(){
	PageFactory.initElements(driver, this);
}
@FindBy(xpath=clickAddress_btn_xpath)
private WebElement enterAddress;
	public WebElement getEnterAddress() {
	return enterAddress;
}
	public static void main(String[] args) {
		

	}

}
