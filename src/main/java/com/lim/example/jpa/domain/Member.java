package com.lim.example.jpa.domain;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "member")
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(builderMethodName = "MemberBuilder")
public class Member {

    @Id
    @Column(name = "member_id", columnDefinition = "BINARY(16)")
//    @Type(type="uuid-char")
    private UUID id;

    @Column(name = "member_name")
    private String membername;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}
