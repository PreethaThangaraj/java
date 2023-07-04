package com.NykaaIpt.NykaaPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;

public class SelectProductImp extends NykaaBaseClass implements SelectProduct {

	public SelectProductImp() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=himalaya_Click)
	private WebElement selectHimalayaProduct;
	
	public WebElement getSelectHimalayaProduct() {
		return selectHimalayaProduct;
	}
public static void main(String[] args) {
		

	}
}
