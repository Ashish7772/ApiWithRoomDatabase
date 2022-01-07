package com.example.androidproject;

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

    public void setAddresses(address address) {
        this.address = address;
    }

    public void setCompanies(company company) {
        this.company = company;
    }

    private String id;
    private String name;
    private String username;
    private String email;
    private String phone;
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

    private address address;
    private company company;
}
