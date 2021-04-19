package com.ecw.cricketscore.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tournament {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	//Due to some reason cancel
	private boolean isActive=true;
	@Column(length = 2500)
	private String description;
	@OneToMany(mappedBy = "tournament")
	private List<TournamentTeam> tournamentTeams;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<TournamentTeam> getTournamentTeams() {
		return tournamentTeams;
	}
	public void setTournamentTeams(List<TournamentTeam> tournamentTeams) {
		this.tournamentTeams = tournamentTeams;
	}

}
