package com.ecw.cricketscore.validity;

import org.springframework.stereotype.Component;

import com.ecw.cricketscore.entities.Player;
import com.ecw.cricketscore.pojo.ResponseMessage;

@Component
public class PlayerValidator {
	public ResponseMessage addPlayer(Player player) {
		ResponseMessage responseMessage = new ResponseMessage();
		if (null == player.getName() || player.getName().trim().isEmpty()) {
			responseMessage.setMessage("Name is required");
			responseMessage.setResult(false);
			return responseMessage;
		}
		return null;
	}
}
