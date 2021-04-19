package com.ecw.cricketscore.service;

import com.ecw.cricketscore.entities.MatchScore;
import com.ecw.cricketscore.entities.Team;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TeamPojo;

public interface MatchScoreService {
	public ResponseMessage addMatchScore(MatchScore matchScore);
	public int countWicketOfMatchteam(MatchScore matchScore);
	public TeamPojo getTeamWiseScore(Team team);
}
