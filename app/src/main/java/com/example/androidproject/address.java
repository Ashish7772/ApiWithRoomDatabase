package com.example.androidproject;

import androidx.room.Entity;

import com.google.gson.annotations.SerializedName;

//@Entity(tableName = "address")
public class address {
    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

   // @SerializedName("street")
    private String street;
   // @SerializedName("suite")
    private String suite;
  //  @SerializedName("city")
    private String city;
  //  @SerializedName("zipcode")
    private String zipcode;

    public geo getGeo() {
        return geo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setGeos(geo geo) {
        this.geo = geo;
    }

    private geo geo;
}
