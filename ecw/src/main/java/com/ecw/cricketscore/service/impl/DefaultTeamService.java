package com.ecw.cricketscore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecw.cricketscore.entities.Team;
import com.ecw.cricketscore.entities.TournamentTeamPlayer;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TeamPojo;
import com.ecw.cricketscore.repository.TeamRepository;
import com.ecw.cricketscore.repository.TournamentTeamPlayerRepository;
import com.ecw.cricketscore.service.TeamService;

@Service
public class DefaultTeamService implements TeamService {

	@Autowired
	TeamRepository teamRepository;
	
	@Autowired
	TournamentTeamPlayerRepository tournamentTeamPlayerRepository;

	
	@Override
	public ResponseMessage addTeam(Team team) {
		teamRepository.save(team);
		return new ResponseMessage("Team add successfully",true);
	}

	@Override
	public List<Team> getAllTeam() {
		return teamRepository.findAll();
	}

	@Override
	public Team findTeamById(int id) {
		return teamRepository.getOne((long) id) ;
	}

	@Override
	public ResponseMessage assignPlayer(TeamPojo team) {
		// TODO Auto-generated method stub
		//1. fetch Team based on id and store object
		//2. check player is available base on that id
		//3. if 2 step not pass in that case give error player not found
		//4. persist into db
		return new ResponseMessage("Player assign to Team successfully",true);
		
	}
	
	@Override
	public TournamentTeamPlayer getTournamentTeamPlayerById(int tournamentPlayerId)
	{
		return tournamentTeamPlayerRepository.getOne((long) tournamentPlayerId);
	}
	
}
