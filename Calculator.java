import java.util.Scanner;

public class Calculator {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean modeBool = false;
        boolean operationBool = false;
        boolean addition = false;
        boolean subtraction = false;
        boolean multiplication = false;
        boolean division = false;
        boolean threeModeBool = false;
        boolean choice = false;

        OUTER: OUTER_1: OUTER_2: OUTER_3: OUTER_4: OUTER_5: OUTER_6: OUTER_7:

        while (true) {

            System.out.print("""
                    Welcome To The Calculator! Press 1 To Start:
                    """);
            System.out.print("Selection: ");
            int start = scanner.nextInt();

            if (start == 1) {
                modeBool = true;
            }

            if (modeBool == true) {
                System.out.print("""

                        Please Select Mode:
                        2 Number Mode(Enter 2) - Ex: Number1 + Number2
                        OR
                        3 Number Mode(Enter 3) - Ex: Number1 + Number2 * Number3
                        """);
                System.out.print("Selection: ");
                int mode = scanner.nextInt();
                System.out.print("\n");

                modeBool = false;

                switch (mode) {
                    case 2 -> operationBool = true;
                    case 3 -> threeModeBool = true;
                    default -> {
                        System.out.println("Error! Choice Does Not Exist!");
                        System.out.println("""
                                Would You Like To Choose Again Or End The Calculator:
                                1. Choose Again
                                2. End Calculator
                                """);
                        System.out.print("Selection: ");
                        int OUTERChooseAgain = scanner.nextInt();
                        System.out.print("\n");

                        switch (OUTERChooseAgain) {
                            case 1 -> modeBool = true;
                            case 2 -> {
                                System.out.println("You Have Ended The Calculator. Goodbye!");
                                scanner.close();
                                break OUTER;
                            }
                            default -> {

                                System.out.println("\nError! Choice Does Not Exist!");
                                System.out.println("The Calculator Has Ended. Goodbye!");
                                scanner.close();
                                break OUTER;
                            }
                        }
                    }
                }

                if (operationBool == true) {

                    System.out.println("""
                            Choose Your Operation(Enter The Corresponding Number Or The Sign In The Parentheses):
                            1. Addition(+)
                            2. Subtraction(-)
                            3. Multiplication(x)
                            4. Division(/)
                            """);
                    System.out.print("Selection: ");
                    String operation = scanner.next();

                    operationBool = false;

                    switch (operation.charAt(0)) {
                        case '1', '+' -> addition = true;
                        case '2', '-' -> subtraction = true;
                        case '3', 'x' -> multiplication = true;
                        case '4', '/' -> division = true;
                        default -> {
                            System.out.println("Error! Choice Does Not Exist!");
                            System.out.println("""
                                    Would You Like To Choose Again Or End The Calculator:
                                    1. Choose Again
                                    2. End Calculator
                                    """);
                            System.out.print("Selection: ");
                            int OUTER_1ChooseAgain = scanner.nextInt();
                            System.out.print("\n");

                            switch (OUTER_1ChooseAgain) {
                                case 1 -> modeBool = true;
                                case 2 -> {
                                    System.out.println("You Have Ended The Calculator. Goodbye!");
                                    scanner.close();
                                    break OUTER_1;
                                }
                                default -> {
                                    System.out.println("\nError! Choice Does Not Exist!");
                                    System.out.println("The Calculator Has Ended. Goodbye!");
                                    scanner.close();
                                    break OUTER_1;
                                }
                            }
                        }
                    }
                }

                if (addition == true) {

                    System.out.println("\n");
                    System.out.println("Format Ex: Number1 + Number2 \n");

                    System.out.print("Enter Number1: ");
                    double numOne = scanner.nextDouble();

                    System.out.print("Enter Number2: ");
                    double numTwo = scanner.nextDouble();

                    System.out.println("\n" + numOne + " + " + numTwo + " = " + (numOne + numTwo));

                    addition = false;

                    System.out.println("""


                            Choose Your Next Action(Enter The Corresponding Number):
                            1. Compute Another Equation
                            2. Change Operation
                            3. Change Calculator Mode
                            4. End Calculator
                            """);
                    System.out.print("Selection: ");
                    int nextAction = scanner.nextInt();
                    System.out.print("\n");

                    switch (nextAction) {
                        case 1 -> addition = true;
                        case 2 -> operationBool = true;
                        case 3 -> modeBool = true;
                        case 4 -> {
                            System.out.println("You Have Ended The Calculator. Goodbye!");
                            scanner.close();
                            break OUTER_2;
                        }
                        default -> {
                            System.out.println("Error! Choice Does Not Exist!");
                            System.out.println("""
                                    Would You Like To Choose Again Or End The Calculator:
                                    1. Choose Again
                                    2. End Calculator
                                    """);
                            System.out.print("Selection: ");
                            int Outer_2ChooseAgain = scanner.nextInt();
                            System.out.print("\n");

                            switch (Outer_2ChooseAgain) {
                                case 1 -> modeBool = true;
                                case 2 -> {
                                    System.out.println("You Have Ended The Calculator. Goodbye!");
                                    scanner.close();
                                    break OUTER_2;
                                }
                                default -> {

                                    System.out.println("\nError! Choice Does Not Exist!");
                                    System.out.println("The Calculator Has Ended. Goodbye!");
                                    scanner.close();
                                    break OUTER_2;
                                }
                            }
                        }
                    }
                }

                if (subtraction == true) {

                    System.out.println("\n");
                    System.out.println("Format Ex: Number1 - Number2 \n");

                    System.out.print("Enter Number1: ");
                    double numOne = scanner.nextDouble();

                    System.out.print("Enter Number2: ");
                    double numTwo = scanner.nextDouble();

                    System.out.println("\n" + numOne + " - " + numTwo + " = " + (numOne - numTwo));

                    subtraction = false;

                    System.out.println("""


                            Choose Your Next Action(Enter The Corresponding Number):
                            1. Compute Another Equation
                            2. Change Operation
                            3. Change Calculator Mode
                            4. End Calculator
                            """);
                    System.out.print("Selection: ");
                    int nextAction = scanner.nextInt();

                    System.out.print("\n");
                    switch (nextAction) {
                        case 1 -> subtraction = true;
                        case 2 -> operationBool = true;
                        case 3 -> modeBool = true;
                        case 4 -> {
                            System.out.println("You Have Ended The Calculator. Goodbye!");
                            scanner.close();
                            break OUTER_3;
                        }
                        default -> {
                            System.out.println("Error! Choice Does Not Exist!");
                            System.out.println("""
                                    Would You Like To Choose Again Or End The Calculator:
                                    1. Choose Again
                                    2. End Calculator
                                    """);
                            System.out.print("Selection: ");
                            int Outer_3ChooseAgain = scanner.nextInt();
                            System.out.print("\n");

                            switch (Outer_3ChooseAgain) {
                                case 1 -> modeBool = true;
                                case 2 -> {
                                    System.out.println("You Have Ended The Calculator. Goodbye!");
                                    scanner.close();
                                    break OUTER_3;
                                }
                                default -> {

                                    System.out.println("\nError! Choice Does Not Exist!");
                                    System.out.println("The Calculator Has Ended. Goodbye!");
                                    scanner.close();
                                    break OUTER_3;
                                }
                            }
                        }
                    }
                }

                if (multiplication == true) {

                    System.out.println("\n");
                    System.out.println("Format Ex: Number1 x Number2 \n");

                    System.out.print("Enter Number1: ");
                    double numOne = scanner.nextDouble();

                    System.out.print("Enter Number2: ");
                    double numTwo = scanner.nextDouble();

                    System.out.println("\n" + numOne + " x " + numTwo + " = " + (numOne * numTwo));

                    multiplication = false;

                    System.out.println("""


                            Choose Your Next Action(Enter The Corresponding Number):
                            1. Compute Another Equation
                            2. Change Operation
                            3. Change Calculator Mode
                            4. End Calculator
                            """);
                    System.out.print("Selection: ");
                    int nextAction = scanner.nextInt();
                    System.out.print("\n");

                    switch (nextAction) {
                        case 1 -> multiplication = true;
                        case 2 -> operationBool = true;
                        case 3 -> modeBool = true;
                        case 4 -> {
                            System.out.println("You Have Ended The Calculator. Goodbye!");
                            scanner.close();
                            break OUTER_4;
                        }
                        default -> {
                            System.out.println("Error! Choice Does Not Exist!");
                            System.out.println("""
                                    Would You Like To Choose Again Or End The Calculator:
                                    1. Choose Again
                                    2. End Calculator
                                    """);
                            System.out.print("Selection: ");
                            int Outer_4ChooseAgain = scanner.nextInt();
                            System.out.print("\n");

                            switch (Outer_4ChooseAgain) {
                                case 1 -> modeBool = true;
                                case 2 -> {
                                    System.out.println("You Have Ended The Calculator. Goodbye!");
                                    scanner.close();
                                    break OUTER_4;
                                }
                                default -> {

                                    System.out.println("\nError! Choice Does Not Exist!");
                                    System.out.println("The Calculator Has Ended. Goodbye!");
                                    scanner.close();
                                    break OUTER_4;
                                }
                            }
                        }
                    }
                }

                if (division == true) {

                    System.out.println("\n");
                    System.out.println("Format Ex: Number1 / Number2 \n");

                    System.out.print("Enter Number1: ");
                    double numOne = scanner.nextDouble();

                    System.out.print("Enter Number2: ");
                    double numTwo = scanner.nextDouble();

                    if (numTwo == 0) {
                        System.out.println("\nERROR! Cannot Divide By 0!");
                        System.out.println("Your Equation Cannot Be Computed!");
                        division = false;
                        modeBool = true;

                    } else {
                        System.out.println("\n" + numOne + " / " + numTwo + " = " + (numOne / numTwo));
                        division = false;
                    }

                    System.out.println("""


                            Choose Your Next Action(Enter The Corresponding Number):
                            1. Compute Another Equation
                            2. Change Operation
                            3. Change Calculator Mode
                            4. End Calculator
                            """);
                    System.out.print("Selection: ");
                    int nextAction = scanner.nextInt();
                    System.out.print("\n");

                    switch (nextAction) {
                        case 1 -> division = true;
                        case 2 -> operationBool = true;
                        case 3 -> modeBool = true;
                        case 4 -> {
                            System.out.println("You Have Ended The Calculator. Goodbye!");
                            scanner.close();
                            break OUTER_5;
                        }
                        default -> {
                            System.out.println("Error! Choice Does Not Exist!");
                            System.out.println("""
                                    Would You Like To Choose Again Or End The Calculator:
                                    1. Choose Again
                                    2. End Calculator
                                    """);
                            System.out.print("Selection: ");
                            int Outer_5ChooseAgain = scanner.nextInt();
                            System.out.print("\n");

                            switch (Outer_5ChooseAgain) {
                                case 1 -> modeBool = true;
                                case 2 -> {
                                    System.out.println("You Have Ended The Calculator. Goodbye!");
                                    scanner.close();
                                    break OUTER_5;
                                }
                                default -> {

                                    System.out.println("\nError! Choice Does Not Exist!");
                                    System.out.println("The Calculator Has Ended. Goodbye!");
                                    scanner.close();
                                    break OUTER_5;
                                }
                            }
                        }
                    }
                }

                if (threeModeBool == true) {

                    System.out.println("\nFormat Ex: Number1 + Number2 * Number3");
                    System.out.println("Format Ex: Number1 (Operation1) Number2 (Operation2) Number3 \n");

                    System.out.println("""
                            For Addition Enter: '+'
                            For Subtraction Enter '-'
                            For Multiplication Enter: 'x'
                            For Division Enter: '/'
                            """);

                    System.out.print("Enter Number1: ");
                    double numOne = scanner.nextDouble();

                    System.out.print("Enter Operation1: " +
                            "Enter the Sign: +, -, x, /: ");
                    char operationOne = scanner.next().charAt(0);

                    System.out.print("Enter Number2: ");
                    double numTwo = scanner.nextDouble();

                    System.out.print("Enter Operation1: " +
                            "Enter the Sign: +, -, x, /: ");
                    char operationTwo = scanner.next().charAt(0);

                    System.out.print("Enter Number3: ");
                    double numThree = scanner.nextDouble();

                    switch (operationOne) {

                        case '+' -> {

                            switch (operationTwo) {

                                case '+' -> {
                                    System.out.print("\n");
                                    System.out.println(
                                            numOne + " + " + numTwo + " + " + numThree + " = "
                                                    + (numOne + numTwo + numThree));
                                    threeModeBool = false;
                                    choice = true;
                                }

                                case '-' -> {
                                    System.out.print("\n");
                                    System.out.println(
                                            numOne + " + " + numTwo + " - " + numThree + " = "
                                                    + (numOne + numTwo - numThree));
                                    threeModeBool = false;
                                    choice = true;
                                }

                                case 'x' -> {
                                    System.out.print("\n");
                                    System.out.println(
                                            numOne + " + " + numTwo + " x " + numThree + " = "
                                                    + (numOne + (numTwo * numThree)));
                                    threeModeBool = false;
                                    choice = true;
                                }

                                case '/' -> {
                                    if (numThree == 0) {
                                        System.out.println("\nERROR! Cannot Divide By 0!");
                                        System.out.println("Your Equation Cannot Be Computed!");
                                        choice = true;
                                    } else {
                                        System.out.print("\n");
                                        System.out.println(numOne + " + " + numTwo + " / " + numThree + " = "
                                                + (numOne + (numTwo / numThree)));
                                        threeModeBool = false;
                                        choice = true;
                                    }
                                }
                                default -> {
                                }
                            }
                        }

                        case '-' -> {

                            if (operationTwo == '+') {
                                System.out.print("\n");
                                System.out.println(
                                        numOne + " - " + numTwo + " + " + numThree + " = "
                                                + (numOne - numTwo + numThree));
                                threeModeBool = false;
                                choice = true;

                            } else if (operationTwo == '-') {
                                System.out.print("\n");
                                System.out.println(
                                        numOne + " - " + numTwo + " - " + numThree + " = "
                                                + (numOne - numTwo - numThree));
                                threeModeBool = false;
                                choice = true;

                            } else if (operationTwo == 'x') {
                                System.out.print("\n");
                                System.out.println(
                                        numOne + " - " + numTwo + " x " + numThree + " = "
                                                + (numOne - (numTwo * numThree)));
                                threeModeBool = false;
                                choice = true;

                            } else if (operationTwo == '/') {
                                if (numThree == 0) {
                                    System.out.println("\nERROR! Cannot Divide By 0!");
                                    System.out.println("Your Equation Cannot Be Computed!");
                                    choice = true;
                                } else {
                                    System.out.print("\n");
                                    System.out.println(numOne + " - " + numTwo + " / " + numThree + " = "
                                            + (numOne - (numTwo / numThree)));
                                    threeModeBool = false;
                                    choice = true;
                                }

                            } else if (operationOne == 'x') {

                                switch (operationTwo) {

                                    case '+' -> {
                                        System.out.print("\n");
                                        System.out.println(numOne + " x " + numTwo + " + " + numThree + " = "
                                                + ((numOne * numTwo) + numThree));
                                        threeModeBool = false;
                                        choice = true;
                                    }

                                    case '-' -> {
                                        System.out.print("\n");
                                        System.out.println(numOne + " x " + numTwo + " - " + numThree + " = "
                                                + ((numOne * numTwo) - numThree));
                                        threeModeBool = false;
                                        choice = true;
                                    }

                                    case 'x' -> {
                                        System.out.print("\n");
                                        System.out.println(
                                                numOne + " x " + numTwo + " x " + numThree + " = "
                                                        + (numOne * numTwo * numThree));
                                        threeModeBool = false;
                                        choice = true;
                                    }

                                    case '/' -> {
                                        if (numThree == 0) {
                                            System.out.println("\nERROR! Cannot Divide By 0!");
                                            System.out.println("Your Equation Cannot Be Computed!");
                                            choice = true;
                                        } else {
                                            System.out.print("\n");
                                            System.out.println(numOne + " + " + numTwo + " / " + numThree + " = "
                                                    + (numOne + (numTwo / numThree)));
                                            threeModeBool = false;
                                            choice = true;
                                        }
                                    }
                                    default -> {
                                    }
                                }

                            } else if (operationOne == '/') {
                                if (numTwo == 0) {
                                    System.out.println("\nERROR! Cannot Divide By 0!");
                                    System.out.println("Your Equation Cannot Be Computed!");
                                    choice = true;

                                } else {
                                    switch (operationTwo) {

                                        case '+' -> {
                                            System.out.print("\n");
                                            System.out.println(numOne + " / " + numTwo + " + " + numThree + " = "
                                                    + ((numOne / numTwo) + numThree));
                                            threeModeBool = false;
                                            choice = true;
                                        }

                                        case '-' -> {
                                            System.out.print("\n");
                                            System.out.println(numOne + " / " + numTwo + " - " + numThree + " = "
                                                    + ((numOne / numTwo) - numThree));
                                            threeModeBool = false;
                                            choice = true;
                                        }

                                        case 'x' -> {
                                            System.out.print("\n");
                                            System.out.println(numOne + " / " + numTwo + " x " + numThree + " = "
                                                    + ((numOne / numTwo) * numThree));
                                            threeModeBool = false;
                                            choice = true;
                                        }

                                        case '/' -> {
                                            if (numThree == 0) {
                                                System.out.println("\nERROR! Cannot Divide By 0!");
                                                System.out.println("Your Equation Cannot Be Computed!");
                                                choice = true;
                                            } else {
                                                System.out.print("\n");
                                                System.out.println(numOne + " / " + numTwo + " / " + numThree + " = "
                                                        + ((numOne / numTwo) / numThree));
                                                threeModeBool = false;
                                                choice = true;
                                            }
                                        }
                                        default -> {
                                        }
                                    }
                                }
                            }
                        }
                        default -> {
                            System.out.println("Error! Choice Does Not Exist!");
                            System.out.println("""
                                    Would You Like To Choose Again Or End The Calculator:
                                    1. Choose Again
                                    2. End Calculator
                                    """);
                            System.out.print("Selection: ");
                            int Outer_6ChooseAgain = scanner.nextInt();
                            System.out.print("\n");

                            switch (Outer_6ChooseAgain) {
                                case 1 -> modeBool = true;
                                case 2 -> {
                                    System.out.println("You Have Ended The Calculator. Goodbye!");
                                    scanner.close();
                                    break OUTER_6;
                                }
                                default -> {
                                    System.out.println("\nError! Choice Does Not Exist!");
                                    System.out.println("The Calculator Has Ended. Goodbye!");
                                    scanner.close();
                                    break OUTER_6;
                                }
                            }
                        }
                    }
                }

                if (choice == true) {

                    System.out.println("""


                            Choose Your Next Action(Enter The Corresponding Number):
                            1. Compute Another Equation
                            2. Change Calcualtor Mode
                            4. End Calculator
                            """);
                    System.out.print("Selection: ");
                    int nextAction = scanner.nextInt();
                    System.out.print("\n");

                    switch (nextAction) {
                        case 1 -> threeModeBool = true;
                        case 2 -> modeBool = true;
                        case 4 -> {
                            System.out.println("You Have Ended The Calculator. Goodbye!");
                            scanner.close();
                            break OUTER_7;
                        }
                        default -> {
                            System.out.println("Error! Choice Does Not Exist!");
                            System.out.println("""
                                    Would You Like To Choose Again Or End The Calculator:
                                    1. Choose Again
                                    2. End Calculator
                                    """);
                            System.out.print("Selection: ");
                            int Outer_7ChooseAgain = scanner.nextInt();
                            System.out.print("\n");

                            switch (Outer_7ChooseAgain) {
                                case 1 -> modeBool = true;
                                case 2 -> {
                                    System.out.println("You Have Ended The Calculator. Goodbye!");
                                    scanner.close();
                                    break OUTER_7;
                                }
                                default -> {
                                    System.out.println("\nError! Choice Does Not Exist!");
                                    System.out.println("The Calculator Has Ended. Goodbye!");
                                    scanner.close();
                                    break OUTER_7;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
