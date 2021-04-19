package com.ecw.cricketscore.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MatchScore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	private TournamentTeamPlayer tournamentTeamPlayer;
	@ManyToOne
	private Match match;
	private short score;
	private boolean isOut;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TournamentTeamPlayer getTournamentTeamPlayer() {
		return tournamentTeamPlayer;
	}
	public void setTournamentTeamPlayer(TournamentTeamPlayer tournamentTeamPlayer) {
		this.tournamentTeamPlayer = tournamentTeamPlayer;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	public short getScore() {
		return score;
	}
	public void setScore(short score) {
		this.score = score;
	}
	public boolean isOut() {
		return isOut;
	}
	public void setOut(boolean isOut) {
		this.isOut = isOut;
	}
	
}
