package com.capgeminilab9.all;



public class Date {
	int Day, Month, Year;
	// Constructor  
	Date(int Day, int Month, int Year){ 
		if(Day == 0 && Month==0 && Year==0){    
			 throw new IllegalArgumentException("values cannot be null...");
			 } 
		this.Day = Day; 
		this.Month = Month; 
		this.Year = Year;  
	}  
	// setter and getter methods  
	void setDay(int Day){   
		this.Day = Day;  
	}   
	int getDay( ){   
		return  this.Day;  
	}    
	void setMonth(int Month){   
		this.Month = Month;  
	} 

	int getMonth( ) {   
		return  this.Month; 
	} 

	void setYear(int Year){   
		this.Year=Year;  
	} 

	int getYear( ){   
		return  this.Year; 
	}
	public String toString(){
		//converts date obj to string.        
		return Day+"/"+Month+"/"+Year;   
	} 
	public static void main(String args[]) {
		Date d= new Date(31,1,2020);
		System.out.println(d);
		
	}
}
