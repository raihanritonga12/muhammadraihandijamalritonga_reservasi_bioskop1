package com.binarchallenge4.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name= "nt_Username")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long user_id;
    @Column(name = "Username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
}

