package com.example.mbsv3.Structure;

import java.util.ArrayList;

public class Cart {
    private Integer id;
    private Integer orderNr;
    private ArrayList<Movie> Movies = new ArrayList<>();
    private Double sum;

    public Cart(Integer id, Integer orderNr, ArrayList<Movie> movies, Double sum) {
        this.id = id;
        this.orderNr = orderNr;
        Movies = movies;
        this.sum = sum;
    }

    public Cart(Integer id, Integer orderNr, Double sum) {
        this.id = id;
        this.orderNr = orderNr;
        this.sum = sum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(Integer orderNr) {
        this.orderNr = orderNr;
    }

    public ArrayList<Movie> getMovies() {
        return Movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        Movies = movies;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
