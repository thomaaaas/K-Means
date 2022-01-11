package com.company;

import java.util.Objects;

import static java.lang.Math.*;

public class Point {
    private double _x;
    private double _y;
    private Point _centroid;

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

    public Point get_centroid() {
        return _centroid;
    }

    public void set_centroid(Point centroid) {
        this._centroid = centroid;
    }

    public double distance(Point p) {
        return sqrt(pow(p.get_x() - this._x, 2) + pow(p.get_y() - _y, 2));
    }

    @Override
    public String toString() {
        if (_centroid != null) {
            return "Point{" + "_x=" + _x + ", _y=" + _y + ", _centroid=" + _centroid + '}';
        } else {
            return "Point{" + "_x=" + _x + ", _y=" + _y + '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point._x, _x) == 0 && Double.compare(point._y, _y) == 0 && Objects.equals(_centroid, point._centroid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_x, _y, _centroid);
    }
}