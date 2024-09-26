package com.ucb.FrankyService;

import org.springframework.stereotype.Service;

@Service
public class PatternsService {

    PatternsRepository patternsRepository;
    public PatternsService(PatternsRepository patternsRepository) {
        this.patternsRepository = patternsRepository;
    }

    public PatternsRepository getPatternsRepository() {
        return patternsRepository;
    }

    public Pattern findByName(String name){
        return patternsRepository.findByName(name);
    }

}
