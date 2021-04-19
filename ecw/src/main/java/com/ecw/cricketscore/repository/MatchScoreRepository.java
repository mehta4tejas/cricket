package com.ecw.cricketscore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecw.cricketscore.entities.MatchScore;

@Repository
public interface MatchScoreRepository extends JpaRepository<MatchScore, Long>
{
	 @Query("SELECT COUNT(Id) FROM MatchScore WHERE match.id=:matchId and tournamentTeamPlayer.tournamentTeam=:tournamentTeamId and isOut=1")
	 long wicketCount(@Param("matchId") int matchId,@Param("tournamentTeamId") int tournamentTeamId);
	
}
