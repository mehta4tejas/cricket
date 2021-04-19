package com.ecw.cricketscore.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class TournamentTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	private Tournament tournament;
	@ManyToOne
	private Team team;
	@OneToMany(mappedBy = "tournamentTeam")
	private List<TournamentTeamPlayer> tournamentTeamPlayers;
	@OneToMany(mappedBy = "fromTournamentTeam")
	private List<Match> matchs;
	@OneToMany(mappedBy = "toTournamentTeam")
	private List<Match> matchsList;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public List<TournamentTeamPlayer> getTournamentTeamPlayers() {
		return tournamentTeamPlayers;
	}
	public void setTournamentTeamPlayers(List<TournamentTeamPlayer> tournamentTeamPlayers) {
		this.tournamentTeamPlayers = tournamentTeamPlayers;
	}
	public List<Match> getMatchs() {
		return matchs;
	}
	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}
	public List<Match> getMatchsList() {
		return matchsList;
	}
	public void setMatchsList(List<Match> matchsList) {
		this.matchsList = matchsList;
	}
	
}
