package com.pluralsight.calengine;

public class Main {

    public static void main(String[] args) {

        String[] statements = {
                "divide 100.0 50.0",    // 100.0 / 50.0 = 2.0
                "add 25.0 92.0",        // 25.0 + 92.0 = 117.0
                "subtract 225.0 17.0",  // 225.0 - 17.0 = 108.0
                "multiply 11.0 3.0"     // 11.0 * 3.0 = 33.0
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements) {
            helper.process(statement);

            System.out.println(helper);
        }



        MathEquation[] mathEquations = new MathEquation[4];

        // Creates each math equation instance
        mathEquations[0] = new MathEquation('d', 100.0, 50.0);
        mathEquations[1] = new MathEquation('a', 25.0, 92.0);
        mathEquations[2] = new MathEquation('s', 225.0, 17.0);
        mathEquations[3] = new MathEquation('m', 11.0, 3.0);

        // Loops through each instance and says which one to execute
        for (MathEquation equation : mathEquations) {
            equation.execute();
            System.out.println();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for (CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.println("result=");
            System.out.println(calculator. getResult());
        }

    }

}













































    // and returns a result
//    public static MathEquation createMathEquation(double leftVal, double rightVal, char opCode) {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//
//    }


//        double val1 = 100;
//        double val2 = 0.0d;
//        double result;
//        char opCode = 'd';
//
//        if (opCode == 'a')
//            result = val1 + val2;
//        else if (opCode == 's')
//            result = val1 - val2;
//        else if (opCode == 'd')
//            result = val2 != 0.0d ? val1 / val2 : 0.0d;
//            if(val2 != 0.0d)
//                result = val1 / val2;
//            else
//                result = 0.0d;
//
//        else if (opCode == 'm')
//            result = val1 * val2;
//        else {
//            System.out.println("Error - invalid opCode");
//            result = 0.0d;
//        }
//
//        System.out.println(result);
//    }