package com.NykaaIpt.NykaaPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;

public class ClearDataInBagImp extends NykaaBaseClass implements ClearDataInBag {
public ClearDataInBagImp() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath=clickBag_btn_xpath)
private WebElement clickBag;
@FindBy(xpath=clickEdit_btn_xpath)
private WebElement clickEditButton;
@FindBy(xpath=clickElement_btn_xpath)
private WebElement clickElement;
public WebElement getClickBag() {
	return clickBag;
}

public WebElement getClickEditButton() {
	return clickEditButton;
}

public WebElement getClickElement() {
	return clickElement;
}

public WebElement getClickRemoveQty() {
	return clickRemoveQty;
}
@FindBy(xpath=clickRemove_btn_xpath)
private WebElement clickRemoveQty;

	public static void main(String[] args) {
		

	}

}
