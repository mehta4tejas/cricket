package com.ecw.cricketscore.service;

import com.ecw.cricketscore.entities.Match;
import com.ecw.cricketscore.pojo.ResponseMessage;

public interface MatchService {
	public ResponseMessage addMatch(Match match);
}
