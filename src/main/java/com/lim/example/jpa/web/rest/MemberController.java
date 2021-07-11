package com.lim.example.jpa.web.rest;

import com.lim.example.jpa.domain.Team;
import com.lim.example.jpa.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final TeamRepository teamRepository;

    @PostMapping("/team")
    public boolean createTeam() {
        Team team = Team.builder().teamname("lim_team").build();
        Long teamId = teamRepository.save(team).getId();
        log.info("teamId is : " + teamId);
        return true;
    }

}
