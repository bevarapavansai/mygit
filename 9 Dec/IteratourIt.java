package com.technoelevate.scannerclass;

	import java.util.LinkedList;
	import java.util.Iterator;

public class IteratourIt {
		
	public static LinkedList myCity = new LinkedList();

		public static void main(String[] args) {
		
			City vijayawada = new City("vijayawada","krishna river");
			City Mangalgiri = new City("Mangalgiri","caves");
			City Tirupathi = new City("Tirupathi","Lord Venkateswara");
			City Rajahmundry = new City("Rajahmundry","Dhavalasewaram Barrage");
			City Bhimavaram = new City("Bhimavaram","Fish Ponds and Prawns");
			City Nuzived= new City("Nuzived","Mango");
		
		myCity.add(vijayawada);
		myCity.add(Mangalgiri);
		myCity.add(Tirupathi);
		myCity.add(Rajahmundry);
		myCity.add(Bhimavaram);
		myCity.add(Nuzived);
			
		myCity.removeLast();
		getCity();
		
		}

		private static void getCity() {
			Iterator itr = myCity.iterator();
			while (itr.hasNext()) {
				City myCity = (City) itr.next();
				System.out.println(myCity.getCity() + " is famous for " + myCity.getFamous());
			
		}
		}
		
	}


