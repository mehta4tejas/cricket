package com.ecw.cricketscore.validity;

import org.springframework.stereotype.Component;

import com.ecw.cricketscore.entities.Match;
import com.ecw.cricketscore.pojo.ResponseMessage;

@Component
public class MatchValidator {
	public ResponseMessage addMatch(Match match) {
		ResponseMessage responseMessage = new ResponseMessage();
		if (match.getFromTournamentTeam().getId()<=0) {
			responseMessage.setMessage("Select from team id");
			responseMessage.setResult(false);
			return responseMessage;
		}
		if (match.getToTournamentTeam().getId()<=0) {
			responseMessage.setMessage("Select to team id");
			responseMessage.setResult(false);
			return responseMessage;
		}
		if (match.getDate()!=null) {
			responseMessage.setMessage("date is required");
			responseMessage.setResult(false);
			return responseMessage;
		}
		return null;
	}
}
