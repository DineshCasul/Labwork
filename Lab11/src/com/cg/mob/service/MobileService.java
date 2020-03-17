package com.cg.mob.service;

import com.cg.mob.beans.Mobile;
import com.cg.mob.beans.PurchaseDetails;

public interface MobileService {
	void addCustomer(PurchaseDetails purchase,Mobile mob) throws Exception;
	void updateQuantity(PurchaseDetails purchase,Mobile mob);
	void displayMobile(Mobile mob);
	void deleteMobile(Mobile mob);
	void searchMobile(Mobile mob);
}
