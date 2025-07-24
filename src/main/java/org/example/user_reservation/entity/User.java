package org.example.user_reservation.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // 초기화, final이라서 생성과 동시에 초기화 무조건
@Getter
public class User {
    private final String userId;
    private final String password;
    private final String name;
    private final String email;

}
