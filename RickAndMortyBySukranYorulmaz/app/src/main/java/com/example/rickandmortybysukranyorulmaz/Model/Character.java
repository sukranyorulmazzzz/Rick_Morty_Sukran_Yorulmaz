package com.example.rickandmortybysukranyorulmaz.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Character {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("status")
    @Expose
    private String status;


   @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("species")
    @Expose
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
