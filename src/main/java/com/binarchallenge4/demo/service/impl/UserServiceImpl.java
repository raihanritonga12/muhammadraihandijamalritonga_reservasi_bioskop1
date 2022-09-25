package com.binarchallenge4.demo.service.impl;

import com.binarchallenge4.demo.Entity.UserEntity;
import com.binarchallenge4.demo.service.UserService;
import org.springframework.stereotype.Service;
import com.binarchallenge4.demo.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public List<UserEntity> CariSemuaUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> CariDariID(Long user_id) {
        return userRepository.findById(user_id);
    }

    @Override
    public UserEntity SimpanUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(Long id,UserEntity userEntity) {
        UserEntity UserEntityUpdate=userRepository.findById(id).get();
        UserEntityUpdate.setUsername(userEntity.getUsername());
        UserEntityUpdate.setPassword(userEntity.getPassword());
        UserEntityUpdate.setEmail(userEntity.getEmail());
        return userRepository.save(UserEntityUpdate);
    }



    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User Has Been Deleted";
    }
}
