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

    public Pattern findPattern(String name, String category) throws CategoryException {
        Pattern result = patternsRepository.findByName(name);
        if(!result.getCategory().equalsIgnoreCase(category)){
            throw new CategoryException("The design pattern doesn't have the category specified.");
        }
        return result;
    }

}
