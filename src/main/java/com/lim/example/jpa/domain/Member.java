package com.lim.example.jpa.domain;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "member")
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(builderMethodName = "MemberBuilder")
public class Member {

    @Id
    @Column(name = "member_id")
    private UUID id;

    @Column(name = "member_name")
    private String membername;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
