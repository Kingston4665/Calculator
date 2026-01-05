import java.util.Scanner;

public class Calculator {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        //Control flags: each boolean indicates the next step the main loop should run.
        //Flags are cleared after handling to prevent unintended repetition or loops. 
        // `lastOperation` stores the id of the most recent operation so users can repeat it from the next-action menu.
        boolean startBool = false;
        boolean modeBool = false;
        boolean operationBool = false;
        boolean addition = false;
        boolean subtraction = false;
        boolean multiplication = false;
        boolean division = false;
        boolean nextActionBool = false;
        boolean threeNumberModeBool = false;
        boolean threeNumberModeNextActionBool = false;
        int lastOperation = 0; //1 = Addition, 2 = Subtraction, 3 = Multiplication, 4 = Division

        OUTER: OUTER_1: OUTER_2: OUTER_3: OUTER_4:

    //MAIN
        while (true) {

            if (!startBool) {

                System.out.print("""
                        Welcome To The Calculator! Press 1 To Start:
                        """);
                System.out.print("Selection: ");
                int start = Scanner.nextInt();
            
                if (start == 1) {

                    //Record that we've shown the welcome prompt after the 
                    //intended result then sends control to mode selection
                    startBool = true;
                    modeBool = true;
                }
            }

        //MODE SELECTION
            if (modeBool == true) {

                //modeSelection returns control codes: 
                //2 = 2 number mode, 3 = 3 number mode, -1 = retry, and -2 = end
                int modeResult = modeSelection(Scanner);
                modeBool = false; //Cleared to prevent looping until repromted by user

                //Switch handles the control codes returned by modeSelection
                switch (modeResult) {
                    case 2 -> operationBool = true;
                    case 3 -> threeNumberModeBool = true;
                    case -1 -> modeBool = true;
                    case -2 -> {
                        System.out.println("You Have Ended The Calculator. Goodbye!");
                        Scanner.close();
                        break OUTER;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        Scanner.close();
                        break OUTER;
                    }
                }
            }
            
    /* 2 NUMBER MODE */

        //OPERATION SELECTION - If 2 number mode is selected in MODE SELECTION
            if (operationBool == true) {

                //operationSelection returns an operation id (1-4) 
                //or control codes (-1 = retry, -2 = end)
                int operationResult = operationSelection(Scanner);
                operationBool = false; //Cleared to prevent looping until repromted by user

                //Switch handles the operation id or control codes returned by operationSelection
                switch (operationResult) { 
                    //lastOperation is used to repeat the operation if requested
                    case 1 -> {
                        addition = true; //To Addition
                        lastOperation = 1;
                    }
                    case 2 -> {
                        subtraction = true; //To Subtraction
                        lastOperation = 2;
                    }
                    case 3 -> {
                        multiplication = true; //To Multiplication
                        lastOperation = 3;
                    }
                    case 4 -> { 
                        division = true; //To Division
                        lastOperation = 4;
                    }
                    case -1 -> operationBool = true;
                    case -2 -> {
                        System.out.println("You Have Ended The Calculator. Goodbye!");
                        Scanner.close();
                        break OUTER_1;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        Scanner.close();
                        break OUTER_1;
                    }
                }
            }

        //ADDITION
            if (addition == true) {

                int additionResult = doAddition(Scanner);
                addition = false; //Cleared to prevent looping until repromted by user

                //doAddition returns 1 to indicate successful completion; 
                //This triggers the next action menu
                if (additionResult == 1) {
                    nextActionBool = true;
                }
            }

        //SUBTRACTION
            if (subtraction == true) {

                int subtractionResult = doSubtraction(Scanner);
                subtraction = false; //Cleared to prevent looping until repromted by user

                //doSubtraction returns 1 to indicate successful completion; 
                //This triggers the next action menu
                if (subtractionResult == 1) {
                    nextActionBool = true;
                }
            }

        //MULTIPLICATION
            if (multiplication == true) {

                int multiplicationResult = doMultiplication(Scanner);
                multiplication = false; //Cleared to prevent looping until repromted by user

                //doMultiplication returns 1 to indicate successful completion; 
                //This triggers the next action menu
                if (multiplicationResult == 1) {
                    nextActionBool = true;
                }
            }

        //DIVISION
            if (division == true) {

                int divisionResult = doDivision(Scanner);
                division = false; //Cleared to prevent looping until repromted by user

                //doDivision returns 1 to indicate successful completion; 
                //This triggers the next action menu
                if (divisionResult == 1) {
                    nextActionBool = true;
                }
            }

        //NEXT ACTION MENU - If 2 number mode is run
            if (nextActionBool == true) {

                //Prompt next-action menu; selectNextAction returns control codes: 
                //1 = repeat last operation, 2 = change operation, 3 = change mode, 4 = end, -1 = retry, and -2 = end
                int nextAction = selectNextAction(Scanner);
                nextActionBool = false; //Cleared to prevent looping until repromted by user

                //Switch handles the control codes returned by selectNextAction
                switch (nextAction) {
                    case 1 -> {
                        //Repeat the last operation (using the lastOperation int to determine which)
                        switch (lastOperation) {
                            case 1 -> addition = true;
                            case 2 -> subtraction = true;
                            case 3 -> multiplication = true;
                            case 4 -> division = true;
                            default -> {
                                System.out.println("\nSomething Weird Has Happened!");
                                System.out.println("Sending You To Pick A New Operation: \n");
                                operationBool = true;
                            }
                        }
                    }
                    case 2 -> operationBool = true;
                    case 3 -> modeBool = true;
                    case 4 -> {
                        System.out.println("You Have Ended The Calculator. Goodbye!");
                        Scanner.close();
                        break OUTER_2;
                    }
                    case -1 -> nextActionBool = true;
                    case -2 -> {
                        System.out.println("You Have Ended The Calculator. Goodbye!");
                        Scanner.close();
                        break OUTER_2;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        Scanner.close();
                        break OUTER_2;
                    }
                }
            }
        
    /* 3 NUMBER MODE */

        //Three Number Mode - If 3 number mode is selected in MODE SELECTION
            if (threeNumberModeBool == true) {

                //doThreeNumberMode returns a control code: 
                //1 = next-action, -1 = retry, -2 = end
                int threeNumberModeResult = doThreeNumberMode(Scanner);
                threeNumberModeBool = false; //Cleared to prevent looping until repromted by user

                //Switch handles the control codes returned by doThreeNumberMode
                switch (threeNumberModeResult) {
                    case 1 -> threeNumberModeNextActionBool = true;
                    case -1 -> threeNumberModeBool = true;
                    case -2 -> {
                        System.out.println("You Have Ended The Calculator. Goodbye!");
                        Scanner.close();
                        break OUTER_3;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        Scanner.close();
                        break OUTER_3;
                    }
                }
            }

        //3 Number Mode Next Action Menu - If 3 number mode is run
            if (threeNumberModeNextActionBool == true) {

                //Next-action menu for three-number mode; selectNextActionThreeNumberMode returns control codes: 
                //1 = rerun 3 number mode, 2 = change mode, 4 = end, -1 = retry, and -2 = end
                int threeNumberModeNextActionResult = selectNextActionThreeNumberMode(Scanner);
                threeNumberModeNextActionBool = false;
                switch (threeNumberModeNextActionResult) {
                    case 1 -> threeNumberModeBool = true;
                    case 2 -> modeBool = true;
                    case 4 -> {
                        System.out.println("You Have Ended The Calculator. Goodbye!");
                        Scanner.close();
                        break OUTER_4;
                    }
                    case -1 -> threeNumberModeNextActionBool = true;
                    case -2 -> {
                        System.out.println("You Have Ended The Calculator. Goodbye!");
                        Scanner.close();
                        break OUTER_4;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        Scanner.close();
                        break OUTER_4;
                    }
                }
            }
        }
    }

