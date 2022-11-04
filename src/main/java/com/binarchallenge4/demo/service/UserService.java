package com.binarchallenge4.demo.service;

import com.binarchallenge4.demo.Entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> CariSemuaUser();
    Optional<UserEntity> CariDariID(Long id);
    UserEntity SimpanUser(UserEntity UserEntity);
    UserEntity updateUser(Long id, UserEntity UserEntity);
    String deleteUser(Long id);



}
