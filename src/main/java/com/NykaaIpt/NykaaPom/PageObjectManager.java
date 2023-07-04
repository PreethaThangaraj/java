package com.NykaaIpt.NykaaPom;

public class PageObjectManager {
	
private LoginPageImplementation lp;
private SearchProductImp sp;
private SelectProductImp sel;
private AddProductQtyImp qty;
private AddToBagPageImp bag;
private AddressDetailImp add;
private EnterCardDetailImp card;
private ClearDataInBagImp remove;
	public LoginPageImplementation getLp() {
		if(lp==null) {
			lp=new LoginPageImplementation();
		}
	return lp;
}
	public SearchProductImp getSp() {
		if(sp==null) {
			sp=new SearchProductImp();
		}
		return sp;
	}
	public SelectProductImp getsel() {
		if(sel==null) {
			sel=new SelectProductImp();
		}
		return sel;	
	}
	public AddProductQtyImp getqty() {
		if(qty==null) {
			qty=new AddProductQtyImp();
		}
		return qty;	
	}
   public AddToBagPageImp getbag() {
	   if(bag==null) {
		   bag= new AddToBagPageImp();
	   }
	return bag;
   }
	public AddressDetailImp getadd() {
		if(add==null) {
			add= new AddressDetailImp();
		}
		return add;   
   }
	public EnterCardDetailImp getcard() {
		if(card==null) {
			card=new EnterCardDetailImp();
		}
		return card;	
	}
	public ClearDataInBagImp getremove() {
		if(remove==null) {
			remove= new ClearDataInBagImp();
		}
		return remove;
		
	}
	public static void main(String[] args) {
		
	}
}