/* METHODS */

//MODE SELECTION METHOD
    // Returns: 2 for 2-number mode, 3 for 3-number mode, -1 to retry, and -2 to end
    private static int modeSelection(Scanner Scanner) {

        System.out.print("""

                Please Select Mode:
                2 Number Mode(Enter 2) - Ex: Number1 + Number2
                OR
                3 Number Mode(Enter 3) - Ex: Number1 + Number2 * Number3
                """);
        System.out.print("Selection: ");
        int mode = Scanner.nextInt();

        //Switch handles the user input and outputs the corresponding control code number
        switch (mode) {
            case 2 -> {
                return 2;
            }
            case 3 -> {
                return 3;
            }
            default -> {
                System.out.println("\nError! Choice Does Not Exist!");
                System.out.println("""
                        Would You Like To Choose Again Or End The Calculator:
                        1. Choose Again
                        2. End Calculator
                        """);
                System.out.print("Selection: ");
                int modeChooseAgain = Scanner.nextInt();
                System.out.print("\n");
                
                //This switch is for if they input an invalid first choice, 
                //then they can retry or end the calculator
                switch (modeChooseAgain) {
                    case 1 -> {
                        return -1;
                    }
                    case 2 -> {
                        return -2;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        return -2;
                    }
                }
            }
        }
    }

