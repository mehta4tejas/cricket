package com.ecw.cricketscore.validity;

import org.springframework.stereotype.Component;

import com.ecw.cricketscore.entities.MatchScore;
import com.ecw.cricketscore.entities.Team;
import com.ecw.cricketscore.pojo.ResponseMessage;

@Component
public class MatchScoreValidator {
	public ResponseMessage addMatchScore(MatchScore matchScore) {
		ResponseMessage responseMessage = new ResponseMessage();
		if (matchScore.getScore()<0) {
			responseMessage.setMessage("Invalid score");
			responseMessage.setResult(false);
			return responseMessage;
		}
		if (matchScore.getTournamentTeamPlayer().getId()<=0) {
			responseMessage.setMessage("Select tournament team player id");
			responseMessage.setResult(false);
			return responseMessage;
		}
		if (matchScore.getMatch().getId()<=0) {
			responseMessage.setMessage("Select Match id");
			responseMessage.setResult(false);
			return responseMessage;
		}
		return null;
	}
	
	public ResponseMessage getScoreOfTeam(Team team)
	{
		ResponseMessage responseMessage = new ResponseMessage();
		if (team.getId()<0) {
			responseMessage.setMessage("Select Team");
			responseMessage.setResult(false);
			return responseMessage;
		}
		return null;
	}
}
