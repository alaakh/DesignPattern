package com.fuzzy;

import java.util.Hashtable;

public class FuzzyInput {
    public FuzzyInput() {
        inputList = new Hashtable <CrispInput,Float>();
    }
    protected Hashtable <CrispInput,Float> inputList;


    public void add(CrispInput in, float value) {
        inputList.put(in, value);
    }

    public Hashtable<CrispInput, Float> getInputList() {
        return inputList;
    }
}

