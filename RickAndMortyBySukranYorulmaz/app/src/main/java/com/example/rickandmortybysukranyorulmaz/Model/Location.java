package com.example.rickandmortybysukranyorulmaz.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("name")
    @Expose
    private String locationname;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("dimension")
    @Expose
    private String dimension;

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
}
