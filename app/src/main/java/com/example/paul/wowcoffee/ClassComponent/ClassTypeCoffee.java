package com.example.paul.wowcoffee.ClassComponent;

/**
 * Created by Paul on 31/03/2017.
 * Edit by Paul on 31/03/2017.
 */

public class ClassTypeCoffee {
    private String nameCf;
    private int Spice;

    public ClassTypeCoffee(String nameCf, int spice) {
        this.nameCf = nameCf;
        Spice = spice;
    }

    public void setNameCf(String nameCf) {
        this.nameCf = nameCf;
    }

    public String getNameCf() {
        return nameCf;
    }

    public void setSpice(int spice) {
        Spice = spice;
    }

    public int getSpice() {
        return Spice;
    }
}
