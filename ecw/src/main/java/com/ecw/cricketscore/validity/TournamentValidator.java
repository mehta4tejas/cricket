package com.ecw.cricketscore.validity;

import org.springframework.stereotype.Component;

import com.ecw.cricketscore.entities.Tournament;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TournamentTeamPojo;

@Component
public class TournamentValidator {
	public ResponseMessage addTournament(Tournament tournament) {
		ResponseMessage responseMessage = new ResponseMessage();
		if (null == tournament.getName() || tournament.getName().trim().isEmpty()) {
			responseMessage.setMessage("Tournament Name is required");
			responseMessage.setResult(false);
			return responseMessage;
		}
		return null;
	}

	public ResponseMessage assignTeam(TournamentTeamPojo tournamentTeam) {
		ResponseMessage responseMessage = new ResponseMessage();
		if (tournamentTeam.getId()<=0) {
			responseMessage.setMessage("Tournament id is required");
			responseMessage.setResult(false);
			return responseMessage;
		}
		if(tournamentTeam.getTeams()==null || tournamentTeam.getTeams().isEmpty())
		{
			responseMessage.setMessage("Tournament teams are required");
			responseMessage.setResult(false);
			return responseMessage;
		}
		
		return null;
	}
}
