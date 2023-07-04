package com.NykaaIpt.NykaaPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;

public class AddProductQtyImp extends NykaaBaseClass implements AddProductQty{
	public AddProductQtyImp() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath =select_quantity_xpath )
    private WebElement select_quantity;
	@FindBy(xpath=selectAddToBag_btn_xpath)
	private WebElement selectBag;
	
	public WebElement getSelect_quantity() {
		return select_quantity;
	}

	public WebElement getSelectBag() {
		return selectBag;
	}

	public static void main(String[] args) {
		

	}

}
