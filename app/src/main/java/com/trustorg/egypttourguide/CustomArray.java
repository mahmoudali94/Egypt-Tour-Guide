package com.trustorg.egypttourguide;

public class CustomArray {

    private int highText;
    private int smallText;
    private int photoID;

    public CustomArray(int highText, int smallText, int photoID) {
        this.highText = highText;
        this.smallText = smallText;
        this.photoID = photoID;
    }

    public int getHighText() {
        return highText;
    }

    public int getSmallText() {
        return smallText;
    }

    public int getPhotoID() {
        return photoID;
    }
}
