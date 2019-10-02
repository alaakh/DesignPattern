
package com.fuzzy;

import java.util.Hashtable;

public class FuzzificationResult {
    public FuzzificationResult() {
    }
    
    protected  Hashtable<Label,Float> resultList;
    public void addList(Label label,float dOfMembership ){
    resultList.put(label,dOfMembership);
    }
}
