package com.ecw.cricketscore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecw.cricketscore.entities.Player;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.repository.PlayerRepository;
import com.ecw.cricketscore.service.PlayerService;

@Service
public class DefaultPlayerService implements PlayerService {

	@Autowired
	PlayerRepository playerRepository;

	@Override
	public ResponseMessage addPlayer(Player player) {
		playerRepository.save(player);
		return new ResponseMessage("Player add successfully",true);
	}

	
}
