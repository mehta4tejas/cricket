package com.ecw.cricketscore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecw.cricketscore.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>
{
	
}
