package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

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

    public double distance(Point point){
        return (Math.sqrt(((this.x - point.getX())*(this.x - point.getX())) + ((this.y - point.getY()) * (this.y - point.getY()))));
    }

    public double distance(){
        Point point = new Point(0, 0);
        return distance(point);
    }

    public double distance(int x, int y){
        Point point = new Point(x, y);
        return distance(point);
    }
}
