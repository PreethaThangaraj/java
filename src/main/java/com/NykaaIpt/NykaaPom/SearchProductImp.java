package com.NykaaIpt.NykaaPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;

public class SearchProductImp extends NykaaBaseClass implements SearchProduct {
	public SearchProductImp() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=click_BabyProduct_xpath)
	private WebElement click_BabyProduct;
	
	@FindBy(linkText=click_BabyPowder_text)
	private WebElement click_BabyPowder;
	
	public WebElement getClick_BabyProduct() {
		return click_BabyProduct;
	}

	public WebElement getClick_BabyPowder() {
		return click_BabyPowder;
	}

	public static void main(String[] args) {
		

	}

}
