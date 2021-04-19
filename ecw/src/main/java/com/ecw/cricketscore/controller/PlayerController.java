package com.ecw.cricketscore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecw.cricketscore.entities.Player;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.service.PlayerService;
import com.ecw.cricketscore.validity.PlayerValidator;

@RestController
@RequestMapping("/player/")
public class PlayerController {
	
	@Autowired
	PlayerValidator playerValidator;
	
	@Autowired
	PlayerService playerService;
	
	@PostMapping()
	public ResponseMessage addPlayer(@RequestBody Player player)
	{
		ResponseMessage responseMessage = playerValidator.addPlayer(player);
		if(responseMessage==null)
		{
			responseMessage= playerService.addPlayer(player);
		}
		return responseMessage;
	}
	
}
