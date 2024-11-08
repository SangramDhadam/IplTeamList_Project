package com.entity;

public class Player {
	private int jurseyNo;
	private String name;
	private int runs;
	private int wickets;

	public Player() {
		super();
	}

	public Player(int jurseyNo, String name, int runs, int wickets) {
		super();
		this.jurseyNo = jurseyNo;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getJurseyNo() {
		return jurseyNo;
	}

	public void setJurseyNo(int jurseyNo) {
		this.jurseyNo = jurseyNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Player [jurseyNo=" + jurseyNo + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + "]";
	}
	

}
