package com.fuzzy;

public abstract class Function {
    public Function() {
    }
    Point p;
    protected abstract float getDegreeOfMemberShip(float input);
    
    
    protected void setAlphaCuttoff(float alpha){
    }
}