//OPERATION SELECTION METHOD
    //Returns operation id (1 = Addition, 2 = Subtraction, 3 = Multiplication, 4 = Division) 
    //or control code (-1 to retry, -2 to end)
    private static int operationSelection(Scanner Scanner) {
        System.out.println("""

                Choose Your Operation(Enter The Corresponding Number Or The Sign In The Parentheses):
                1. Addition(+)
                2. Subtraction(-)
                3. Multiplication(x)
                4. Division(/)
                """);
        System.out.print("Selection: ");
        String operation = Scanner.next();

        //Switch handles the user input and outputs the corresponding control code number
        switch (operation.charAt(0)) {
            case '1', '+' -> {
                return 1;
            }
            case '2', '-' -> {
                return 2;
            }
            case '3', 'x' -> {
                return 3;
            }
            case '4', '/' -> {
                return 4;
            }
            default -> {
                System.out.println("\nError! Choice Does Not Exist!");
                System.out.println("""
                        Would You Like To Choose Again Or End The Calculator:
                        1. Choose Again
                        2. End Calculator
                        """);
                System.out.print("Selection: ");
                int operationChooseAgain = Scanner.nextInt();
                System.out.print("\n");
                
                //This switch is for if they input an invalid first choice, 
                //then they can retry or end the calculator
                switch (operationChooseAgain) {
                    case 1 -> {
                        return -1;
                    }
                    case 2 -> {
                        return -2;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        return -2;
                    }
                }
            }
        }
    }

//ADDITION METHOD
    //Prompts for two numbers, then prints the sum. 
    //Returns 1 on successful completion to run the next action menu
    private static int doAddition(Scanner Scanner) {
        System.out.println("\n");
        System.out.println("Format Ex: Number1 + Number2 \n");

        System.out.print("Enter Number1: ");
        double numOne = Scanner.nextDouble();

        System.out.print("Enter Number2: ");
        double numTwo = Scanner.nextDouble();

        System.out.println("\n" + numOne + " + " + numTwo + " = " + (numOne + numTwo));

        return 1;
    }

//SUBTRACTION METHOD
    //Prompts for two numbers, then prints the difference.
    //Returns 1 on successful completion to run the next action menu
    private static int doSubtraction(Scanner Scanner) {
        System.out.println("\n");
        System.out.println("Format Ex: Number1 - Number2 \n");

        System.out.print("Enter Number1: ");
        double numOne = Scanner.nextDouble();

        System.out.print("Enter Number2: ");
        double numTwo = Scanner.nextDouble();

        System.out.println("\n" + numOne + " - " + numTwo + " = " + (numOne - numTwo));

        return 1;
    }

//MULTIPLICATION METHOD 
    //Prompts for two numbers, then multiplies them.
    //Returns 1 on successful completion to run the next action menu
    private static int doMultiplication(Scanner Scanner) {
        System.out.println("\n");
        System.out.println("Format Ex: Number1 x Number2 \n");

        System.out.print("Enter Number1: ");
        double numOne = Scanner.nextDouble();

        System.out.print("Enter Number2: ");
        double numTwo = Scanner.nextDouble();

        System.out.println("\n" + numOne + " x " + numTwo + " = " + (numOne * numTwo));

        return 1;
    }

//DIVISION METHOD
    //Prompts for two numbers, then divides them as long as the second number is not zero. 
    //Returns 1 on successful completion to run the next action menu
    private static int doDivision(Scanner Scanner) {
        System.out.println("\n");
        System.out.println("Format Ex: Number1 / Number2 \n");

        System.out.print("Enter Number1: ");
        double numOne = Scanner.nextDouble();

        System.out.print("Enter Number2: ");
        double numTwo = Scanner.nextDouble();

        if (numTwo == 0) {
            System.out.println("\nERROR! Cannot Divide By 0!");
            System.out.println("Your Equation Cannot Be Computed!");
        } else {
            System.out.println("\n" + numOne + " / " + numTwo + " = " + (numOne / numTwo));
        }

        return 1;
    }

