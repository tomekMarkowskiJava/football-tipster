package com.TMT.model.matches;

import com.TMT.model.users.Profile;

import java.util.List;


public class Api {
    List<Fixture> fixtures;
    int results;


    public Api() {
    }

    public List<Fixture> getFixtures() {
        return fixtures;
    }

    public void setFixtures(List<Fixture> fixtures) {
        this.fixtures = fixtures;
    }


}
