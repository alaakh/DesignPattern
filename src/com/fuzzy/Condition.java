package com.fuzzy;

import java.util.Enumeration;
import java.util.Hashtable;

public class Condition {
    public Condition() {
    
    }
   //FuzzificationResult fR=new FuzzificationResult();
    Label myLabel;
//     Function myFunction;
    protected float getDegreeOfTruth( FuzzyInput inputList)
    {
      if(myLabel == null)
     {  System.out.println("Condition::myLabel is null");
      return 0;
     }
      CrispInput input =  myLabel.getFuzzyVariable().getCrispInput();
      Hashtable<CrispInput,Float> data =inputList.getInputList();
      Enumeration en =data.keys();
      CrispInput key;
      float value = 0;
      while(en.hasMoreElements()) {
          key = (CrispInput) en.nextElement();
          if(key == input)
              value  = data.get(key);
      }
      
//        myFunction.getDegreeOfMemberShip(crispInput);
      Function myFunction= myLabel.getMemberShipFunction(); 
       float dom= myFunction.getDegreeOfMemberShip(value);
       //fR.addList(myLabel,dom);
        return dom;
    }


    public void setMyLabel(Label myLabel) {
        this.myLabel = myLabel;
    }

    public Label getMyLabel() {
        return myLabel;
    }

}
