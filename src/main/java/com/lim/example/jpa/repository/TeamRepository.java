package com.lim.example.jpa.repository;

import com.lim.example.jpa.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface TeamRepository extends JpaRepository<Team, UUID> {

    @Query(value = "SELECT UUID()", nativeQuery = true)
    public String generateId();

}
