package com.cg.mob.ui;

import java.util.Scanner;

import com.cg.mob.beans.Mobile;
import com.cg.mob.beans.PurchaseDetails;
import com.cg.mob.service.MobileServiceImp;



public class StarterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String name=kb.next();
		System.out.println("Enter Customer mailId");
		String mail=kb.next();
		System.out.println("Enter Customer PhoneNo");
		String phone=kb.next();
		System.out.println("Enter Customer Purchase Date");
		String purchasedate=kb.next();
		
		try{
			PurchaseDetails purchase=new PurchaseDetails();
			Mobile mob=new Mobile();
			purchase.setCustomerName(name);
			purchase.setMailId(mail);
			purchase.setPhone(Integer.parseInt(phone));
			purchase.setPurchaseDate(purchasedate);

			
			MobileServiceImp service = new MobileServiceImp();
			service.addCustomer(purchase, mob);
			System.out.println("record inserted successfully!!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
