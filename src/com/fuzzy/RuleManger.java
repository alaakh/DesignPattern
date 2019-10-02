package com.fuzzy;

import java.util.Hashtable;
import java.util.Vector;

public class RuleManger {
    public RuleManger() {
        rules = new Vector<FuzzyRule>();
    }
    protected Vector <FuzzyRule> rules;
//    protected Vector <FuzzyVariable> variableList;
public void registerRule( FuzzyRule fuzzyRule)
    {
        rules.add(fuzzyRule);
    }

public void eval(FuzzyInput fuzzyInput)

    {
        //float degree=fuzzyInput.inputList.get();
        for(FuzzyRule rule:rules) {
            float result = rule.getDegreeOfTruth(fuzzyInput);
            System.out.println(rule+" = "+ result);
        }
        
    }

}
