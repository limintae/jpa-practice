package com.lim.example.jpa.repository;

import com.lim.example.jpa.domain.MemberAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberAddressRepository extends JpaRepository<MemberAddress, UUID> {
}
