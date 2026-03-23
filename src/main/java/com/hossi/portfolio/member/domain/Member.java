package com.hossi.portfolio.member.domain;

import lombok.Getter;

@Getter
public class Member {
    private Long id;
    private String loginId;
    private String nickname;
    private String password;
}
