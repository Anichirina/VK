package ru.netology.domain;

public class Geoinfo {
    private String type;
    private String coordinates;
    private PlaceInfo place;

    public String getType() {
        return type;

    }

    public void setType(String type) {
        this.type = type;
    }

    public PlaceInfo getPlace() {
        return place;
    }

    public void setPlace(PlaceInfo place) {
        this.place = place;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}
