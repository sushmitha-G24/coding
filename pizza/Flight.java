package com.xworkz.pizza;

public class Flight {
	private int aeroplaneCode;
	private String company;
	private String startingPoint;
	private String Destination;
	private int totalNoOfSeats;
	int businessClassPrice;
	int economyClassPrice;
	private int domestiClassPrice;

	public int getAeroplaneCode() {
		return aeroplaneCode;
	}

	public void setAeroplaneCode(int aeroplaneCode) {
		this.aeroplaneCode = aeroplaneCode;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getTotalNoOfSeats() {
		return totalNoOfSeats;
	}

	public void setTotalNoOfSeats(int totalNoOfSeats) {
		this.totalNoOfSeats = totalNoOfSeats;
	}

	public int getBusinessClassPrice() {
		return businessClassPrice;
	}

	public void setBusinessClassPrice(int businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}

	public int getEconomyClassPrice() {
		return economyClassPrice;
	}

	public void setEconomyClassPrice(int economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}

	public void checkAvilabilityFlight() {
		
		if (this.businessClassPrice >=1000) {
			System.out.println("seats are avilable for businessClass");
		} else {
			System.out.println("Seats are not avilable ");
		}
		if (this.economyClassPrice <= 600) {
			System.out.println("seats avilable for economy");
		}
	}
	public void displayinformation() {
		this.aeroplaneCode=3466;
		this.company="airindia";
		this.startingPoint="hyderbad";
		this.Destination="dubai";
		this.totalNoOfSeats=200;
		this.economyClassPrice=500;
		this.domestiClassPrice=1500;
		
	}

}
