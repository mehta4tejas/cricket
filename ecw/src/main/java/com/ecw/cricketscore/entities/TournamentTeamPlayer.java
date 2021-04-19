package com.ecw.cricketscore.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class TournamentTeamPlayer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	private Player player;
	@ManyToOne
	private TournamentTeam tournamentTeam;
	@OneToMany(mappedBy = "tournamentTeamPlayer")
	private List<MatchScore> matchScores;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public TournamentTeam getTournamentTeam() {
		return tournamentTeam;
	}
	public void setTournamentTeam(TournamentTeam tournamentTeam) {
		this.tournamentTeam = tournamentTeam;
	}
	
}
