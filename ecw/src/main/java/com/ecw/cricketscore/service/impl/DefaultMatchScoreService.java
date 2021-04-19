package com.ecw.cricketscore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecw.cricketscore.entities.MatchScore;
import com.ecw.cricketscore.entities.Team;
import com.ecw.cricketscore.entities.TournamentTeamPlayer;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TeamPojo;
import com.ecw.cricketscore.repository.MatchScoreRepository;
import com.ecw.cricketscore.service.MatchScoreService;
import com.ecw.cricketscore.service.TeamService;

@Service
public class DefaultMatchScoreService implements MatchScoreService {

	@Autowired
	MatchScoreRepository matchScoreRepository;

	@Autowired TeamService teamService;
	
	@Override
	public ResponseMessage addMatchScore(MatchScore matchScore) {
		
		try
		{
			TournamentTeamPlayer tournamentTeamPlayer = teamService.getTournamentTeamPlayerById(matchScore.getTournamentTeamPlayer().getId());
			if(countWicketOfMatchteam(matchScore)<0)
			{
				matchScoreRepository.save(matchScore);
			}
			else
			{
				return new ResponseMessage("wicket exceed",false);
			}
		}
		catch (Exception e) {
			return new ResponseMessage("No Matching found",false);
		}
		return new ResponseMessage("Score Update Sucessfully",true);
	}

	@Override
	public int countWicketOfMatchteam(MatchScore matchScore) {
		
		return (int) matchScoreRepository.wicketCount(matchScore.getMatch().getId(), matchScore.getTournamentTeamPlayer().getTournamentTeam().getId());
	}

	@Override
	public TeamPojo getTeamWiseScore(Team team) {
		//Base on query we have to this all detail and convert into TeamPojo
		return new TeamPojo();
	}
	
	
	
}
