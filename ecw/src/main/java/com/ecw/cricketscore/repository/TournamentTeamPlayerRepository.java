package com.ecw.cricketscore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecw.cricketscore.entities.TournamentTeamPlayer;

@Repository
public interface TournamentTeamPlayerRepository extends JpaRepository<TournamentTeamPlayer, Long>
{
}
