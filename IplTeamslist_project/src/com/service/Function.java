package com.service;

import java.util.List;

import com.dao.Dao;
import com.entity.Player;

public class Function {

	public List<Player> getAllPlayersFunctionofmiTeam() {
		Dao da = new Dao();

		List<Player> mi = da.getAllPlayersofMiTeam();
		for (Player p : mi) {
			System.out.println(p);
			System.out.println(
					"----------------------------------------------------------------------------------------");

		}

		return mi;

	}

	public List<Player> getAllPlayersFunctionofcskTeam() {
		Dao da = new Dao();
		List<Player> csk = da.getAllPlayersofCskTeam();
		for (Player p : csk) {
			System.out.println(p);
			System.out.println(
					"----------------------------------------------------------------------------------------");
		}
		return csk;

	}

	public List<Player> getAllPlayersFunctionofrcbTeam() {
		Dao da = new Dao();
		List<Player> rcb = da.getAllPlayersofrcbTeam();
		for (Player p : rcb) {
			System.out.println(p);
			System.out.println("-------------------------------------------------------");
		}
		return rcb;
	}
	
		
	}


