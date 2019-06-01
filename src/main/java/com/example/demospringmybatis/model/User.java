package com.example.demospringmybatis.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class User {
    private long id;
    private String userId;
    private String name;
    private String password;
    private String email;

    @Builder
    private User(long id, String userId, String name, String password, String email) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
