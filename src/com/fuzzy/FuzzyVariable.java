package com.fuzzy;

import java.util.Vector;

public class FuzzyVariable {
    public FuzzyVariable(CrispInput crisp) {
        this.crispInput = crisp;
        labels = new Vector<Label>();
    }
    protected Vector<Label> labels;
    CrispInput crispInput;

    public FuzzificationResult getFuzzificationResult(float input) {
        FuzzificationResult fR = new FuzzificationResult();
        float dOfMembership = 0;
        for (int i = 0; i < labels.size(); i++) {
            Label label = labels.get(i);
            dOfMembership = 
                    label.getMemberShipFunction().getDegreeOfMemberShip(input);
            fR.addList(label, dOfMembership);

        }
        return fR;

    }

    public void addLabel(Label label) {
        labels.add(label);
        label.setFuzzyVariable(this);
    }

    public void setCrispInput(CrispInput crispInput) {
        this.crispInput = crispInput;
    }

    public CrispInput getCrispInput() {
        return crispInput;
    }
}

