package com.rizkynova.mybio.ClassPendukung;

public class MainModel {
    Integer UserImageFriend;
    String UserNameFriend;

    public MainModel(Integer UserImageFriend,String UserNameFriend){
        this.UserImageFriend = UserImageFriend;
        this.UserNameFriend = UserNameFriend;
    }

    public Integer getUserImageFriend() {
        return UserImageFriend;
    }

    public String getUserNameFriend() {
        return UserNameFriend;
    }
}
