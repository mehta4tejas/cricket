package com.ecw.cricketscore.service;

import java.util.List;

import com.ecw.cricketscore.entities.Team;
import com.ecw.cricketscore.entities.TournamentTeamPlayer;
import com.ecw.cricketscore.pojo.ResponseMessage;
import com.ecw.cricketscore.pojo.TeamPojo;

public interface TeamService {
	public ResponseMessage addTeam(Team team);
	public List<Team> getAllTeam();
	public Team findTeamById(int id);
	public ResponseMessage assignPlayer(TeamPojo team);
	public TournamentTeamPlayer getTournamentTeamPlayerById(int id);
}
