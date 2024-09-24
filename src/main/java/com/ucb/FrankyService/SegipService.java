package com.ucb.FrankyService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SegipService {

    UserRepository userRepository;
    public SegipService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public ArrayList<User> findByCi(String ci){
        return this.userRepository.findUserByCi(ci);
    }

}
