package com.cg.mob.service;

import com.cg.mob.beans.Mobile;
import com.cg.mob.beans.PurchaseDetails;
import com.cg.mob.dao.PurchaseDeatilsDAOImp;

public class MobileServiceImp implements MobileService{
	
	PurchaseDeatilsDAOImp dao = new PurchaseDeatilsDAOImp();
		@Override
		public void addCustomer(PurchaseDetails purchase,Mobile mob) throws  Exception {
			dao.addCustomer(purchase,mob);
			
			
	}

	@Override
	public void updateQuantity(PurchaseDetails customer, Mobile mob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMobile(Mobile mob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMobile(Mobile mob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchMobile(Mobile mob) {
		// TODO Auto-generated method stub
		
	}

}
