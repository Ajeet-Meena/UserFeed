package com.galleri5.userfeed.Model;

import java.util.ArrayList;

/**
 * Created by Ajeet Kumar Meena on 22-11-2015.
 */
public class UserFeed {
    private String userName;
    String profileURL;
    private ArrayList<UserPost> userPosts;
    private int overallXScroll = 0;
    private int mutualFriends;
    private int timeAgo;


    public UserFeed(String userName, String profileURL, int mutualFriends, int timeAgo, ArrayList<UserPost> userPosts) {
        this.userPosts = userPosts;
        this.userName = userName;
        this.profileURL = profileURL;
        this.mutualFriends = mutualFriends;
        this.timeAgo = timeAgo;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public String getTimeAgo() {
        return timeAgo + " minute remaining";
    }

    public String getMutualFriends() {
        return mutualFriends + " mutual friends";
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<UserPost> getUserPosts() {
        return userPosts;
    }

    public int getOverallXScroll() {
        return overallXScroll;
    }

    public void setOverallXScroll(int overallXScroll) {
        this.overallXScroll = overallXScroll;
    }

}
