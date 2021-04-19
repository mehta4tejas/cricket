package com.ecw.cricketscore.service;

import java.util.List;

import com.ecw.cricketscore.entities.Tournament;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TournamentTeamPojo;

public interface TournamentService {
	public ResponseMessage addTournament(Tournament tournament);
	public List<Tournament> getAllTournaments();
	public ResponseMessage assignTeam(TournamentTeamPojo tournamentTeam);
}
