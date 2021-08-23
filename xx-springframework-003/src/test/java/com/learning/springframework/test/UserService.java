package com.learning.springframework.test;

public class UserService {

    private String username;

    public UserService(String username){
        this.username = username;
    }

    public Integer queryEmployeeAge(){
        System.out.println(username + ", 执行UserService#queryEmployeeAge");
        return 20;
    }

}
