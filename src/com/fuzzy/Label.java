package com.fuzzy;

public class Label {
    public Label() {
    }
   Function memberShipFunction ;
    protected float startRange;
    protected float endRange;
    protected String name;
    protected String shape;
    protected FuzzyVariable fuzzyVariable;
    
    protected Boolean inRange(float crispInput){
    boolean check=false;
    if(crispInput>=startRange && crispInput<=endRange){
        check=true;
    }return check;
    
    
    }

    public void setStartRange(float startRange) {
        this.startRange = startRange;
    }

    public float getStartRange() {
        return startRange;
    }

    public void setEndRange(float endRange) {
        this.endRange = endRange;
    }

    public float getEndRange() {
        return endRange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setMemberShipFunction(Function memberShipFunction) {
        this.memberShipFunction = memberShipFunction;
    }

    public Function getMemberShipFunction() {
        return memberShipFunction;
    }
    
    public void setFuzzyVariable(FuzzyVariable var) {
        fuzzyVariable = var;
    }

    public FuzzyVariable getFuzzyVariable() {
        return fuzzyVariable;
    }
}
