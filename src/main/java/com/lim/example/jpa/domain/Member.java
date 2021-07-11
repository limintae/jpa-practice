package com.lim.example.jpa.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(builderMethodName = "MemberBuilder")
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "member_name")
    private String membername;

    public static MemberBuilder builder(int id, String name) {
        return MemberBuilder()
                .id(id)
                .membername(name);
    }

}
