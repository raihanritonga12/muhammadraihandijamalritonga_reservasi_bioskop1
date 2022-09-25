package com.binarchallenge4.demo.Controller;

import com.binarchallenge4.demo.Entity.UserEntity;
import com.binarchallenge4.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/buat")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity create(@RequestBody UserEntity user){
        return userService.SimpanUser(user);
    }
    @GetMapping("/ambilSemua")
    public List<UserEntity> getall(){
        return userService.CariSemuaUser();
    }
    @PutMapping("/update/{id}")
    public UserEntity update(@PathVariable Long id, @RequestBody UserEntity user){
        return userService.updateUser(id,user);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return userService.deleteUser(id);
    }




}
