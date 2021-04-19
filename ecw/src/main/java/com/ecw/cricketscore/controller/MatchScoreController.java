package com.ecw.cricketscore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecw.cricketscore.entities.MatchScore;
import com.ecw.cricketscore.entities.Team;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TeamPojo;
import com.ecw.cricketscore.service.MatchScoreService;
import com.ecw.cricketscore.validity.MatchScoreValidator;

@RestController
@RequestMapping("/matchscore/")
public class MatchScoreController {
	
	@Autowired
	MatchScoreValidator matchScoreValidator;
	
	@Autowired
	MatchScoreService matchScoreService;
	
	@PostMapping()
	public ResponseMessage addMatchScore(@RequestBody MatchScore matchScore)
	{
		ResponseMessage responseMessage = matchScoreValidator.addMatchScore(matchScore);
		if(responseMessage==null)
		{
			responseMessage= matchScoreService.addMatchScore(matchScore);
		}
		return responseMessage;
	}
	
	@PostMapping("/getScoreOfTeam")
	public TeamPojo getScoreOfTeam(@RequestBody Team team)
	{
		TeamPojo teamPojo = new TeamPojo();
		ResponseMessage responseMessage = matchScoreValidator.getScoreOfTeam(team);
		if(responseMessage==null)
		{
			teamPojo= matchScoreService.getTeamWiseScore(team);
			return teamPojo;
		}
		teamPojo.setResponseMessage(responseMessage);
		return teamPojo;
	}
}
