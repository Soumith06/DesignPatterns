package com.DesignPattern.Project.BuilderDesignPattern;

public class UserBuilder {

    private Long userId;
    private String userName;
    private String name;
    private String mobileNumber;
    private String emailId;
    private String address;

    public UserBuilder setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public UserBuilder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public UserBuilder setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public User getUser(){
        return new User(userId,userName,name,mobileNumber,emailId,address);
    }
}
