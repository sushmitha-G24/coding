package com.xworkz.pizza;

public class FlightMain {

	public static void main(String[] args) {
		Flight flight=new Flight();
		
		flight.setAeroplaneCode(40367);
		System.out.println( "flightcode is" +flight.getAeroplaneCode());
		flight.setCompany("air india");
		System.out.println("company"+flight.getCompany());
		flight.setStartingPoint("hyderbad");
		System.out.println( "startingPoint" +flight.getStartingPoint());
		flight.setDestination("dubai");
		System.out.println("Destination" +flight.getDestination());
		flight.setTotalNoOfSeats(200);
		System.out.println("total num of seats" +flight.getTotalNoOfSeats());
		flight.setBusinessClassPrice(2000);
		System.out.println("business price"+flight.getBusinessClassPrice());
		flight.setEconomyClassPrice(700);
		System.out.println("econoy price" +flight.getEconomyClassPrice());
		 
		flight.checkAvilabilityFlight();
		flight.displayinformation();
	}

}
