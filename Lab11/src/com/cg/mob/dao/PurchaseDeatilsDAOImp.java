package com.cg.mob.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cg.mob.beans.Mobile;
import com.cg.mob.beans.PurchaseDetails;

public class PurchaseDeatilsDAOImp implements PurchaseDetailsDAO{

	
	
	//PreparedStatement ps=null;
	
	public void addCustomer(PurchaseDetails purchase , Mobile mob){
		// TODO Auto-generated method stub
		try{
			String url= "jdbc:oracle:thin:@localhost:1521:XE";  //driver/ipaddress/port/database instance
			String user="system";
			String password="orcl11g";
			Connection connection =DriverManager.getConnection(url, user, password);
			//ps = connection.prepareStatement("insert into purchasedetails1 values(?,?,?,?,?,?)");
			/*
			ps.setLong(1,purchase.getPurchaseId() );
			ps.setString(2, purchase.getCustomerName());
			ps.setString(3, purchase.getMailId());
			ps.setInt(4,purchase.getPhone());
			ps.setString(5, purchase.getPurchaseDate());
			ps.setLong(6, mob.getMobileId());
			ps.executeUpdate();
			*/
			
			Statement stm = connection.createStatement();
			 
			ResultSet rs=stm.executeQuery("select m.mobileid from purchasedetails1 p join mobile m on p.mobileid=m.mobileid");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getString(4));
			}
			
			
			
			
			
			
			 	String q1="";
				
			 	String query=("insert into purchasedetails1 values("+PurchaseDetails.getPurchaseId()+",'"+purchase.getCustomerName()+"','"+purchase.getMailId()+"',"+purchase.getPhone()+",'"+purchase.getPurchaseDate()+"',"+q1+")");
				System.out.println(query);
				int row=stm.executeUpdate(query);
				System.out.println(row+"row inserted");
				System.out.println("ghfjdsdfhk");
			
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
			finally{

			}
		
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
