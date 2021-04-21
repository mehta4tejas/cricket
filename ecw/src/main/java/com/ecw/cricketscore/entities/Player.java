package com.ecw.cricketscore.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Player 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "player")
	private List<TournamentTeamPlayer> tournamentTeamPlayers;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TournamentTeamPlayer> getTournamentTeamPlayers() {
		return tournamentTeamPlayers;
	}
	public void setTournamentTeamPlayers(List<TournamentTeamPlayer> tournamentTeamPlayers) {
		this.tournamentTeamPlayers = tournamentTeamPlayers;
	}
	
}
