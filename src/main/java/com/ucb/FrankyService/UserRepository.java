package com.ucb.FrankyService;


import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class UserRepository {
    static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User(
                "Judith Margarita",
                "Paco",
                "13416598",
                "28/12/2002",
                "07/05/2018",
                "13/02/2025"
        ));
        users.add(new User(
                "Aylen",
                "Gonzales",
                "13416598",
                "28/12/2002",
                "07/05/2018",
                "13/02/2025"
        ));
        users.add(new User(
                "Melany Evelin",
                "Torrico",
                "13416598",
                "28/12/2002",
                "07/05/2018",
                "13/02/2025"
        ));
    }
    public ArrayList<User> findUserByCi(String ci) {
        return  users.stream().filter(user -> user.getCi().equals(ci))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
