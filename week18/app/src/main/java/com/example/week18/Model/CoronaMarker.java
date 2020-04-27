package com.example.week18.Model;

public class CoronaMarker {

    private String title;
    private double lat;
    private double lon;
    private String status;

    public CoronaMarker(String title, double lat, double lon, String status) {
        this.title = title;
        this.lat = lat;
        this.lon = lon;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
