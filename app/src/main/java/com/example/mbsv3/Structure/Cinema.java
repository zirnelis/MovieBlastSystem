package com.example.mbsv3.Structure;

public class Cinema {
    private Integer id;
    private String Name;
    private Double Lat;
    private Double Long;

    public Cinema(Integer id, String name, Double lat, Double aLong) {
        this.id = id;
        Name = name;
        Lat = lat;
        Long = aLong;
    }

    public Cinema(String name, Double lat, Double aLong) {
        Name = name;
        Lat = lat;
        Long = aLong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLong() {
        return Long;
    }

    public void setLong(Double aLong) {
        Long = aLong;
    }
}
