package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        //parallel arrays -start
        //First member in each array corresponds to the first member in the other arrays.
        //double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d}; // adding int[] turns int into an array
        //double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        //char[] opCodes = {'d','a','s','m'};
        //double[] results = new double[opCodes.length]; //create empty storage space to fill it. Same size slots as opCodes
     //paralell arrays - end

        //The class is used to create the new and better array list
      /*
        MathEquation testEquation = new MathEquation();
        testEquation.execute();
        System.out.print("test = ");
        System.out.println(testEquation.getResult());*/

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100.0d, 50.0d);
        equations[1] = new MathEquation('a',35.0d, 92.0d);
        equations[2] = new MathEquation('s',225.0d, 17.0d);
        equations[3] = new MathEquation('m',11.0d, 3.0d);

        for(MathEquation equation : equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
    }

        System.out.println();
        System.out.println("Using overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());//They print out a double value because of automatic conversion

        equationOverload.execute((double)leftInt, rightInt);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());//They print out a double value because of automatic conversion

    }//Main

    /*
public static MathEquation create(double leftVal, double rightVal, char opCode){
    MathEquation equation = new MathEquation();
    equation.setLeftVal(leftVal);
    equation.setRightVal(rightVal);
    equation.setOpCode(opCode);

    return equation;
        }*/


        }//Class
