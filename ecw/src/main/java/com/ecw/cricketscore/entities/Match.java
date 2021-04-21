package com.ecw.cricketscore.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private TournamentTeam fromTournamentTeam;
	@ManyToOne
	private TournamentTeam toTournamentTeam;
	private Date date;
	@OneToMany(mappedBy = "match")
	private List<MatchScore> matchScores;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TournamentTeam getFromTournamentTeam() {
		return fromTournamentTeam;
	}
	public void setFromTournamentTeam(TournamentTeam fromTournamentTeam) {
		this.fromTournamentTeam = fromTournamentTeam;
	}
	public TournamentTeam getToTournamentTeam() {
		return toTournamentTeam;
	}
	public void setToTournamentTeam(TournamentTeam toTournamentTeam) {
		this.toTournamentTeam = toTournamentTeam;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<MatchScore> getMatchScores() {
		return matchScores;
	}
	public void setMatchScores(List<MatchScore> matchScores) {
		this.matchScores = matchScores;
	}
	
}
