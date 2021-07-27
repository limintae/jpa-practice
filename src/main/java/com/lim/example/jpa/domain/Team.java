package com.lim.example.jpa.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "team")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Team {

    @Id
    @Column(name = "team_id")
    private UUID id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
