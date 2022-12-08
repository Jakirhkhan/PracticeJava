package com.eu.training.practice.constructor;

public class UserService {

    public String getName() {
        return "Administrator";
    }

    public String []getAllNames(){

        String []names = {"Administrator","Report User", "General User"};
        return names;
    }

}
