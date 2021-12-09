package com.technoelevate.scannerclass;

	import java.util.LinkedList;
	import java.util.ListIterator;

	public class IteratourHn {
		
		public static  LinkedList myHeros = new LinkedList();
			
			public static void main(String[] args) {
				Heros ironMan = new Heros("IronMan", "Iron Suit");
				Heros superMan = new Heros("SuperMan", "Kryptonite Cells");
				Heros captainAmerica = new Heros("CaptainAmerica", "Shield");
				Heros thor = new Heros("Thor", "Mighty Hammer");
				
				myHeros.add(ironMan);
				myHeros.add(superMan);
				myHeros.add(captainAmerica);
				myHeros.add(thor);
				//myHeros.remove(0);
				getHeros();

			}
			
			
			public static void getHeros() {
				ListIterator li = myHeros.listIterator();
				while(li.hasNext()) {
					Heros hero =(Heros) li.next();
					System.out.println(hero.getName()+" "+hero.getWeapon());
				}

				
				
			}

		}




