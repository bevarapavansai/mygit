package com.technoelevate.scannerclass;

import java.util.LinkedList;

public class IteratourFe {

		public static LinkedList myCity = new LinkedList();

		public static void main(String[] args) {
		
			City Gao = new City("Goa","Beach");
			City KONDAPALLI = new City("KONDAPALLI","Caves");
			City Vijayawada = new City("Vijayawada","Durga Temple");
			City Machilipatnam = new City("Machilipatnam","Beach");
			City Bhimavaram = new City("Bhimavaram","Fish Ponds and Prawns");
			City Vishkhapatnam = new City("Vishkhapatnam","Beach");
		
		myCity.add(Gao);
		myCity.add(KONDAPALLI);
		myCity.add( Vijayawada);
		myCity.add(Machilipatnam);
		myCity.add(Bhimavaram);
		myCity.add(Vishkhapatnam);
			
	 // myCity.remove();
		getCity();
		
		}

		private static void getCity() {
			for(Object city : myCity) {
				City myCity = (City)city;
				System.out.println(myCity.getCity()+" is famous for "+myCity.getFamous());
			
		}
		
		}
	}
	


