package com.ecw.cricketscore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecw.cricketscore.entities.Match;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.repository.MatchRepository;
import com.ecw.cricketscore.service.MatchService;

@Service
public class DefaultMatchService implements MatchService {

	@Autowired
	MatchRepository matchRepository;

	@Override
	public ResponseMessage addMatch(Match match) {
		matchRepository.save(match);
		return new ResponseMessage("Match add successfully",true);
	}

}
