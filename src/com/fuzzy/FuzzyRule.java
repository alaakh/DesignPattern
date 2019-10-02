package com.fuzzy;

import java.util.Hashtable;
import java.util.Vector;

public class FuzzyRule {
    public FuzzyRule() {
        conditionList = new Vector<Condition>();
    }
    protected Vector<Condition> conditionList;
    protected String action;
    //Condition condition;
    public String toString() {
      String result ="";
      int i = 0;
      for (Condition condition:conditionList) {
      i++;
      if(i==1)
        result += "IF ";
      else
        result += " AND ";
      result+= "( "+ condition.getMyLabel().getName() +" ) ";
      }
        result+= " THEN " +action;
      return result;
    }
    
    
    protected float getDegreeOfTruth(FuzzyInput fuzzyInput ) {

    
        float check = 100;

        for (Condition condition:conditionList) {
            float r = condition.getDegreeOfTruth(fuzzyInput);
            if(check>r) {
                check = r;
            }
            
        }        
        return check;
    }

    public void addCondition(Label label) {
        Condition condition = new Condition();
        condition.setMyLabel(label);
        conditionList.add(condition);
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}

