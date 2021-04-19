package com.ecw.cricketscore.validity;

import org.springframework.stereotype.Component;

import com.ecw.cricketscore.entities.Team;
import com.ecw.cricketscore.entities.Tournament;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TeamPojo;

@Component
public class TeamValidator {
	public ResponseMessage addTeam(Team team) {
		ResponseMessage responseMessage = new ResponseMessage();
		if (null == team.getName() || team.getName().trim().isEmpty()) {
			responseMessage.setMessage("Name is required");
			responseMessage.setResult(false);
			return responseMessage;
		}
		return null;
	}
	
	public ResponseMessage assignPlayer(TeamPojo teamPojo) {
		ResponseMessage responseMessage = new ResponseMessage();
		if (teamPojo.getId()<=0) {
			responseMessage.setMessage("Team id is required");
			responseMessage.setResult(false);
			return responseMessage;
		}
		if(teamPojo.getPlayers()==null || teamPojo.getPlayers().isEmpty())
		{
			responseMessage.setMessage("Team players are required");
			responseMessage.setResult(false);
			return responseMessage;
		}
		
		return null;
	}
}
