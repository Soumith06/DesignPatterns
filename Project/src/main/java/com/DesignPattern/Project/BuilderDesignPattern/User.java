package com.DesignPattern.Project.BuilderDesignPattern;

public class User {

    private Long userId;
    private String userName;
    private String name;
    private String mobileNumber;
    private String emailId;
    private String address;

    public User(Long userId, String userName, String name, String mobileNumber, String emailId, String address) {
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.address = address;
    }

    public User() {
    }

    @Override
    public String toString(){
        return "User[userId=" + userId + ",userName=" + userName + ",name=" + name + ",mobileNumber=" + mobileNumber + ",emailId=" + emailId +",address=" + address + "]";
    }
}
