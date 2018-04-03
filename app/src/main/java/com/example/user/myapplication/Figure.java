package com.example.user.myapplication;

import io.realm.RealmObject;

/**
 * Created by student on 03.04.18.
 */

public class Figure extends RealmObject{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