//2 NUMBER SELECT NEXT ACTION METHOD
    //Returns next-action control code: 
    //1 = compute another equation, 2 = change operation, 3 = change mode, 4 = end
    public static int selectNextAction(Scanner Scanner) {

        System.out.println("""


                Choose Your Next Action(Enter The Corresponding Number):
                1. Compute Another Equation
                2. Change Operation
                3. Change Calculator Mode
                4. End Calculator
                """);
        System.out.print("Selection: ");
        int nextAction = Scanner.nextInt();

        switch (nextAction) {
            case 1 -> {
                return 1;
            }
            case 2 -> {
                return 2;
            }
            case 3 -> {
                return 3;
            }
            case 4 -> {
                return 4;
            }
            default -> {
                System.out.println("\nError! Choice Does Not Exist!");
                System.out.println("""
                        Would You Like To Choose Again Or End The Calculator:
                        1. Choose Again
                        2. End Calculator
                        """);
                System.out.print("Selection: ");
                int nextActionChooseAgain = Scanner.nextInt();
                System.out.print("\n");

                //This switch is for if they input an invalid first choice, 
                //then they can retry or end the calculator
                switch (nextActionChooseAgain) {
                    case 1 -> {
                        return -1;
                    }
                    case 2 -> {
                        return -2;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        return -2;
                    }
                }
            }
        }
    }

//3 NUMBER MODE METHOD
    //Evaluate a three-operand expression using two operators. 
    //Returns 1 on success, -1 to retry, and -2 to end
    private static int doThreeNumberMode(Scanner Scanner) {

        System.out.println("\nFormat Ex: Number1 + Number2 * Number3");
        System.out.println("Format Ex: Number1 (Operation1) Number2 (Operation2) Number3 \n");

        System.out.println("""
                For Addition Enter: '+'
                For Subtraction Enter '-'
                For Multiplication Enter: 'x'
                For Division Enter: '/'
                """);

        System.out.print("Enter Number1(Not The Operation!!): ");
        double numOne = Scanner.nextDouble();

        System.out.print("Enter Operation1: " +
                "Enter The Sign: +, -, x, /: ");
        char operationOne = Scanner.next().charAt(0);

        System.out.print("Enter Number2: ");
        double numTwo = Scanner.nextDouble();

        System.out.print("Enter Operation2: " +
                "Enter The Sign: +, -, x, /: ");
        char operationTwo = Scanner.next().charAt(0);

        System.out.print("Enter Number3: ");
        double numThree = Scanner.nextDouble();

        //This nested switch structure evaluates the expression based on the two operations provided
        switch (operationOne) {

            //If operationOne is addition:
            case '+' -> {

                //Switch handles operationTwo:
                switch (operationTwo) {

                    case '+' -> { System.out.println("\n" + numOne + " + " + numTwo + " + " + numThree + " = " + (numOne + numTwo + numThree)); }
                    case '-' -> { System.out.println("\n" + numOne + " + " + numTwo + " - " + numThree + " = " + (numOne + numTwo - numThree)); }
                    case 'x' -> { System.out.println("\n" + numOne + " + " + numTwo + " x " + numThree + " = " + (numOne + (numTwo * numThree))); }
                    case '/' -> {
                        if (numThree == 0) {
                            System.out.println("\nERROR! Cannot Divide By 0!");
                            System.out.println("Your Equation Cannot Be Computed!");
                        } else {
                            System.out.println("\n" + numOne + " + " + numTwo + " / " + numThree + " = " + (numOne + (numTwo / numThree)));
                        }
                    }
                    default -> {
                    }
                }
            }

            //If operationOne is subtraction:
            case '-' -> {

                //Switch handles operationTwo:
                switch (operationTwo) {

                    case '+' -> { System.out.println("\n" + numOne + " - " + numTwo + " + " + numThree + " = " + (numOne - numTwo + numThree)); }
                    case '-' -> { System.out.println("\n" + numOne + " - " + numTwo + " - " + numThree + " = " + (numOne - numTwo - numThree)); }
                    case 'x' -> { System.out.println("\n" + numOne + " - " + numTwo + " x " + numThree + " = " + (numOne - (numTwo * numThree))); }
                    case '/' -> {
                        if (numThree == 0) {
                            System.out.println("\nERROR! Cannot Divide By 0!");
                            System.out.println("Your Equation Cannot Be Computed!");
                        } else {
                            System.out.println("\n" + numOne + " - " + numTwo + " / " + numThree + " = " + (numOne - (numTwo / numThree)));
                        }
                    }
                    default -> {
                    }
                }
            }

            //If operationOne is multiplication:
            case 'x' -> {

                //Switch handles operationTwo:
                switch (operationTwo) {

                    case '+' -> { System.out.println(numOne + " x " + numTwo + " + " + numThree + " = " + ((numOne * numTwo) + numThree)); }
                    case '-' -> { System.out.println("\n" + numOne + " x " + numTwo + " - " + numThree + " = " + ((numOne * numTwo) - numThree)); }
                    case 'x' -> {
                        System.out.println("\n" + numOne + " x " + numTwo + " x " + numThree + " = " + (numOne * numTwo * numThree)); }
                    case '/' -> {
                        if (numThree == 0) {
                            System.out.println("\nERROR! Cannot Divide By 0!");
                            System.out.println("Your Equation Cannot Be Computed!");
                        } else {
                            System.out.println("\n" + numOne + " + " + numTwo + " / " + numThree + " = " + (numOne + (numTwo / numThree)));
                        }
                    }
                    default -> {
                    }
                }

            }

            //If operationOne is division:
            case '/' -> {

                //Throws error if trying to divide by zero
                if (numTwo == 0) {
                    System.out.println("\nERROR! Cannot Divide By 0!");
                    System.out.println("Your Equation Cannot Be Computed!");

                } else {

                    //Switch handles operationTwo:
                    switch (operationTwo) {

                        case '+' -> { System.out.println("\n" + numOne + " / " + numTwo + " + " + numThree + " = " + ((numOne / numTwo) + numThree)); }
                        case '-' -> { System.out.println("\n" + numOne + " / " + numTwo + " - " + numThree + " = " + ((numOne / numTwo) - numThree)); }
                        case 'x' -> { System.out.println("\n" + numOne + " / " + numTwo + " x " + numThree + " = " + ((numOne / numTwo) * numThree)); }
                        case '/' -> {
                            if (numThree == 0) {
                                System.out.println("\nERROR! Cannot Divide By 0!");
                                System.out.println("Your Equation Cannot Be Computed!");
                            } else {
                                System.out.println(numOne + " / " + numTwo + " / " + numThree + " = " + ((numOne / numTwo) / numThree));
                            }
                        }
                        default -> {
                        }
                    }
                }
            }

            //If operationOne is invalid:
            default -> {
                System.out.println("\nError! Choice Does Not Exist!");
                System.out.println("""
                        Would You Like To Choose Again Or End The Calculator:
                        1. Choose Again
                        2. End Calculator
                        """);
                System.out.print("Selection: ");
                int ThreeNumberModeChooseAgain = Scanner.nextInt();
                System.out.print("\n");
                
                //This switch is for if they input an invalid first choice, 
                //then they can retry or end the calculator
                switch (ThreeNumberModeChooseAgain) {
                    case 1 -> {
                        return -1;
                    }
                    case 2 -> {
                        return -2;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        return -2;
                    }
                }
            }
        }

        return 1;
    }

