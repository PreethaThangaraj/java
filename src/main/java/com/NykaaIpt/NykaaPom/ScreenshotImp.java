package com.NykaaIpt.NykaaPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;

public class ScreenshotImp extends NykaaBaseClass implements Screenshot {
public ScreenshotImp() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath=clickClose_btn_xpath)
private WebElement clickCloseButton;

	public WebElement getClickCloseButton() {
	return clickCloseButton;
}

	public static void main(String[] args) {
		

	}

}
