package com.example.mbsv3.Structure;

public class Movie {
    private Integer id;
    private String Name;
    private String Type;
    private Double TicketPrice;
    private String Desc;

    public Movie(Integer id, String name, String type, Double ticketPrice, String desc) {
        this.id = id;
        Name = name;
        Type = type;
        TicketPrice = ticketPrice;
        Desc = desc;
    }

    public Movie(String name, String type, Double ticketPrice) {
        Name = name;
        Type = type;
        TicketPrice = ticketPrice;
    }

    public Movie(String name, String type, Double ticketPrice, String desc) {
        Name = name;
        Type = type;
        TicketPrice = ticketPrice;
        Desc = desc;
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

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Double getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        TicketPrice = ticketPrice;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
