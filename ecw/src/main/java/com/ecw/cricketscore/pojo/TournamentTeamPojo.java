package com.ecw.cricketscore.pojo;

import java.util.List;

public class TournamentTeamPojo {

	private int id;
	private String tournamentName;
	private List<TeamPojo> teams;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public List<TeamPojo> getTeams() {
		return teams;
	}
	public void setTeams(List<TeamPojo> teams) {
		this.teams = teams;
	}
	
	
}