//3 NUMBER MODE SELECT NEXT ACTION METHOD
    //Returns next-action control codes specifically for three-number mode:
    //1 = compute another 3 number equation, 2 = change mode, 4 = end
    private static int selectNextActionThreeNumberMode(Scanner Scanner) {

        System.out.println("""


                Choose Your Next Action(Enter The Corresponding Number):
                1. Compute Another Equation
                2. Change Calcualtor Mode
                4. End Calculator
                """);
        System.out.print("Selection: ");
        int nextAction = Scanner.nextInt();
        System.out.print("\n");

        //Switch handles the user input and outputs the corresponding control code number
        switch (nextAction) {
            case 1 -> {
                return 1;
            }
            case 2 -> {
                return 2;
            }
            case 4 -> {
                System.out.println("You Have Ended The Calculator. Goodbye!");
                return 4;
            }
            default -> {
                System.out.println("Error! Choice Does Not Exist!");
                System.out.println("""
                        Would You Like To Choose Again Or End The Calculator:
                        1. Choose Again
                        2. End Calculator
                        """);
                System.out.print("Selection: ");
                int selectNextActionThreeNumberModeChooseAgain = Scanner.nextInt();
                System.out.print("\n");
                
                //This switch is for if they input an invalid first choice, 
                //then they can retry or end the calculator
                switch (selectNextActionThreeNumberModeChooseAgain) {
                    case 1 -> {
                        return -1;
                    }
                    case 2 -> {
                        System.out.println("You Have Ended The Calculator. Goodbye!");
                        return -2;
                    }
                    default -> {
                        System.out.println("\nError! Choice Does Not Exist!");
                        System.out.println("The Calculator Has Ended. Goodbye!");
                        return -2;
                    }
                }
            }
        }
    }
}
