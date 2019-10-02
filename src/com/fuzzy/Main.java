package com.fuzzy;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(30);
        Point p2 = new Point();
        p2.setX(40);
        Point p3 = new Point();
        p3.setX(50);
        Point p4 = new Point();
        p4.setX(60);
        Point p5 = new Point();
        p5.setX(20);
        Point p6 = new Point();
        p6.setX(30);
        Point p7 = new Point();
        p7.setX(40);
        Point p8 = new Point();
        p8.setX(50);
        Point p9 = new Point();
        p9.setX(30);
        TraposidialFunction t1=new TraposidialFunction();
        t1.setStart(p1);
        t1.setPeak1(p2);
        t1.setPeak2(p3);
        t1.setEnd(p4);
        TraposidialFunction t2=new TraposidialFunction();
        t2.setStart(p5);
        t2.setPeak1(p6);
        t2.setPeak2(p7);
        t2.setEnd(p8);
        Function f1 = new TraposidialFunction();
        f1=t1;
        Function f2 = new TraposidialFunction();
        Function f3 = new TraposidialFunction();
        f3=t2;
        Function f4 = new TriangularFunction();
        Function f5 = new TraposidialFunction();
        Label cold = new Label();
        cold.setMemberShipFunction(f1);
        
        cold.setName("cold");
        
        Label hot = new Label();

        hot.setMemberShipFunction(f2);

        Label dry = new Label();
        dry.setName("dry");
        dry.setMemberShipFunction(f3);
        Label mild = new Label();
        mild.setMemberShipFunction(f4);
        Label wet = new Label();
        wet.setMemberShipFunction(f5);

        CrispInput input1 = new CrispInput("tempeture");
        FuzzyVariable temp = new FuzzyVariable(input1);
        temp.addLabel(cold);
        temp.addLabel(hot);

        CrispInput input2 = new CrispInput("humidity");
        FuzzyVariable humd = new FuzzyVariable(input2);
        humd.addLabel(dry);
        humd.addLabel(mild);
        humd.addLabel(wet);

        FuzzyRule rule1 = new FuzzyRule();
        rule1.addCondition(dry);
        rule1.addCondition(cold);
        rule1.setAction("Start Fan");
        //        
        //        FuzzyRule rule2=new FuzzyRule();
        //        rule2.addCondition(dry);
        //        rule2.addCondition(hot);
        //        
        //        FuzzyRule rule3=new FuzzyRule();
        //        rule3.addCondition(mild);
        //        rule3.addCondition(cold);
        //        
        //        FuzzyRule rule4=new FuzzyRule();
        //        rule4.addCondition(mild);
        //        rule4.addCondition(hot);
        //        
        //        FuzzyRule rule5=new FuzzyRule();
        //        rule5.addCondition(wet);
        //        rule5.addCondition(cold);
        //        
        //        FuzzyRule rule6=new FuzzyRule();
        //        rule6.addCondition(wet);
        //        rule6.addCondition(hot);
        //        
        FuzzyInput inputList = new FuzzyInput();
        inputList.add(input1, 39);
        inputList.add(input2, 27);
        //        
        RuleManger manager = new RuleManger();
        manager.registerRule(rule1);
        manager.eval(inputList);
        //        


    }
}
