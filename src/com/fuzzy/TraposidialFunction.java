package com.fuzzy;

public class TraposidialFunction extends Function {
    public TraposidialFunction() {
    }

    protected Point start;
    protected Point end;
    protected Point peak1;
    protected Point peak2;
     
    protected float getDegreeOfMemberShip(float input) {
//        if (true)
//            return 30;
        float u = 0;
        if (input > start.getX() && input < peak1.getX()) {
            u = (input - start.getX()) / (peak1.getX() - start.getX());
        } else if (input < end.getX() && input > peak2.getX()) {
            u = ((peak2.getX() - input) / (end.getX() - peak2.getX()) + 1);
        } else if (input >= peak1.getX() && input <= peak2.getX()) {
            u = 1;
        }
        return u;

    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getStart() {
        return start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }

    public void setPeak1(Point peak1) {
        this.peak1 = peak1;
    }

    public Point getPeak1() {
        return peak1;
    }

    public void setPeak2(Point peak2) {
        this.peak2 = peak2;
    }

    public Point getPeak2() {
        return peak2;
    }
}
