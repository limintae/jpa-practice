package com.lim.example.jpa.repository;

import com.lim.example.jpa.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
