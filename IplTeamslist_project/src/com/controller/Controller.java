package com.controller;

import java.util.List;

import com.entity.Player;
import com.service.Function;

public class Controller {

	public List<Player> getAllPlayerControllermi() {

		Function fa = new Function();
		List<Player> mi = fa.getAllPlayersFunctionofmiTeam();

		return mi;

	}

	public List<Player> getAllPlayersControllercsk() {
		Function fa = new Function();
		List<Player> csk = fa.getAllPlayersFunctionofcskTeam();
		return csk;

	}

	public List<Player> getAllPlayersControllerrcb() {
		Function fa = new Function();
		List<Player> rcb = fa.getAllPlayersFunctionofrcbTeam();
		return rcb;
	}
	

}
