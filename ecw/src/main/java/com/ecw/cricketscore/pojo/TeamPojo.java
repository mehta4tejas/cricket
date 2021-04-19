package com.ecw.cricketscore.pojo;

import java.util.List;

public class TeamPojo {
	private int id;
	private String name;
	private long totalRun;
	private long wicket;
	private long noOfDotBall;
	private long noOfFour;
	private long noOfSix;
	ResponseMessage responseMessage;
	
	private List<PlayerPojo> players;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<PlayerPojo> getPlayers() {
		return players;
	}
	public void setPlayers(List<PlayerPojo> players) {
		this.players = players;
	}
	public long getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(long totalRun) {
		this.totalRun = totalRun;
	}
	public long getNoOfDotBall() {
		return noOfDotBall;
	}
	public void setNoOfDotBall(long noOfDotBall) {
		this.noOfDotBall = noOfDotBall;
	}
	public long getNoOfFour() {
		return noOfFour;
	}
	public void setNoOfFour(long noOfFour) {
		this.noOfFour = noOfFour;
	}
	public long getNoOfSix() {
		return noOfSix;
	}
	public void setNoOfSix(long noOfSix) {
		this.noOfSix = noOfSix;
	}
	public long getWicket() {
		return wicket;
	}
	public void setWicket(long wicket) {
		this.wicket = wicket;
	}
	public ResponseMessage getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(ResponseMessage responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	
}

