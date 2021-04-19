package com.ecw.cricketscore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecw.cricketscore.entities.Match;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.service.MatchService;
import com.ecw.cricketscore.validity.MatchValidator;

@RestController
@RequestMapping("/match/")
public class MatchController {
	
	@Autowired
	MatchValidator matchValidator;
	
	@Autowired
	MatchService matchService;
	
	@PostMapping()
	public ResponseMessage addMatch(@RequestBody Match match)
	{
		ResponseMessage responseMessage = matchValidator.addMatch(match);
		if(responseMessage==null)
		{
			responseMessage= matchService.addMatch(match);
		}
		return responseMessage;
	}
	
}
