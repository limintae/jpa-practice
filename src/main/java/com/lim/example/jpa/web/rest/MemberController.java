package com.lim.example.jpa.web.rest;

import com.lim.example.jpa.domain.Member;
import com.lim.example.jpa.domain.Team;
import com.lim.example.jpa.repository.MemberRepository;
import com.lim.example.jpa.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    @GetMapping("/member/{memberId}")
    public String selectMember(@PathVariable("memberId") String memberId) {
        Optional<Member> member = memberRepository.findById(UUID.fromString(memberId));
        return member.get().getMembername();
    }

    @PostMapping("/member")
    public boolean createMember() {
        long teamId = 1;
        Optional<Team> team = teamRepository.findById(teamId);
        String uuid = memberRepository.generateMemberId();
        Member member = Member.MemberBuilder().id(UUID.fromString(uuid)).membername("limintae").team(team.get()).build();
        memberRepository.save(member);
        return true;
    }

    @PostMapping("/team")
    public boolean createTeam() {
        Team team = Team.builder().teamname("lim_team").build();
        Long teamId = teamRepository.save(team).getId();
        log.info("teamId is : " + teamId);
        return true;
    }



}
