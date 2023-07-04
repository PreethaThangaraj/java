package com.NykaaIpt.NykaaPom;

public interface EnterCardDetail {

	String cardNum_xpath="//input[@label='Card Number']";
	String date_xpath="//input[@label='Expiry (MM/YY)']";
	String cvvNum_xpath="//input[@placeholder='CVV']";
	String clickPay_xpath="//button[@class='css-v61n2j e8tshxd0']";
	String clickConfirmation_btn_xpath="//button[text()='Pay without securing card']";
}
