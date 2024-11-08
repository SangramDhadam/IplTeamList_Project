package com.tka.sep28;

import java.util.ArrayList;

import java.util.List;

import com.entity.Player;

public class IplPlayersLogic {

	public static void miPlayers() {
		System.out.println("               IPL Team's               ");
		System.out.println("***********************************************************");

		List<Player> mi = new ArrayList<Player>();

		mi.add(new Player(45, "Rohit Sharma", 6628, 15));
		mi.add(new Player(33, "Hardik Pandey", 2525, 64));
		mi.add(new Player(63, "Suryakumar Yadav", 3594, 3));
		mi.add(new Player(23, "Ishan Kishan", 2644, 0));
		mi.add(new Player(17, "Dewald Brevis", 230, 1));
		mi.add(new Player(9, "Tilak Varma", 1156, 0));
		mi.add(new Player(93, "Jasprit Bumrah", 69, 165));
		mi.add(new Player(16, "Tim David", 659, 0));
		mi.add(new Player(24, "Arjun Tendulkar", 13, 3));
		mi.add(new Player(48, "Romario Shepherd", 115, 4));
		mi.add(new Player(33, "Piyush Chawla", 624, 192));

		System.out.println("            Mumbai Indians(MI)            ");
		System.out.println("************************************************************");

		for (Player p : mi) {
			System.out.println(p);
			System.out.println("-----------------------------------------------------------");

			if (p.getRuns() > 2600) {
				System.out.println("Batter :" + p.getName() + "-Runs:" + p.getRuns());
				System.out.println("--------------------------");

			}
			if (p.getRuns() > 2500 & p.getWickets() > 50) {
				System.out
						.println("AllRounder :" + p.getName() + "-Runs:" + p.getRuns() + "-Wickets:" + p.getWickets());
				System.out.println("--------------------------");
			}
			if (p.getWickets() > 70) {
				System.out.println("Bowler :" + p.getName() + "-Wickets:" + p.getWickets());
				System.out.println("----------------------------");
			}

		}

	}

	public static void cskPlayers() {
		List<Player> csk = new ArrayList<Player>();
		csk.add(new Player(31, "Ruturaj Gaikwad", 2380, 0));
		csk.add(new Player(33, "Devon Conway", 924, 0));
		csk.add(new Player(7, "MS Dhoni", 5243, 0));
		csk.add(new Player(8, "Ravindra Jadeja", 2959, 160));
		csk.add(new Player(74, "Mitchell Santner", 70, 15));
		csk.add(new Player(9, "Moeen Ali", 1162, 35));
		csk.add(new Player(10, "Rajvardhan Hangargekar", 0, 3));
		csk.add(new Player(16, "Shivam Dube", 1502, 5));
		csk.add(new Player(25, "Deepak Chahar", 80, 77));
		csk.add(new Player(21, "Ajinkya Rahane", 4642, 1));
		csk.add(new Player(24, "Tushar Deshpande", 21, 42));

		System.out.println("***********************************************************");
		System.out.println("            Chennai Super Kings(CSK)            ");
		System.out.println("************************************************************");

		for (Player p1 : csk) {
			System.out.println(p1);
			System.out.println("------------------------------------------------------------");
		}
	}

	public static void rcbPlayers() {
		List<Player> rcb = new ArrayList<Player>();
		rcb.add(new Player(18, "Virat Kohli", 8004, 4));
		rcb.add(new Player(13, "Faf du Plessis", 4571, 16));
		rcb.add(new Player(17, "Rajat Patidar", 799, 0));
		rcb.add(new Player(27, "Anuj Rawat", 318, 0));
		rcb.add(new Player(19, "Dinesh Karthik", 4842, 0));
		rcb.add(new Player(32, "Glenn Maxwell", 2771, 37));
		rcb.add(new Player(6, "Mahipal Lomror", 527, 1));
		rcb.add(new Player(22, "Akash Deep", 19, 7));
		rcb.add(new Player(13, "Mohammed Siraj", 109, 93));
		rcb.add(new Player(8, "Alzarri Joseph", 27, 21));
		rcb.add(new Player(42, "Cameron Green", 707, 16));

		System.out.println("***********************************************************");
		System.out.println("            Royal Challengers Bengaluru(RCB)            ");
		System.out.println("************************************************************");

		for (Player p3 : rcb) {
			System.out.println(p3);
			System.out.println("---------------------------------------------------------");
		}

	}
}
