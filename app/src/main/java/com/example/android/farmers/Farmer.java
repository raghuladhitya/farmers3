package com.example.android.farmers;

public class Farmer {
    private String name, description, Details;
    private String Stock;
    private String profilePic, Location;


    public Farmer(String Location, String description, String Details,String name, String profilePic, String Stock) {
        this.name = name;

        this.Location = Location;
        this.description = description;
        this.profilePic = profilePic;
        this.Stock = Stock;

        this.Details = Details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

}
