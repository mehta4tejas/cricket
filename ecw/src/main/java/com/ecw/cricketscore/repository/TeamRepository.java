package com.ecw.cricketscore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecw.cricketscore.entities.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>
{
	
}
