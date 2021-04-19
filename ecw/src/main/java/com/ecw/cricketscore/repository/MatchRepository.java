package com.ecw.cricketscore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecw.cricketscore.entities.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long>
{
	
}
