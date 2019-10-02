package com.fuzzy;

public class TriangularFunction extends Function {
    public TriangularFunction() {
    }
    
    protected Point start;
    protected Point end;
    protected Point peak;

        protected float getDegreeOfMemberShip(float input){
        float u=0;
        if (input>start.getX()&&input<peak.getX()){
        u=(input-start.getX())/(peak.getX()-start.getX());}
        else if(input<end.getX()){
            u=((peak.getX()-input)/(end.getX()-peak.getX())+1);
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

    public void setPeak(Point peak) {
        this.peak = peak;
    }

    public Point getPeak() {
        return peak;
    }
    }

    