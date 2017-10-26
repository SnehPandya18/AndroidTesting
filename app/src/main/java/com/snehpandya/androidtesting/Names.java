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

    public static ArrayList<Names> createList() {
        ArrayList<Names> names = new ArrayList<>();

        for (char alphabets = 'A'; alphabets <= 'Z'; alphabets++)
            names.add(new Names(String.valueOf(alphabets)));

        for (char alphabets = 'a'; alphabets <= 'z'; alphabets++)
            names.add(new Names(String.valueOf(alphabets)));

        return names;
    }
}
