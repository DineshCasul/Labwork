package com.cg.mob.beans;

public class PurchaseDetails {
	private static long purchaseId=1000;
	private String customerName;
	private String mailId;
	private int phone;
	private String purchaseDate;
	private long mobileId;
	
	public PurchaseDetails(){
		purchaseId++;
	}
	
	public static long getPurchaseId() {
		return purchaseId;
	}

	public static void setPurchaseId(long purchaseId) {
		PurchaseDetails.purchaseId = purchaseId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public long getMobileId() {
		return mobileId;
	}

	public void setMobileId(long mobileId) {
		this.mobileId = mobileId;
	}
	
	
}
