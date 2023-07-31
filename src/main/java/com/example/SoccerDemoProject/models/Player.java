package com.example.SoccerDemoProject.models;

import javax.persistence.Entity;

@Entity
public class Player extends AbstractEntity {


    private String name;

    private int goals;

    private String profilePic;
    public Player(String name, int goals, String profilePic){
        this.name = name;
        this.goals = goals;
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
