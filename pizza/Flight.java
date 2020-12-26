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
		if (this.domestiClassPrice <= 300) {
			System.out.println("the seats avilabe for domeststic");
		} else {
			System.out.println("seats are not avilabe for domeststic");
		}

		if (this.businessClassPrice <= 500) {
			System.out.println("seats are avilable for businessClass");
		} else {
			System.out.println("Seats are not avilable ");
		}
		if (this.economyClassPrice <= 1000) {
			System.out.println("seats avilable for economy");
		}

	}

}
