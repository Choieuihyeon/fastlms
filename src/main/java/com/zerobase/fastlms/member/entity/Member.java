package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Member implements MemberCode {
    @Id
    private String userId;

    private String userName;
    private String passwrod;
    private String phone;
    private LocalDateTime regDt;
    private LocalDateTime udtDt;    // 회원정보 수정일

    private boolean emailAuthYn;
    private LocalDateTime emailAuthDt;
    private String emailAuthKey;

    private String resetPasswordKey;
    private LocalDateTime resetPasswordLimitDt;

    private boolean adminYn;

    private String userStatus;  // 이용가능한 상태, 정지 상태

    private String zipcode;
    private String addr;
    private String addrDetail;


    // 관리자 여부를 지정할꺼냐?
    // 회원에 따른 ROLE을 지정할꺼냐???
    // 준회원/정회원/특별회원/관리자
    // ROLE_SEMI_USER/ROLE_USER/ROLE_SPECIAL_USER/ROLE_ADMIN

    // 준회원/정회원/특별회원
    // 관리자???
    // private
}
