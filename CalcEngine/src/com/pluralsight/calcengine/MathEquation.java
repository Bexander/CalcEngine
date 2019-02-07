package com.pluralsight.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result; //result is the result of the class doing what it does, executing an operation, hence being read only

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}

    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}

    public char getOpCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public double getResult() {return result;}

    public MathEquation(){}//old code is now working

    public MathEquation(char opCode){//constructor with a single argument
        this.opCode = opCode;//then assign that parameter to our field opCode
    }
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);//chained from previous constructor
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

public void execute(double leftVal, double rightVal){
    this.leftVal = leftVal;
    this.rightVal = rightVal;

    execute();
}

    public void execute(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
        result = (int)result;//casting it ton an int
    }

public void execute(){
    switch(opCode){
//replace val1 with leftVals[i] and val2 with rightVals[i]
        case 'a':
            result = leftVal + rightVal; break;
        case 's' :
            result = leftVal - rightVal; break;
        case'd': {
            result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;  //If result is not equal to 0, divide stuff, otherwise return 0
           /*  if(val2 != 0.0d)      //The above line
                result = val1 / val2; // replaces
             else                      // all this stuff
                 result = 0.0d; */      //Normally it would be {blocked} in
            break;
        }//add blocks for readability, free choice
        case 'm':
            result = leftVal * rightVal; break;
        default :
            System.out.println("Error - invalid opCode");
            result = 0.0d;
            break;
    }
}

}
