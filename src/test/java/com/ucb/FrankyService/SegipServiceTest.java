package com.ucb.FrankyService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SegipServiceTest {

    @Test
    @DisplayName("user doesn't exists")
    public void testCiDoesntExist() {
        UserRepository userRepository = new UserRepository();
        //arrange
        SegipService segipService = new SegipService(userRepository);
        User user = new User(
                "Judith Margarita",
                "Paco",
                "13416598",
                "28/12/2002",
                "07/05/2018",
                "13/02/2025"
        );
        String ci = "13416598";

        //act
        ArrayList<User> users = segipService.findByCi(ci);

        //assert
        assertEquals(3, users.size());
    }
}