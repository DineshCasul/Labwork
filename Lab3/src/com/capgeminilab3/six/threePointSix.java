package com.capgeminilab3.six;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

class ZonedId {
	private String zone;

	public String getZone() {
		return zone;
	}

	public void setZoneId(String zone) {
		this.zone = zone;
	}
	public String zoneID(String zone) {
		ZoneId zoneid1 = ZoneId.of(zone);
		LocalDateTime id1 = LocalDateTime.now(zoneid1); 
		System.out.println(id1);
		String zID=zoneid1.getId();
		return "ZONE ID IS : "+zID;	
	}
}

public class threePointSix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your ZONE ID");
		String Id=sc.next();
		ZonedId zo= new ZonedId();
		System.out.println(zo.zoneID(Id));
		sc.close();
	}
}
