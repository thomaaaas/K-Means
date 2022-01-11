package com.company;

import static java.lang.Math.*;

public class Point {
    private double _x;
    private double _y;

    public Point(double x, double y) {
        this._x = x;
        this._y = y;
    }

    public double get_x() {
        return _x;
    }

    public void set_x(double x) {
        this._x = x;
    }

    public double get_y() {
        return _y;
    }

    public void set_y(double y) {
        this._y = y;
    }

    public double distance(Point p) {
        return sqrt(pow(p.get_x() - this._x, 2) + pow(p.get_y() - _y, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "_x=" + _x +
                ", _y=" + _y +
                '}';
    }
}