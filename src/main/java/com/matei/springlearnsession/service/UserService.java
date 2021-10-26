package com.matei.springlearnsession.service;

import com.matei.springlearnsession.model.entity.UserRecord;
import com.matei.springlearnsession.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserRecord> getAllUsers(){
        return (List<UserRecord>) userRepository.findAll();
    }

    public void addUser(UserRecord userRecord){
        userRepository.save(userRecord);
    }

    public UserRecord getUserByName(String name) {
        return userRepository.findByName(name);
    }
}



