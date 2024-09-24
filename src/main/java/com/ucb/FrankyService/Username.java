package com.ucb.FrankyService;

import javax.naming.InvalidNameException;

public class Username {

    private final String nick;

    public Username(String nick) throws InvalidNameException {
        this.nick = nick;

        if(nick.length() > 10) {
            throw new InvalidNameException();
        }
    }

    public String asLowerCase() {
        return this.nick.toLowerCase();
    }
}
