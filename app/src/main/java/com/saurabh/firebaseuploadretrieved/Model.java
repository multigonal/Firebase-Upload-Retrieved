package com.saurabh.firebaseuploadretrieved;

public class Model {

    private  String imageUrl;
    private String mName;

    public Model(){

    }

    public Model(String imageUrl , String mName ){


        this.imageUrl = imageUrl;
        this.mName = mName;
    }

    public String getName() {
        return mName;
    }
    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
