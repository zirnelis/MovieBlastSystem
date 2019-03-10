package com.example.mbsv3.Structure;

import android.nfc.tech.NfcA;

public class Hall {
    private Integer id;
    private String Name;
    private Integer Row;
    private Integer Col;

    public Hall(Integer id, String name, Integer row, Integer col) {
        this.id = id;
        Name = name;
        Row = row;
        Col = col;
    }

    public Hall(String name, Integer row, Integer col) {
        Name = name;
        Row = row;
        Col = col;
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

    public Integer getRow() {
        return Row;
    }

    public void setRow(Integer row) {
        Row = row;
    }

    public Integer getCol() {
        return Col;
    }

    public void setCol(Integer col) {
        Col = col;
    }
}
