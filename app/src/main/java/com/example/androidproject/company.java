package com.example.androidproject;

import androidx.room.Entity;

import com.google.gson.annotations.SerializedName;

//@Entity(tableName = "company")
public class company {
  //  @SerializedName("name")
    private String name;
   // @SerializedName("catchPhrase")
    private String catchPhrase;
   // @SerializedName("bs")
    private String bs;

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }
}
