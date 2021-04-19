package com.ecw.cricketscore.service;

import com.ecw.cricketscore.entities.Player;
import com.ecw.cricketscore.pojo.ResponseMessage;

public interface PlayerService {
	public ResponseMessage addPlayer(Player player);
}
