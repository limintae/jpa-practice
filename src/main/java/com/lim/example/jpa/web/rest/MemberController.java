package com.lim.example.jpa.web.rest;

import com.lim.example.jpa.domain.Member;
import com.lim.example.jpa.domain.MemberAddress;
import com.lim.example.jpa.domain.Team;
import com.lim.example.jpa.repository.MemberAddressRepository;
import com.lim.example.jpa.repository.MemberRepository;
import com.lim.example.jpa.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberRepository memberRepository;
    private final MemberAddressRepository memberAddressRepository;
    private final TeamRepository teamRepository;

    @GetMapping("/member/{memberId}")
    public String selectMember(@PathVariable("memberId") String memberId) {
        Optional<Member> member = memberRepository.findById(UUID.fromString(memberId));
        return member.get().getMembername();
    }

    @GetMapping("/member/addr/{memberId}")
    public String selectMemberAddress(@PathVariable("memberId") String memberId) {
        Optional<MemberAddress> memberAddress = memberAddressRepository.findById(UUID.fromString(memberId));
        return memberAddress.get().getMemberAddress();
    }

    @PostMapping("/member")
    public boolean createMember() {
        Optional<Team> team = teamRepository.findById(UUID.fromString("a16917c5-eece-11eb-aa09-fcaa14e48102"));
        String memberId = memberRepository.generateMemberId();
        Member member = Member.MemberBuilder()
                .id(UUID.fromString(memberId))
                .membername("limintae")
                .team(team.get())
                .createdAt(LocalDateTime.now())
                .build();
        memberRepository.save(member);

        MemberAddress memberAddress = MemberAddress.builder()
                .id(member.getId())
                .memberAddress("bundang")
                .createdAt(LocalDateTime.now())
                .build();
        memberAddressRepository.save(memberAddress);
        return true;
    }

    @PostMapping("/team")
    public boolean createTeam() {
        String strTeamId = teamRepository.generateId();
        Team team = Team.builder()
                .id(UUID.fromString(strTeamId))
                .teamName("lim_team")
                .createdAt(LocalDateTime.now())
                .build();
        UUID teamId = teamRepository.save(team).getId();
        log.info("teamId is : " + teamId.toString());
        return true;
    }

}
