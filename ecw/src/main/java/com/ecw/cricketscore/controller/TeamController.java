package com.ecw.cricketscore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecw.cricketscore.entities.Team;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TeamPojo;
import com.ecw.cricketscore.service.TeamService;
import com.ecw.cricketscore.validity.TeamValidator;

@RestController
@RequestMapping("/team/")
public class TeamController {
	
	@Autowired
	TeamValidator teamValidator;
	
	@Autowired
	TeamService teamService;
	
	@PostMapping()
	public ResponseMessage addTeam(@RequestBody Team team)
	{
		ResponseMessage responseMessage = teamValidator.addTeam(team);
		if(responseMessage==null)
		{
			responseMessage= teamService.addTeam(team);
		}
		return responseMessage;
	}
	
	@GetMapping()
	public List<Team> getAllTeam()
	{
		return teamService.getAllTeam();
	}
	
	@PostMapping("assignPlayer")
	public ResponseMessage assignPlayer(@RequestBody TeamPojo team)
	{
		ResponseMessage responseMessage = teamValidator.assignPlayer(team);
		if(responseMessage==null)
		{
			responseMessage= teamService.assignPlayer(team);
		}
		return responseMessage;
	}
}
