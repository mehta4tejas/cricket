package com.ecw.cricketscore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecw.cricketscore.entities.Tournament;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TournamentTeamPojo;
import com.ecw.cricketscore.service.TournamentService;
import com.ecw.cricketscore.validity.TournamentValidator;

@RestController
@RequestMapping("/tournament/")
public class TournamentController {

	@Autowired
	TournamentValidator tournamentValidator;
	
	@Autowired
	TournamentService tournamentService;
	
	@PostMapping()
	public ResponseMessage addTournament(@RequestBody Tournament tournament)
	{
		ResponseMessage responseMessage = tournamentValidator.addTournament(tournament);
		if(responseMessage==null)
		{
			responseMessage= tournamentService.addTournament(tournament);
		}
		return responseMessage;
	}
	
	@GetMapping()
	public List<Tournament> getAllTournament()
	{
		return tournamentService.getAllTournaments();
	}
	
	@PostMapping("assignTeam")
	public ResponseMessage assignTeam(@RequestBody TournamentTeamPojo tournamentTeam)
	{
		ResponseMessage responseMessage = tournamentValidator.assignTeam(tournamentTeam);
		if(responseMessage==null)
		{
			responseMessage= tournamentService.assignTeam(tournamentTeam);
		}
		return responseMessage;
	}
}
