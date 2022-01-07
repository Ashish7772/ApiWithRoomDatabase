package com.example.androidproject;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "UserDetails")
public class UserDetails {
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public address getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setCompany(company company) {
        this.company = company;
    }


    @PrimaryKey(autoGenerate = true)
    private int userid;
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("website")
    private String website;

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public company getCompany() {
        return company;
    }

  //  @SerializedName("address")
    private address address;
   // @SerializedName("company")
    private company company;

    @Override
    public String toString() {
        return "UserDetails{" +
                "userid=" + userid +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", address=" + address +
                ", company=" + company +
                '}';
    }
}
