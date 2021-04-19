package com.ecw.cricketscore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecw.cricketscore.entities.Tournament;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TournamentTeamPojo;
import com.ecw.cricketscore.repository.TournamentRepository;
import com.ecw.cricketscore.service.TournamentService;

@Service
public class DefaultTournamentService implements TournamentService {

	@Autowired
	TournamentRepository tournamentRepository;
	
	@Override
	public ResponseMessage addTournament(Tournament tournament) {
		tournamentRepository.save(tournament);
		return new ResponseMessage("Tournament add successfully",true);
	}

	@Override
	public List<Tournament> getAllTournaments() {
		return tournamentRepository.findAll();
	}

	@Override
	public ResponseMessage assignTeam(TournamentTeamPojo tournamentTeam) {
		// TODO Auto-generated method stub
		//1. fetch Tournament base on id and store object
		//2. check team is available base on that id
		//3. if 2 step not pass in that case give error team not found
		//4. persist into db
		return new ResponseMessage("Team assign to Tournament successfully",true);
	}

}
