package com.company;

public class Point {

    private double x = 0;
    private double y = 0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void FlipVertical() {
    this.x = -x;
    }

    public void FlipHorizontal() {
    this.y = -y;
    }

    public void Translate(double xChange, double yChange){
    x=x+xChange;
    y=y+yChange;

    }
}
