package com.lim.example.jpa.repository;

import com.lim.example.jpa.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {

    @Query(value = "SELECT UUID()", nativeQuery = true)
    public String generateMemberId();

}
