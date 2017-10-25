package com.snehpandya.androidtesting;

import java.util.ArrayList;

/**
 * Created by sneh.pandya on 25/10/17.
 */

public class Names {

    private String name;

    public Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Names> createList() {
        ArrayList<Names> names = new ArrayList<>();

        names.add(new Names("A"));
        names.add(new Names("B"));
        names.add(new Names("C"));
        names.add(new Names("D"));
        names.add(new Names("E"));
        names.add(new Names("F"));
        names.add(new Names("G"));
        names.add(new Names("H"));
        names.add(new Names("I"));
        names.add(new Names("J"));
        names.add(new Names("K"));
        names.add(new Names("L"));
        names.add(new Names("M"));
        names.add(new Names("N"));
        names.add(new Names("O"));
        names.add(new Names("P"));
        names.add(new Names("Q"));
        names.add(new Names("R"));
        names.add(new Names("S"));
        names.add(new Names("T"));
        names.add(new Names("U"));
        names.add(new Names("V"));
        names.add(new Names("W"));
        names.add(new Names("X"));
        names.add(new Names("Y"));
        names.add(new Names("Z"));

        return names;
    }
}
