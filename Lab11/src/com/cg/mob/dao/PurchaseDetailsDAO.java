package com.cg.mob.dao;

import com.cg.mob.beans.Mobile;
import com.cg.mob.beans.PurchaseDetails;

public interface PurchaseDetailsDAO {
	void addCustomer(PurchaseDetails customer,Mobile mob) throws Exception;
	void updateQuantity(PurchaseDetails customer,Mobile mob);
	void displayMobile(Mobile mob);
	void deleteMobile(Mobile mob);
	void searchMobile(Mobile mob);
}
