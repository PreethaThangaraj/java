package com.NykaaIpt.Nykaa;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;
import com.NykaaIpt.NykaaPom.PageObjectManager;

public class TestRunner extends NykaaBaseClass{
	static PageObjectManager pom;
public static void browserLaunch() {
	getDriver("chrome");
    browserLaunch("https://www.nykaa.com/");
}
public static void loginPage() throws InterruptedException {
	pom = new PageObjectManager();
	elementToBeClick(pom.getLp().getSignIn_btn());
	elementToBeClick(pom.getLp().getSignWithMobile());
	Thread.sleep(10000);
//	elementToBeClick(pom.getLp().getLoginMobile());
	explicitWait(pom.getLp().getLoginMobile(), 30, "visibility");
	inputToElement(pom.getLp().getLoginMobile(), "6382199843");
	elementToBeClick(pom.getLp().getEnterSubmit_btn());
	Thread.sleep(30000);
	elementToBeClick(pom.getLp().getEnterVerify_btn());
}

public static void SearchProduct() {
	pom= new PageObjectManager();
	mouseHover(pom.getSp().getClick_BabyProduct());
	explicitWait(pom.getSp().getClick_BabyProduct(),30 ,"visibility");
    elementToBeClick(pom.getSp().getClick_BabyPowder());
    switchWindow(1);
}
	public static void main(String[] args) throws IOException, InterruptedException {
		
        browserLaunch();
        loginPage();
        SearchProduct();
     	}


}
